//********************************************************************
//Firm.java       Java Foundations
//
//Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm {
  // -----------------------------------------------------------------
  // Creates a staff of employees for a firm and pays them.
  // -----------------------------------------------------------------
  public static void main(String[] args) {
    Staff personnel = new Staff();

    personnel.payday();

    Employee emp = new Executive("David", "London", "9819965626", "278654908", 19);
    System.out.println();
    System.out.println(emp);
    System.out.println(emp.vacation());

    emp = new Hourly("Ned", "Texas", "123021157", "456342560", 7);
    System.out.println();
    System.out.println(emp);
    System.out.println(emp.vacation());

    StaffMember vol = new Volunteer("Donald", "California", "4876213088");
    System.out.println();
    System.out.println(vol);
    System.out.println(vol.vacation());
  }
}
