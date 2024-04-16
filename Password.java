public class Password implements Encryptable{

    private String message;
    private boolean encrypted;

    public Password(String msg) {
        message = msg;
        encrypted = false;
    }

    @Override
    public void encrypt() {

        if (!encrypted){
            char[] msg = message.toCharArray();
            String sum = "";
            
            for (int i = 0; i < msg.length; i++){
                int asc = (int) msg[i];
                String hex = Integer.toHexString(asc);
                sum += hex;
            }
            
            char[] msg1 = sum.toCharArray();
            String revsum = "";
            for (char i : msg1){
                revsum = Character.toString(i) + revsum; 
            }

            char[] msg2 = revsum.toCharArray();
            String encrypt = "";
            for (int i = 0; i < msg2.length; i += 2){
                int x = Integer.parseInt((Character.toString(msg2[i]) + Character.toString(msg2[i+1])), 16);
                encrypt += (char) x;
            }

            message = encrypt;
            encrypted = true;
        }

        else{
            System.out.println("Message already encrypted!");
        }
    }

    @Override
    public String decrypt() {
        if (encrypted){
            char[] msg = message.toCharArray();
            String sum = "";
            
            for (int i = 0; i < msg.length; i++){
                int asc = (int) msg[i];
                String hex = Integer.toHexString(asc);
                if (hex.length() == 2){
                    sum += hex;
                }
                else{
                    sum += ("0" + hex);
                }
            }
            
            char[] msg1 = sum.toCharArray();
            String revsum = "";
            for (char i : msg1){
                revsum = Character.toString(i) + revsum; 
            }

            char[] msg2 = revsum.toCharArray();
            String decrypted = "";
            for (int i = 0; i < msg2.length - 1; i += 2){
                int x = Integer.parseInt((Character.toString(msg2[i]) + Character.toString(msg2[i+1])), 16);
                decrypted += (char) x;
            }

            message = decrypted;
        }

        else{
            System.out.println("Message already decrypted!");
        }

        return message;
    }
    
    public boolean isEncrypted(){
        return encrypted;
    }

    @Override
    public String toString() {
        return message;
    }
}