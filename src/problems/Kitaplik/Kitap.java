package problems.Kitaplik;

import java.util.List;

public class Kitap {

    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;
    private int yayinYili;
    private String yayinEvi;
    private double fiyat;

    public Kitap(int ktpNo, String ktpAdi, String yzrAdi, String yynEvi, int yynYili, double fiyat){
        this.kitapNo=ktpNo;
        this.kitapAdi=ktpAdi;
        this.yazarAdi=yzrAdi;
        this.yayinEvi=yynEvi;
        this.yayinYili=yynYili;
        this.fiyat=fiyat;
    }
    public int getKitapNo() {
        return kitapNo;
    }

    @Override
    public String toString() {
        return "\nKitap No: " + this.kitapNo +
                ", KitapAdi : " + this.kitapAdi +
                ", YazarAdi : " + this.yazarAdi +
                ", YayinYili : " + this.yayinYili +
                ", YayinEvi : " + this.yayinEvi +
                ", Fiyat : " + this.fiyat ;
    }
}
