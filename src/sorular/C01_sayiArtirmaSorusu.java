package sorular;

import java.util.ArrayList;
import java.util.List;

public class C01_sayiArtirmaSorusu {

    /*
    Soru >>>>>>   Listedeki 7 ve 10 dışındaki her öğenin değerini 10'ar artırınız.
    Örnek: (18, 26, 71, 10, 15, 99 , 7) ==> Çıktı (28, 36, 81, 10 , 25 , 109 , 7)

     */

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(18);
        sayilar.add(26);
        sayilar.add(71);
        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(99);
        sayilar.add(7);

        System.out.println("Sayilar : " + sayilar);

        List<Integer> yeniSayilar = new ArrayList<>();

              for (int i :sayilar) {
                if (!(i==7 || i==10)){
                    yeniSayilar.add(i+10);
                }else

                    yeniSayilar.add(i);
        }
        System.out.println(yeniSayilar);
    }


}
