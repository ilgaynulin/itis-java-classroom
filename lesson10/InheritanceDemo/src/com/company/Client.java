package com.company;

public class Client extends User {
    private double balance;
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String address;

    public Client(String username, String password, String firstName, String secondName, String phoneNumber, String address) {
        super(username, password);
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.balance = 0.0; // бесполезная строка, потому что 0 по умолчанию
    }

    public void sayPhoneNumber() {
        System.out.println("My phone number is " + phoneNumber);
    }


    public double getBalance() {
        return balance;
    }

    public void transfer(Client fromClient, double amount) {
        if(fromClient.getBalance() < amount) {
            System.out.println("Недостаточно средств у пользователя " + fromClient.getUsername());
        }
        this.balance += amount;
        fromClient.balance -= amount;
    }
}
