package week06;

public class Transactions {
    public static void main(String[] args) {
        // Create accounts with different constructors
        Account account1 = new Account("Kaushik Gupta", "243523", 1000.0);
        Account account2 = new Account("Chandra Pun", "231425");
        
        // Deposit and withdraw operations
        account1.deposit(500.0);
        account2.withdraw(200.0);
        
        // Display account information
        account1.display();
        System.out.println();
        account2.display();
    }
}
