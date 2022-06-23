package main.java.bankAccounts;

public class Program {

    public static void main(String[] args) {
        Account accountA = new Account("George", 13587);
        Account accountB = new Account("Petr", 12379);

        accountA.deposit(100000);
        accountA.accountStatus();
        accountA.transfer(accountB, 50000);
        accountA.accountStatus();

        accountB.accountStatus();

        accountA.transfer(accountB, 60000);
        accountA.accountStatus();
        accountB.accountStatus();

        accountA.withdraw(60000);
        accountA.accountStatus();

    }
}
