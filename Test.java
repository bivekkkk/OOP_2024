public class Test {
    //----------------------------------------------------
    //  Prints a statement.
    //----------------------------------------------------
    public static void main (String[] args)
    {
        System.out.println ("An Emergency Broadcast");
    }
}
/*
 Introduce the following errors, one at a time. Note any messages that the compiler produces. Fix the previous error each time. If no error messages are produced, be prepared to explain why.

a. Change Test to test.
-> This change will produce error because filename and class name should be
same.

b. Change Emergency to emergency.
-> No error occurs here.

c. Remove the first quotation mark in the string.
-> This change will produce a compilation error because
the compiler will interpret "An Emergency Broadcast" as
an identifier rather than a string literal.

d. Change main to man.
-> Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

e. Change println to bogus.
-> This change will produce error because there is no  such method called bogus in System class.

f. Remove the semicolon at the end of the println statement.
-> This change will produce a compilation error because
semicolons are required to terminate statements in Java.

g. Remove the last brace in the program.
This change will produce a compilation error because
it leaves the method main() unclosed. We should keep
the brace to properly close the method and the class.
*/