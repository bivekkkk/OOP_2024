package Hospital;

class receptionist extends Employee {
    public receptionist(String empId) {
        super(empId);
    }

    public void service() {
        System.out.println("Receptionist " + getEmpid() + " is handling reception work");
    }
}
