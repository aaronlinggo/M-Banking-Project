package m.banking;

import java.io.Serializable;

public class Merchandise implements Serializable
{
    private String namaMerchandise;
    private int point;

    public Merchandise(String namaMerchandise, int point) {
        this.namaMerchandise = namaMerchandise;
        this.point = point;
    }

    public String getNamaMerchandise() {
        return namaMerchandise;
    }

    public void setNamaMerchandise(String namaMerchandise) {
        this.namaMerchandise = namaMerchandise;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    
}
