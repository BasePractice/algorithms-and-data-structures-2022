package ru.mirea.practice.task4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map;
import java.util.Hashtable;
import java.util.HashMap;


public class Shop implements Completion {


    private final Map<Computer, Integer> computerList;

    public Shop() {
        computerList = new Hashtable<>(1);
    }

    @Override
    public void add() {
        try (Scanner in = new Scanner(System.in)) {
            Computer newComputer = new Computer();
            System.out.println("Enter Name: ");
            newComputer.setName(in.next());
            System.out.println("Enter Color: ");
            newComputer.setColor(in.next());
            System.out.println("Enter GraphicCard: ");
            newComputer.setGraphicCard(in.next());
            System.out.println("Enter MemoryCard: ");
            newComputer.setMemoryCard(in.next());
            System.out.println("Enter number of the Computer you want to add");
            Integer count = in.nextInt();
            computerList.put(newComputer, count);
        }
    }

    public void searchComputer(String name) {
        for (HashMap.Entry<Computer, Integer> entry : computerList.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                System.out.println("Computer Name " + entry.getKey().getName() + "  Count: " + entry.getValue());
            }
        }
    }

    public void deleteComputer(String name) {
        for (HashMap.Entry<Computer, Integer> entry : computerList.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
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

        System.out.println("Hello, Customer!");


        int answer;
        boolean boolflag = true;
        try (Scanner in = new Scanner(System.in)) {
            while (boolflag) {

                System.out.println("What do you want to do?\n"
                        + "0. Leave \n"
                        + "1.Search Computer \n "
                        + "2.Delete/Buy Computer\n "
                        + "3.Add Computer \n"
                        + "4.Show Computers\n");
                try {
                    answer = in.nextInt();
                    switch (answer) {
                        case 0: {
                            System.out.println("Buy!");
                            boolflag = false;
                            break;
                        }
                        case 1: {
                            System.out.println("Seaarching Computer");
                            searchComputer(in.next());
                            break;
                        }
                        case 2: {
                            System.out.println("Enter Name Computer  to Delete:");
                            deleteComputer(in.next());
                            break;
                        }
                        case 3: {
                            System.out.println("Adding Computer");
                            add();
                            break;
                        }
                        case 4: {
                            System.out.println("Computer list:");
                            showComputers();
                            break;
                        }
                        default: {
                            System.out.println("No such command in the program");
                            break;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("No sucsh command in the programm");
                }

            }
        }
    }
}
