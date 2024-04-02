package week06;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor with name, account number, and initial balance
    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Constructor with just name and account number (initial balance is assumed to be zero)
    public Account(String name, String accountNumber) {
        this(name, accountNumber, 0.0); // Call the other constructor with initial balance as zero
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account if sufficient balance is available
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to display account information
    public void display() {
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}