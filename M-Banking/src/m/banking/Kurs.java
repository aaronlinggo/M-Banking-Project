package m.banking;

public class Kurs {
    protected String nama;
    protected int kurs,kursLama;
    protected double persen;
    protected int min;

    public Kurs(String nama,int min) {
        this.nama = nama;
        this.min = min;
        kurs = (int) (Math.random()*2000)+min;
        kursLama = kurs;
        persen = (kurs-kursLama)*100/(kursLama*1.0);
        persen = Math.round(persen*100.0)/100.0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getKursLama() {
        return kursLama;
    }

    public void setKursLama(int kursLama) {
        this.kursLama = kursLama;
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
        kursLama = kurs;
        kurs = (int) (Math.random()*2000)+min;
        persen = (kurs-kursLama)*100/(kursLama*1.0);
        persen = Math.round(persen*100.0)/100.0;
    }
}
