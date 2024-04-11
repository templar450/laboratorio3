/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author josev
 */
public abstract class Account {

    private String accountNumber;
    private double balance;
    private Client client;

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public abstract void deposit(double amount);

    public abstract void whithdraw(double amount);

    public abstract void interest(double amount);

    public abstract double interestCalculation();

    public String toString() {
        String result = "BANK ACCOUNT INFORMATION"
                + "\nAccount numbre:" + this.getAccountNumber()
                + "\nBalance:" + this.getBalance()
                + "\nAccount owner:" + this.getClient().toString()
                + "\n------------------------";
        return result;

    }

}
