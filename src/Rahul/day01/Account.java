package Rahul.day01;

public class Account {
    private  String accountNumber;
    private  double balance;
    private  String customerName;
    private  String email;
    private  String phone_number;

    public Account(String accountNumber, double balance, String customerName, String email, String phone_number) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Updated Balance is : " + balance);
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Updated Balance is : " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
