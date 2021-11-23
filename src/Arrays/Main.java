package Arrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123456");

    public static void main(String[] args) {
        mobilePhone.add();
        boolean quit = false;
        startPhone();
        printAction();

        while (!quit) {
            System.out.println("Press 6 to see all available actions\n Enter your action : ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Phone is shut");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    mobilePhone.addNewContact(addNewContact());
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    query();
                    break;
                case 6:
                    printAction();
                    break;

            }
        }

    }
    private static void deleteContact(){
        System.out.println("Delete Contact \n Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Phone : ");
        String phone = scanner.nextLine();
        Contact contact = new Contact(name, phone);
        mobilePhone.deleteContact(contact);
    }

    private static Contact addNewContact(){

        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Enter phone : ");
        String phone = scanner.nextLine();
        return Contact.createContact(name,phone);
    }

    private static void updateContact(){
        System.out.println("Enter existing name : ");
        String name = scanner.nextLine();
        System.out.println("Enter existing phone : ");
        String phone = scanner.nextLine();
        if (mobilePhone.queryContact(name,phone)){
            System.out.println("Contact is already Exist");
        Contact oldContact = new Contact(name,phone);
        mobilePhone.updateContact(oldContact,addNewContact());
        }
        else
            System.out.println("Contact is not in the list");

    }
    private static void startPhone() {
        System.out.println("Starting phone ....");
    }

    private static void query(){
        System.out.println("Enter name : ");
        if (mobilePhone.queryContact(scanner.nextLine()))
            System.out.println("The contact found");
        else
            System.out.println("The contact is not in the list");
    }
    private static void printAction() {
        System.out.println("Available actions: \n" +
                "0 - to shutdown \n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact\n" +
                "6 - to print a list of available actions. \n" +
                "Choose your action : ");
    }
}
