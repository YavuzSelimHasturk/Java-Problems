package problems.Kitaplik;

import java.util.List;

public class Kitap {

    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;
    private int yayinYili;
    private String yayinEvi;
    private double fiyat;

    public Kitap (int ktpNo, String ktpAdi, String yzrAdi, String yynEvi, int yynYili,double fiyat){
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

    public static List<Kitap> kitaplar(List<Kitap> kitaplar){

        int kitapNo = 1000;
        Kitap kitap1= new Kitap(kitapNo,"Savas ve Baris" , "Tolstoy" , "Is bankasi", 2017,150);
        Kitapci.kitaplar.add(kitap1);
        Kitap kitap2= new Kitap(++kitapNo,"Germinal", "Emile Zola", "Is Bankasi", 2018, 90);
        Kitapci.kitaplar.add(kitap2);
        Kitap kitap3= new Kitap(++kitapNo, "Suc ve Ceza", "Dostoyevski", "Is Bankasi", 2020, 135);
        Kitapci.kitaplar.add(kitap3);
        Kitap kitap4= new Kitap(++kitapNo, "Masumiyet Muzesi", "Orhan Pamuk", "Yapi Kredi Yayinlari", 2016, 100 );
        Kitapci.kitaplar.add(kitap4);
        Kitap kitap5= new Kitap(++kitapNo, "Ince Memed", "Yasar Kemal", "Yapi Kredi Yayinlari", 2018,250);
        Kitapci.kitaplar.add(kitap5);

        return kitaplar;
    }

    public static class Kitapci_Map {
    }
}
