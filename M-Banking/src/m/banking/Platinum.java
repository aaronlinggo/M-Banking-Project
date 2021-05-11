
package m.banking;

import java.util.Date;

public class Platinum extends Member {
    
    public Platinum(String nama, double rupiah, int noRekening, String ibuKandung, String alamat, String pin, Date tanggalLahir) {
        super(100000000, 0, 5, 50000, nama, rupiah, noRekening, ibuKandung, alamat, pin, 0, tanggalLahir);
    }
    
}
