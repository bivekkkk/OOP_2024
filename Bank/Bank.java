package Bank;

public class Bank {

    public static void main(String[] args) {
        
        Manager obj = new Manager();
        Account[] vals = obj.getAcc();
        vals[0].deposit(200);
        vals[0].withdraw(100);
        vals[1].setAddress("Mars");
        obj.display();
    }
    
}
