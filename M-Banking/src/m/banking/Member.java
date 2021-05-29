
package m.banking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public abstract class Member implements Serializable{
    protected int limitTransfer;
    protected int aturLimit;
    protected int currentUsage;
    protected int bunga;
    protected int biayaAdmin;
    protected String nama;
    protected double rupiah;
    protected String noRekening;
    protected String nomorHP;
    protected String alamat;
    protected String pin;
    protected int point;
    protected double euro;
    protected double usd;
    protected ArrayList<String> inbox;
    protected String tanggalLahir;
    protected String gender;
    protected ArrayList<Tagihan> myTagihan;
    protected ArrayList<String> daftarrek;
    protected int upgrade;
    protected boolean cekUpgrade;
    protected ArrayList<String> RewardBank;
    protected ArrayList<String> Mutasi;
    public Member(int limitTransfer, int currentUsage, int bunga, int biayaAdmin, String nama, double rupiah, String noRekening, String nomorHP, String alamat, String pin, int point, String tanggalLahir, String gender) {
        this.limitTransfer = limitTransfer;
        this.aturLimit = limitTransfer;
        this.currentUsage = currentUsage;
        this.bunga = bunga;
        this.biayaAdmin = biayaAdmin;
        this.nama = nama;
        this.rupiah = rupiah;
        this.noRekening = noRekening;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
        this.pin = pin;
        this.point = point;
        this.euro = 0;
        this.usd = 0;
        this.inbox = new ArrayList<>();
        this.tanggalLahir = tanggalLahir;
        this.gender = gender;
        this.myTagihan = new ArrayList<>();
        this.daftarrek = new ArrayList<>();
        this.upgrade = 0;
        this.cekUpgrade = false;
        this.RewardBank = new ArrayList<>();
    }

    public ArrayList<String> getRewardBank()
    {
        return RewardBank;
    }

    public void setRewardBank(ArrayList<String> RewardBank)
    {
        this.RewardBank = RewardBank;
    }
    
    public int randomVA(){
        int va = 0;
        do {
            va = new Random().nextInt(99999999);
            if (va >= 10000000){
                boolean cek = false;
                for (int i = 0; i < myTagihan.size(); i++) {
                    if (va == myTagihan.get(i).getVirtualAccount()){
                        cek =   true;
                    }
                }
                if (!cek){
                    break;
                }
            }
        }
        while(true);
        return va;
    }

    public int getUpgrade() {
        return upgrade;
    }

    public boolean isCekUpgrade() {
        return cekUpgrade;
    }

    public void setCekUpgrade(boolean cekUpgrade) {
        this.cekUpgrade = cekUpgrade;
    }

    public ArrayList<String> getMutasi() {
        return Mutasi;
    }

    public void setMutasi(ArrayList<String> Mutasi) {
        this.Mutasi = Mutasi;
    }
    
    
    public void setUpgrade(int upgrade) {
        this.upgrade = upgrade;
    }
    
    public ArrayList<Tagihan> getMyTagihan() {
        return myTagihan;
    }

    public void setMyTagihan(ArrayList<Tagihan> myTagihan) {
        this.myTagihan = myTagihan;
    }

    public ArrayList<String> getDaftarrek() {
        return daftarrek;
    }

    public void setDaftarrek(ArrayList<String> daftarrek) {
        this.daftarrek = daftarrek;
    }
    
    public int sizeVA(){
        return myTagihan.size();
    }
    
    public int getVA(int idx){
        return myTagihan.get(idx).getVirtualAccount();
    }
    
    public double getHargaTagihan(int idx){
        return myTagihan.get(idx).getJumlahTagihan();
    }
    
    public String getNamaTagihan(int idx) {
        return myTagihan.get(idx).getNamaTagihan();
    }
    
    public void addTagihan(String nama, double total, int va){
        this.myTagihan.add(new Tagihan(nama, total, va));
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public ArrayList<String> getInbox() {
        return inbox;
    }

    public void setInbox(ArrayList<String> inbox) {
        this.inbox = inbox;
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

    public double getRupiah() {
        return rupiah;
    }

    public void setRupiah(double rupiah) {
        this.rupiah = rupiah;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
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
