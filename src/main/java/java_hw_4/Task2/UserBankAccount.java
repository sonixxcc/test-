package java_hw_4.Task2;

public class UserBankAccount {
    public static void main(String[] args) {
        BankAccount newUser = new BankAccount("000111", "Bumble Bee", 0);

        System.out.println(newUser);
        System.out.println(newUser.deposit(100));
        System.out.println(newUser.withdrawal(99.999999));
    }
}
