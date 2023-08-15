// Programmer: Marcel Rodriguez
// Date: 7/14/2023
// Class: CS &145
// Assignment 2: Phone Book
// Purpose: Serves as the entry point for running and testing the 
// Phone Book Manager. Provides a simple command-line for interacting 
// with the phone book.


import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        PhonebookManager phonebookManager = new PhonebookManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Phonebook Manager!");

        boolean running = true;
        while (running) {
            // Prompt the user for a command
            System.out.println("\nPlease enter a command: (add, delete, modify, print, exit)");
            String command = scanner.nextLine().trim();
            // Switch statement to handle different commands
            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter the contact details:");
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    phonebookManager.addEntry(firstName, lastName, address, city, phoneNumber);
                    System.out.println("Contact added successfully.");
                    break;
                case "delete":
                    System.out.print("Enter the phone number of the contact to delete: ");
                    phoneNumber = scanner.nextLine();

                    phonebookManager.deleteEntry(phoneNumber);
                    break;
                case "modify":
                    System.out.print("Enter the phone number of the contact to modify: ");
                    phoneNumber = scanner.nextLine();
                    // Search for the contact in the phone book using SearchEntry method
                    if (phonebookManager.searchEntry(phoneNumber)) {
                        System.out.println("Contact found. What would you like to modify?");
                        System.out.println("1. First Name");
                        System.out.println("2. Last Name");
                        System.out.println("3. Address");
                        System.out.println("4. City");
                        System.out.println("5. Phone Number");
                        System.out.print("Enter your choice: ");
                        int choice = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter the new value: ");
                        String newValue = scanner.nextLine();
                        
                        // Call addEntry method of PhonebookManager to modify the contact
                        phonebookManager.modifyEntry(phoneNumber, choice, newValue);
                        System.out.println("Contact modified successfully.");
                    } else {
                        System.out.println("Contact with the given phone number was not found.");
                    }
                    break;
                case "print":
                    // Print the entire phone book
                    phonebookManager.printPhonebook();
                    break;
                case "exit":
                    // Exit the program by setting running to false
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }

        System.out.println("Phonebook Manager closed.");
        scanner.close();
    }
}
