//********************************************************************
//SecretTest.java       Java Foundations
//
//Demonstrates the use of a formal interface.
//********************************************************************

public class SecretTest {
  // -----------------------------------------------------------------
  // Creates a Secret object and exercises its encryption.
  // -----------------------------------------------------------------
  public static void main(String[] args) {
    // Secret hush = new Secret("Wil Wheaton is my hero!");
    Secret hush = new Secret("This is a secret message.");
    System.out.println(hush);

    hush.encrypt();
    System.out.println(hush);

    hush.decrypt();
    System.out.println(hush);

    System.out.println();

    Password pass = new Password("This is a password.");
    System.out.println(pass);

    pass.encrypt();
    System.out.println(pass);

    pass.decrypt();
    System.out.println(pass);
  }
}
