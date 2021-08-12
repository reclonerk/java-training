package Rahul.day01;

public class Main {

    public static void main(String[] args) {
        // Part - 1
        Account ac = new Account("12345", 23500.0, "src", "rkauraiya1167@gmail.com", "9999999999");

        System.out.println(ac);

        double amount = 123.6;

        ac.deposit(amount);

        amount = 12;
        ac.withdraw(amount);

        // Part - 2
        Bank bank = new Bank("SBI", ac);
        bank.getAccount().deposit(45679);
        bank.getAccount().withdraw(45.90);

    }
}
