
package m.banking;

import java.util.Date;


public class Silver extends Member {
    
    public Silver(String nama, double rupiah, String noRekening, String nomorHP, String alamat, String pin, String tanggalLahir, String gender) {
        super(15000000, 0, 2, 15000, nama, rupiah, noRekening, nomorHP, alamat, pin, 0, tanggalLahir, gender);
    }
    
}
