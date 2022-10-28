package ru.mirea.practice.task4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop implements Completion {

    private int ShopServices=-1;


    private Hashtable<Computer,Integer> ComputerList;

    public Shop(){
        ComputerList=new Hashtable<Computer, Integer>(1);
    }
    @Override
    public void add(Scanner in) {
      //  Scanner ina=new Scanner(System.in);


        System.out.println("Enter number of the Computer you want to add");
        Integer Count= in.nextInt();
        Computer NewComputer=new Computer();
        System.out.println("Enter Name: ");
        NewComputer.setName(in.next());
        System.out.println("Enter Color: ");
        NewComputer.setColor(in.next());
        System.out.println("Enter GraphicCard: ");
        NewComputer.setGraphicCard(in.next());
        System.out.println("Enter MemoryCard: ");
        NewComputer.setMemoryCard(in.next());
        ComputerList.put(NewComputer,Count);





    }

    public void SearchComputer(String Name){
        for (HashMap.Entry<Computer, Integer> entry : ComputerList.entrySet()) {
            if(entry.getKey().getName().equals(Name)){
                System.out.println("Computer Name " +entry.getKey().getName() +"  Count: " + entry.getValue());

            }
        }
    }

    public void DeleteComputer(String Name){
        for (HashMap.Entry<Computer, Integer> entry : ComputerList.entrySet()) {
            if(entry.getKey().getName().equals(Name)){
                System.out.println("Computer Name " +entry.getKey().getName() +"  Count: " + entry.getValue());
                ComputerList.remove(entry.getKey());
            }
        }
    }
    public  void ShowComputers(){
        for (HashMap.Entry<Computer, Integer> entry : ComputerList.entrySet()) {
            System.out.println("Computer Name " +entry.getKey().getName() +"  Count: " + entry.getValue());
        }
    }

    public void ShopWork(){

        System.out.println("HEllo, Customer!");


        int answer;
        boolean bool_flag=true;
        Scanner in = new Scanner(System.in);
        while(bool_flag) {

            System.out.println(
                    "What do you want to do?\n" +
                            "0. Leave\n"+
                            "1.Search Computer\n" +
                            "2.Delete/Buy Computer\n" +
                            "3.Add Computer\n" +
                            "4.Show Computers");
            try {
                answer=in.nextInt();
                switch(answer) {
                    case 0:
                        System.out.println("Buy!");
                        bool_flag=false;

                        break;

                    case 1:
                        System.out.println("Seaarching Computer");
                        SearchComputer(in.next());

                        break;

                    case 2:
                        System.out.println("Enter Name Computer  to Delete:");
                        DeleteComputer(in.next());

                        break;
                    case 3:
                        System.out.println("Adding Computer");
                        add(in);
                        break;
                    case 4:
                        System.out.println("Computer list:");
                        ShowComputers();
                        break;
                    default:
                        System.out.println("No such command in the program");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("No sucsh command in the programm");
            }



        }
        in.close();
    }

}
