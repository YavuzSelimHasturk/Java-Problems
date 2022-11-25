package sorular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C08_enYuksekVeEnDusukSicaklikDegeri {
    /*
    Bir gun icerisinde alinan bir dizi sicaklik gostergelerini giriniz.
    100 girildiginde veri girisi sonlandirilsin
    Bu degerleri girdikten sonra, gunun en sicak ve en soguk degerlerini ekrana yazdiriniz
     */

    public static void main(String[] args) {

        double sicaklikDegeri=0;
        Scanner scan=new Scanner(System.in);
        ArrayList<Double> sicaklikDegerleri = new ArrayList<>();

        while (sicaklikDegeri!=100){
            System.out.println("Lutfen sicaklik degeri giriniz");
            sicaklikDegeri= scan.nextDouble();
            sicaklikDegerleri.add(sicaklikDegeri);
        }
        System.out.println(sicaklikDegerleri);
        Collections.sort(sicaklikDegerleri);
        System.out.println("en dusuk sicaklik : " + sicaklikDegerleri.get(0));
        System.out.println("en yuksek sicaklik : " + sicaklikDegerleri.get(sicaklikDegerleri.size()-1));
    }
}
