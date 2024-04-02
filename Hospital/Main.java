package Hospital;

public class Main {

    public static void main(String[] args) {
        doctor doctor = new doctor("P001", "Gynecology");
        doctor.service();

        nurse nurse = new nurse("T002");
        nurse.service();

        receptionist receptionist = new receptionist("R008");
        receptionist.service();

        cleaner cleaner = new cleaner("C001");
        cleaner.service();
    }
}