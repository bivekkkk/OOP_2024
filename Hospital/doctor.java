package Hospital;

class doctor extends Employee {
    private String specialization;

    public doctor(String empId, String specialization) {
        super(empId);
        this.specialization = specialization;
    }

    public void service() {
        System.out.println("Doctor " + getEmpid() + " specializes in " + specialization);
    }
}
