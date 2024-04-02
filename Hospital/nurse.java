package Hospital;

class nurse extends Employee {
    public nurse(String empId) {
        super(empId);
    }

    public void service() {
        System.out.println("Nurse " + getEmpid() + " has patients");
    }
}