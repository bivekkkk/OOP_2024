package Bank;

public class Manager extends Account {

    private Account[] acc;
    
    public Manager() {
        
        acc = new Account[5];

        acc[0] = new Account("Prajjwol", 123456789, "Anamnagar", 200);
        acc[1] = new Account("Prakriti", 987654321, "Dhulikhel", 1000);
        acc[2] = new Account("Rudich", 729381029, "Dhapakhel", 20000);
        acc[3] = new Account("Freddy", 291830591, "Mercury", 1000);
        acc[4] = new Account("Adolf", 287122105, "Hitler", 18000);

    }

    public Account[] getAcc() {
        return acc;
    }


    public void display(){
        for (Account obj : acc){
            System.out.println(obj);
        }
    }

}
