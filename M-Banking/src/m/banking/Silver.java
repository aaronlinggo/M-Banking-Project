
package m.banking;

import java.util.Date;


public class Silver extends Member {
    
    public Silver(String nama, double rupiah, int noRekening, String ibuKandung, String alamat, String pin, Date tanggalLahir) {
        super(15000000, 0, 2, 15000, nama, rupiah, noRekening, ibuKandung, alamat, pin, 0, tanggalLahir);
    }
    
}
