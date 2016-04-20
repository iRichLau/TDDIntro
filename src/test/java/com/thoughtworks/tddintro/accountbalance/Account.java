package com.thoughtworks.tddintro.accountbalance;

public class Account {
    private int balance;

    public Account(int initialAmount) {
        this.balance = initialAmount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
}
