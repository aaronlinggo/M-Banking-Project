
package m.banking;

import java.util.Date;


public class Gold extends Member {
    
    public Gold(String nama, double rupiah, int noRekening, String nomorHP, String alamat, String pin, Date tanggalLahir, String gender) {
        super(50000000, 0, 3, 30000, nama, rupiah, noRekening, nomorHP, alamat, pin, 0, tanggalLahir, gender);
    }
    
}
