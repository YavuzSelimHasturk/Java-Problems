package problems.ManavSorusu;

import java.util.Scanner;

public class Manav {
    /*
    Basit bir 5 ürünlü manav alisveris programi yaziniz.

 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
 * 2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
             goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar devam ettir

     */
    public static void main(String[] args) {

        System.out.println("Manavda mevcut urunler : \n" +Urunler.urunMap());

        boolean deger = true;
        double toplam=0;

        while(deger) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Ne almak istersiniz? : ");
            String urunSecim = scan.nextLine();

            System.out.println("Ne kadar " +urunSecim+ " almak istersiniz? :");
            double kiloSecim=scan.nextDouble();

            double genelTutar = Urunler.genelTutar(urunSecim,kiloSecim);

            System.out.println("Baska bir urun isteginiz var midir? (E/H) : ");
            String cevap =scan.next();

            if (cevap.equalsIgnoreCase("H")){
                toplam+=genelTutar;
                deger=false;
            } else if (cevap.equalsIgnoreCase("E")) {
                toplam+=genelTutar;
            }else {
                System.out.println("Hatali giris yaptiniz...");
            }
            System.out.println("Genel ucret toplami : " + toplam);
        }
    }
}
