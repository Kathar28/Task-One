package main.java.bankAccounts;

public class Account {

    private final String ownerName;
    private final int accountNumber;
    private double balance;

    public Account(String ownerName, int accountNumber) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        if (balance > value) {
            balance -= value;
        } else {
            System.out.println("У вас не достаточно средств для вывода средств");
        }
    }

    public void transfer(Account to, double valueToTransfer) {
        if (balance > 0 || balance > valueToTransfer) {
            balance -=valueToTransfer;
            to.balance += valueToTransfer;
        } else {
            System.out.println("На счёту (" + accountNumber + ") не достаточно средств для перевода");
        }
    }

    public void accountStatus() {
        System.out.println("\n Аккаунт №" + accountNumber +
                "\n Имя владельца: " + ownerName +
                "\n Баланс: " + balance +
                "\n");
    }

}
