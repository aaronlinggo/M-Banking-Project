
package m.banking;


public abstract class Member {
    protected int limitTransfer;
    protected int aturLimit;
    protected int currentUsage;
    protected int bunga;
    protected int biayaAdmin;
    protected String nama;
    protected double saldo;
    protected int noRekening;
    protected String ibuKandung;
    protected String alamat;
    protected String pin;
    protected int point;

    public Member(int limitTransfer, int aturLimit, int currentUsage, int bunga, int biayaAdmin, String nama, double saldo, int noRekening, String ibuKandung, String alamat, String pin, int point) {
        this.limitTransfer = limitTransfer;
        this.aturLimit = aturLimit;
        this.currentUsage = currentUsage;
        this.bunga = bunga;
        this.biayaAdmin = biayaAdmin;
        this.nama = nama;
        this.saldo = saldo;
        this.noRekening = noRekening;
        this.ibuKandung = ibuKandung;
        this.alamat = alamat;
        this.pin = pin;
        this.point = point;
    }

    public int getLimitTransfer() {
        return limitTransfer;
    }

    public void setLimitTransfer(int limitTransfer) {
        this.limitTransfer = limitTransfer;
    }

    public int getAturLimit() {
        return aturLimit;
    }

    public void setAturLimit(int aturLimit) {
        this.aturLimit = aturLimit;
    }

    public int getCurrentUsage() {
        return currentUsage;
    }

    public void setCurrentUsage(int currentUsage) {
        this.currentUsage = currentUsage;
    }

    public int getBunga() {
        return bunga;
    }

    public void setBunga(int bunga) {
        this.bunga = bunga;
    }

    public int getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(int biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(int noRekening) {
        this.noRekening = noRekening;
    }

    public String getIbuKandung() {
        return ibuKandung;
    }

    public void setIbuKandung(String ibuKandung) {
        this.ibuKandung = ibuKandung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
