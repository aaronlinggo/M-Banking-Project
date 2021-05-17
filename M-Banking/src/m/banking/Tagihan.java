/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.banking;

/**
 *
 * @author LINGGO
 */
public class Tagihan {
    private String namaTagihan;
    private double jumlahTagihan;
    private int virtualAccount;

    public Tagihan(String namaTagihan, double jumlahTagihan, int virtualAccount) {
        this.namaTagihan = namaTagihan;
        this.jumlahTagihan = jumlahTagihan;
        this.virtualAccount = virtualAccount;
    }

    public String getNamaTagihan() {
        return namaTagihan;
    }

    public void setNamaTagihan(String namaTagihan) {
        this.namaTagihan = namaTagihan;
    }

    public double getJumlahTagihan() {
        return jumlahTagihan;
    }

    public void setJumlahTagihan(double jumlahTagihan) {
        this.jumlahTagihan = jumlahTagihan;
    }

    public int getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(int virtualAccount) {
        this.virtualAccount = virtualAccount;
    }
}
