//Programmer: Marcel Rodriguez
//Date: 7/14/2023
//Class: CS &145
//Assignment 2: Phone Book
//Purpose: Manages the phone book operations, such as adding, deleting, 
//modifying, and printing contacts.

import java.util.*;

public class PhonebookManager {
    private ListNode head;

    // Constructor
    public PhonebookManager() {
        head = null;
    }

    // Add a new entry to the beginning of the phone book
    public void addEntry(String firstName, String lastName, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        newNode.setNext(head);
        head = newNode;
    }

    // Search for an entry with a given phone number
    public boolean searchEntry(String phoneNumber) {
        ListNode current = head;
        while (current != null) {
            if (current.getPhoneNumber().equals(phoneNumber)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // Delete an entry with a given phone number
    public void deleteEntry(String phoneNumber) {
        if (head == null) {
            return;
        }

        if (head.getPhoneNumber().equals(phoneNumber)) {
            head = head.getNext();
            return;
        }

        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            if (current.getPhoneNumber().equals(phoneNumber)) {
                previous.setNext(current.getNext());
                return;
            }
            previous = current;
            current = current.getNext();
        }
    }

    // Modify an entry with a given phone number
    public void modifyEntry(String phoneNumber, int choice, String newValue) {
        ListNode current = head;
        while (current != null) {
            if (current.getPhoneNumber().equals(phoneNumber)) {
                switch (choice) {
                    case 1:
                        current.setFirstName(newValue);
                        break;
                    case 2:
                        current.setLastName(newValue);
                        break;
                    case 3:
                        current.setAddress(newValue);
                        break;
                    case 4:
                        current.setCity(newValue);
                        break;
                    case 5:
                        current.setPhoneNumber(newValue);
                        break;
                    default:
                        System.out.println("Invalid choice. No modifications were made.");
                        return;
                }
                System.out.println("Contact modified successfully.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Contact with the given phone number was not found.");
    }

    // Print the entire phone book
    public void printPhonebook() {
        ListNode current = head;
        while (current != null) {
            System.out.println("Name: " + current.getFirstName() + " " + current.getLastName());
            System.out.println("Address: " + current.getAddress());
            System.out.println("City: " + current.getCity());
            System.out.println("Phone Number: " + current.getPhoneNumber());
            System.out.println();
            current = current.getNext();
        }
    }
}