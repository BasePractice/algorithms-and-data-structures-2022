package ru.mirea.practice.task4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop implements Completion {


    private final Hashtable<Computer, Integer> computerList;

    public Shop() {
        computerList = new Hashtable<>(1);
    }

    @Override
    public void add(Scanner in) {
        System.out.println("Enter number of the Computer you want to add");
        Integer Count = in.nextInt();
        Computer newComputer = new Computer();
        System.out.println("Enter Name: ");
        newComputer.setName(in.next());
        System.out.println("Enter Color: ");
        newComputer.setColor(in.next());
        System.out.println("Enter GraphicCard: ");
        newComputer.setGraphicCard(in.next());
        System.out.println("Enter MemoryCard: ");
        newComputer.setMemoryCard(in.next());
        computerList.put(newComputer, Count);


    }

    public void SearchComputer(String Name) {
        for (HashMap.Entry<Computer, Integer> entry : computerList.entrySet()) {
            if (entry.getKey().getName().equals(Name)) {
                System.out.println("Computer Name " + entry.getKey().getName() + "  Count: " + entry.getValue());
            }
        }
    }

    public void DeleteComputer(String Name) {
        for (HashMap.Entry<Computer, Integer> entry : computerList.entrySet()) {
            if (entry.getKey().getName().equals(Name)) {
                System.out.println("Computer Name " + entry.getKey().getName() + "  Count: " + entry.getValue());
                computerList.remove(entry.getKey());
            }
        }
    }

    public void showComputers() {
        for (HashMap.Entry<Computer, Integer> entry : computerList.entrySet()) {
            System.out.println("Computer Name " + entry.getKey().getName() + "  Count: " + entry.getValue());
        }
    }

    public void shopWork() {

        System.out.println("HEllo, Customer!");


        int answer;
        boolean bool_flag = true;
        Scanner in = new Scanner(System.in);
        while (bool_flag) {

            System.out.println(
                    """
                            What do you want to do?
                            0. Leave
                            1.Search Computer
                            2.Delete/Buy Computer
                            3.Add Computer
                            4.Show Computers""");
            try {
                answer = in.nextInt();
                switch (answer) {
                    case 0 -> {
                        System.out.println("Buy!");
                        bool_flag = false;
                    }
                    case 1 -> {
                        System.out.println("Seaarching Computer");
                        SearchComputer(in.next());
                    }
                    case 2 -> {
                        System.out.println("Enter Name Computer  to Delete:");
                        DeleteComputer(in.next());
                    }
                    case 3 -> {
                        System.out.println("Adding Computer");
                        add(in);
                    }
                    case 4 -> {
                        System.out.println("Computer list:");
                        showComputers();
                    }
                    default -> System.out.println("No such command in the program");
                }
            } catch (InputMismatchException e) {
                System.out.println("No sucsh command in the programm");
            }


        }
        in.close();
    }

}
