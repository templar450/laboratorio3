/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author josev
 */
public class SavingAccount extends Account {

    private String starDate;
    private int monthsNumber;
    private float interest;

    public SavingAccount(String starDate, int monthsNumber, float interest, String accountNumber,
            double balance, Client client) {
        super(accountNumber, balance, client);
        this.starDate = starDate;
        this.monthsNumber = monthsNumber;
        this.interest = interest;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public int getMonthsNumber() {
        return monthsNumber;
    }

    public void setMonthsNumber(int monthsNumber) {
        this.monthsNumber = monthsNumber;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(getBalance() + amount);
    }

    @Override
    public void whithdraw(double amount) {
        super.setBalance(interestCalculation() + amount);
    }

    @Override
    public void interest(double amount) {
        super.setBalance(getBalance() + amount);
    }

    @Override
    public double interestCalculation() {
        double interestTotal = 1.0;
        interestTotal = this.getInterest() * super.getBalance() + super.getBalance();
        return interestTotal;
    }

    public String toString() {
        String result = "\n ACCOUNT TYPE: SAVING ACCOUNT"
                + "\nSaving start date:" + this.getStarDate()
                + "\nMonths:" + this.getMonthsNumber()
                + "\nInterest:" + this.getInterest()
                + "\nInterest you got:" + this.getInterest() * super.getBalance()
                + "\nStart Date+ Interes won:" + this.interestCalculation();
        return super.toString() + result;

    }

}
