package okul_Yonetim_Platformu;

public class Ogrenci extends Kisi{
    private String sinif;
    private int ogrNo;

    public Ogrenci() {
    }

    public Ogrenci(String isim, String soyIsim, String tcNo, int yas, String sinif, int ogrNo) {
        super(isim, soyIsim, tcNo, yas);
        this.sinif = sinif;
        this.ogrNo = ogrNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }



    @Override
    public String toString() {
        return super.toString() +
                ", sinif='" + sinif + '\'' +
                ", ogrNo=" + ogrNo ;
    }
}
