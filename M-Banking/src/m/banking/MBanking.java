
package m.banking;

import java.util.concurrent.TimeUnit;
import m.banking.Login.Login;
import m.banking.Screen.LoadingScreen;

public class MBanking {

    public static int WIDTH = 650;
    public static int HEIGHT = 900;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        LoadingScreen LS = new LoadingScreen();
        LS.setVisible(true);
        long displayMinutes=0;
        long starttime=System.currentTimeMillis();
        while(true)
        {
            
            double timepassed=System.currentTimeMillis()-starttime;
            double secondspassed=timepassed/1000;
            System.out.println(secondspassed);
            if (secondspassed >= 7.3){
                LS.setVisible(false);
                Login L = new Login();
                L.setVisible(true);
                break;
            }
        }
    }
    
}
