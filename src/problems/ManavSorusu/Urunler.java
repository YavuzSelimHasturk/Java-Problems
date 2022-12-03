package problems.ManavSorusu;

import java.util.Map;
import java.util.TreeMap;

public class Urunler {
    public static Map<String,Integer> urunMap(){

        Map<String,Integer> urunler =new TreeMap();
        urunler.put("elma",50);
        urunler.put("armut",30);
        urunler.put("muz",150);
        urunler.put("nar",75);
        urunler.put("mandalina",35);

        return urunler;
    }
    public static double genelTutar(String urunSecim, double kiloSecim) {
        Map<String,Integer> urunler= Urunler.urunMap();

        double toplam=0;
        switch (urunSecim){
            case "elma" :
                toplam+=kiloSecim*urunler.get("elma");
                break;

            case "armut" :
                toplam+=kiloSecim*urunler.get("armut");
                break;

            case "muz" :
                toplam+=kiloSecim*urunler.get("muz");
                break;

            case "nar" :
                toplam+=kiloSecim*urunler.get("nar");
                break;

            case "mandalina" :
                toplam+=kiloSecim*urunler.get("mandalina");
                break;

            default:
                System.out.println("Hatali giris yaptiniz.Boyle bir urun bulunmamaktadir...");
        }
        return toplam;
    }
}
