package Bank;

public class BankAccount {
    private double balance = 0;
    private String username;
    private static long next = 10000000;
    private long accountNumber;
    private static int NumberOfAccounts = 0;

    public BankAccount() {
        this(0.0);
    }

    public BankAccount(double amount) {
        this("Anonymous", amount);
    }

    public BankAccount(String name, double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        this.username = name;
        this.accountNumber = next;
        next++;
        NumberOfAccounts += 1;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public String getUsername() {
        return username;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public double withdraw(double amount) {
        if ((amount > 0) && (this.balance >= amount)) {
            this.balance -= amount;
            System.out.println("Remaining Balance : " + this.balance);
            return amount;
        } else {
            System.out.println("Insuffiecient balance!");
            return 0;
        }
    }

    public void transfer(BankAccount to, double amount) {
        if (amount > 0 && this.balance >= amount) {
            to.deposit(amount);
            this.withdraw(amount);
            System.out.println(this.username + "'s $" + amount + " is transferred to account : " + to.accountNumber);
        } else {
            System.out.println(
                    this.username + " : " + this.accountNumber + " doesn't have sufficient funds to transfer funds!");
        }
    }

    public static void showTotalAccounts() {
        System.out.println(NumberOfAccounts);
    }

    public void showAccNumber() {
        System.out.println(this.accountNumber);
    }

}
