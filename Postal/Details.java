package Postal;

public class Details extends PostOffice{
    
    PostOffice[] po;

    Details() {

        po = new PostOffice[6];

        po[0] = new PostOffice("Prajjwol\tBhattarai", "3926");
        po[1] = new PostOffice("Freddie\tMercury", "4212");
        po[2] = new PostOffice("Rudich\tChantel", "7634");
        po[3] = new PostOffice("Alfi\tAfli", "6612");
        po[4] = new PostOffice("Veda\tBakhra", "9941");

    } 

    public PostOffice getPo(int x) {
        return po[x];
    }

    public void setPo(String fn, String ln, String pc) {
        String name = fn + "\t" + ln;
        po[5] = new PostOffice(name, pc);
    }


    public void display() {
        for (PostOffice obj : po) {
            System.out.println(obj);
        }
    }

}