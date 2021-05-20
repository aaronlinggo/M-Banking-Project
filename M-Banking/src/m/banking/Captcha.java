
package m.banking;

import java.util.Random;

public class Captcha {
    public String isiCaptcha() {
        Random rand = new Random();
        int length = 5;
        String hasil = "";
        for (int i = 0; i < length; i++) {
            int random = rand.nextInt(60);
            int charNumber = 0;
            if (random < 26) {
                //huruf kecil
                charNumber = 65 + random;
            } else if (random < 52){
                //huruf besar
                charNumber = 97 + (random - 26);
            } else {
                //angka
                charNumber = 48 + (random - 52);
            }
            hasil = hasil + (char)charNumber;
        }
        return hasil;
    } 
}
