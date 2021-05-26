package m.banking;

public class Kurs {
    protected String nama;
    protected int kursBeli,kursBeliLama,kursJual;
    protected double persen;
    protected int min;

    public Kurs(String nama,int min,int kursBeliAwal) {
        this.nama = nama;
        this.min = min;
        this.kursBeli = kursBeliAwal;
        kursJual = kursBeli + 30;
        kursBeliLama = kursBeli;
        persen = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKursBeli() {
        return kursBeli;
    }

    public void setKursBeli(int kursBeli) {
        this.kursBeli = kursBeli;
    }

    public int getKursBeliLama() {
        return kursBeliLama;
    }

    public void setKursBeliLama(int kursBeliLama) {
        this.kursBeliLama = kursBeliLama;
    }

    public int getKursJual() {
        return kursJual;
    }

    public void setKursJual(int kursJual) {
        this.kursJual = kursJual;
    }

    
    public double getPersen() {
        return persen;
    }

    public void setPersen(double persen) {
        this.persen = persen;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void gantiHari() {
        kursBeliLama = kursBeli;
        kursBeli = (int) (Math.random()*2000) + min;
        kursJual = kursBeli + 30;
        persen = (kursBeli-kursBeliLama)*100/(kursBeliLama*1.0);
        persen = Math.round(persen*100.0)/100.0;
    }
    
}
