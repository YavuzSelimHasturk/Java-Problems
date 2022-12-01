package okul_Yonetim_Platformu;

public class Kisi {
    private String isim;
    private String soyIsim;
    private String tcNo;
    private int yas;

    public Kisi() {
    }

    public Kisi(String isim, String soyIsim, String tcNo, int yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", soyIsim='" + soyIsim + '\'' +
                        ", tcNo='" + tcNo + '\'' +
                        ", yas=" + yas ;
    }
}
