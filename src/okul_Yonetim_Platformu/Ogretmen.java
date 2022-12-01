package okul_Yonetim_Platformu;

public class Ogretmen extends Kisi{
    private String bolum;
    private int sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyIsim, String tcNo, int yas, String bolum, int sicilNo) {
        super(isim, soyIsim, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo ;
    }
}
