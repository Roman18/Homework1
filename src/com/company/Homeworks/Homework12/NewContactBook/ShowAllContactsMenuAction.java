package com.company.Homeworks.Homework12.NewContactBook;



import java.util.Scanner;

public class ShowAllContactsMenuAction implements MenuAction {
    private Scanner scanner;
    private ContactService cs;
    public ShowAllContactsMenuAction(Scanner sc, ContactService cs) {
        this.scanner = sc;
        this.cs=cs;
    }

    @Override
    public void doAction() {
        while (true) {
            System.out.println("Contacts from list in memory:");
            System.out.println(cs.getAll());
            if (!closeAfter()){
                break;
            }
        }
    }

    @Override
    public String getName() {
        return "Show contacts";
    }

    @Override
    public boolean closeAfter() {
        System.out.println("Do you want to continue this operation? Y/n");
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
