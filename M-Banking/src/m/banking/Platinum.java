
package m.banking;

import java.util.Date;

public class Platinum extends Member {
    
    public Platinum(String nama, double rupiah, String noRekening, String nomorHP, String alamat, String pin, String tanggalLahir, String gender) {
        super(100000000, 0, 5, 50000, nama, rupiah, noRekening, nomorHP, alamat, pin, 0, tanggalLahir, gender);
    }
    
}
