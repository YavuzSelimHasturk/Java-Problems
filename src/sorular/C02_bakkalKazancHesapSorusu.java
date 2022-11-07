package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_bakkalKazancHesapSorusu {
    /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
  yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
  method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
  gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
  kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.(gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
             tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama
             kazanç ile karşılaştır ortalama kazançtan aşağıysa o günleri return yap.
     */
    public static void main(String[] args) {


        List<String> haftaninGunleri = new ArrayList<>();
        haftaninGunleri.add("Pazartesi");
        haftaninGunleri.add("Sali");
        haftaninGunleri.add("Carsamba");
        haftaninGunleri.add("Persembe");
        haftaninGunleri.add("Cuma");
        haftaninGunleri.add("Cumartesi");
        haftaninGunleri.add("Pazar");

        List<Double> gunlukKazanclar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int gunler=0;
        int sayac= haftaninGunleri.size();

        while (sayac>0){

            System.out.println("Her gun icin ayri ayri kazancinizi giriniz");
            System.out.println(haftaninGunleri.get(gunler));
            double gunlukKazanci = scan.nextDouble();
            gunlukKazanclar.add(gunlukKazanci);
            gunler++;
            sayac--;
        }
        double toplamKazanc= 0;

        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
                toplamKazanc+=gunlukKazanclar.get(i);
        }
        }
    }



