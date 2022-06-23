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
        if (balance < value) {
            System.out.println("У вас не достаточно средств для вывода средств");
        } else {
            balance -= value;
        }
    }

    public void transfer(Account to, double valueToTransfer) {
        if (balance < 0 || balance < valueToTransfer) {
            System.out.println("На счёту (" + accountNumber + ") не достаточно средств для перевода");
        } else {
            withdraw(valueToTransfer);
            to.deposit(valueToTransfer);
        }
    }

    public void accountStatus() {
        System.out.println("\n Аккаунт №" + accountNumber +
                "\n Имя владельца: " + ownerName +
                "\n Баланс: " + balance +
                "\n");
    }

}
