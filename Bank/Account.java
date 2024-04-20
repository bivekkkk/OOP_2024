package Bank;

public class Account {

    protected String name, address;
    protected int acn;
    protected double balance;

    private void interest() {
        balance -= (balance * 3/100);
    }

    public Account() {}

    public Account(String name, int acn, String address, double balance) {
        this.name = name;
        this.acn = acn; 
        this.address = address;
        this.balance = balance;
    }

    public void deposit(double money) {
        if (money >= 0) {
            balance += money;
        }

        else {
            System.out.println("Cannot deposit negative numbers!");
        }
    }

    public void withdraw(double money) {
        if (money < (balance - (0.03 * balance))){
            interest();
            balance -= money;
        }

        else{
            System.out.println("Not enough balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "\nName: " + name + "\nAccount number: " + acn + "\nAddress: " + address + "\nBalance: " + balance;
    }

}
