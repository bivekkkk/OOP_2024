package Hospital;

class cleaner extends Employee {
    public cleaner(String empId) {
        super(empId);
    }

    public void service() {
        System.out.println("Cleaner " + getEmpid() + " is sweeping");
    }
}