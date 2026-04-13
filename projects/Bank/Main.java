package Bank;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(1300.0);

        account1.withdraw(120.0);
        account2.withdraw(500);
        account1.deposit(150);

        BankAccount account3 = new BankAccount();

        BankAccount.showTotalAccounts();

        System.out.println(account3.getBalance());

        account3.deposit(650);

        account1.transfer(account3, 500);
        System.out.println(account1.getUsername() + " 's balance: " + account1.getBalance());
        System.out.println(account2.getUsername() + " 's balance: " + account2.getBalance());
        System.out.println(account3.getUsername() + " 's balance: " + account3.getBalance());

    }
}
