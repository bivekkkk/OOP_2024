package Postal;

public class PostOffice {

    private String name, postalCode;

    public PostOffice() {}

    public PostOffice(String name, String postalCode) {

        this.name = name;
        this.postalCode = postalCode;

    }

    @Override
    public String toString() {
        String fn = name.split("\t")[0];
        String ln = name.split("\t")[1];
        return "\nFirst name: " + fn + "\nLast name: " + ln + "\nPostal Code: " + postalCode;
    }
}
