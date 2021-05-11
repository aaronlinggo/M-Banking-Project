
package m.banking;

import java.util.Date;


public class Gold extends Member {
    
    public Gold(String nama, double rupiah, int noRekening, String ibuKandung, String alamat, String pin, Date tanggalLahir) {
        super(50000000, 0, 3, 30000, nama, rupiah, noRekening, ibuKandung, alamat, pin, 0, tanggalLahir);
    }
    
}
