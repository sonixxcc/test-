package java_hw_4.Task2;

public class BankAccount {
    public String accountNumber;
    public String userName;
    private double balance;

    public BankAccount(String accountNumber, String userName, double balance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double depositAmount) {
        balance = balance + depositAmount;
        return balance;
    }

    public double withdrawal(double withdrawalAmount) {

        if (withdrawalAmount < balance) {
            balance = balance - withdrawalAmount;
            return balance;
        } else {
            System.out.println("Withdrawal is not possible. Your current balance is :  ");
            return balance;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}