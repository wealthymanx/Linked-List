// Programmer: Marcel Rodriguez
// Date: 7/14/2023
// Class: CS &145
// Assignment 2: Phone Book
// Purpose: ListNode represents a single node in the phone book.

import java.util.*;

public class ListNode {
    // Private fields to hold contact details
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phoneNumber;
    // Reference to the next node in the linked list
    private ListNode next;

    // Constructor to initialize the node with contact details
    public ListNode(String firstName, String lastName, String address, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters to access and modify contact details

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
