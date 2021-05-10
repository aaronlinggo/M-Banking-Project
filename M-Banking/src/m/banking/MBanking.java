
package m.banking;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import m.banking.Login.Login;
import m.banking.Screen.LoadingScreen;

public class MBanking {
    public ArrayList<Member> requestMember = new ArrayList<Member>();
    public ArrayList<Member> Account = new ArrayList<Member>();
    int tanggal,bulan,tahun;
    
    public MBanking(){
        LoadingScreen LS = new LoadingScreen();
        LS.setVisible(true);
        long displayMinutes=0;
        long starttime=System.currentTimeMillis();
        while(true)
        {
            double timepassed=System.currentTimeMillis()-starttime;
            double secondspassed=timepassed/1000;
            if (secondspassed >= 6){
                LS.setVisible(false);
                Login L = new Login();
//                Image icon = Toolkit.getDefaultToolkit().getImage("src/m/banking/Asset/favicon.png");
//                L.setIconImage(icon);
                L.passRequestMember(requestMember);
                L.passAccount(Account);
                L.setVisible(true);
                break;
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        new MBanking();
    }
    
}
