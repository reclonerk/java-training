package Rahul.day01;

public class Bank {
    private String nameBank;
    private Account account;

    public Bank(String nameBank, Account account) {
        this.nameBank = nameBank;
        this.account = account;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameBank='" + nameBank + '\'' +
                ", account=" + account +
                '}';
    }
}
