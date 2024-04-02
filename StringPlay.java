public class StringPlay {
    public static void main(String[] args) {
        String college = new String("Leeds Beckett University "); // part (a)

        String town = " Leeds, UK"; // part (a)

        int stringLength = college.length(); // part (b)

        System.out.println(college + " contains " + stringLength + " characters.");

        String change1 = college.toUpperCase(); // part (c)

        String change2 = change1.replace('E', '*'); // part (d)

        String change3 = college.concat(town); // part (e)

        System.out.println("The final string is " + change3);
    }
}
