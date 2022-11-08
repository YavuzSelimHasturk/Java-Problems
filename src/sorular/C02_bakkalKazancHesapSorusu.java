package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_bakkalKazancHesapSorusu {
    /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
  yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı, bakkalın hangi günler ortalamanın
  üstüne kazandığını, bakkalın hangi günler ortalamanın altında kazandığını göstersin...
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

        double ortalamaKazanc = toplamKazanc/haftaninGunleri.size();

        List<String> ortalamaKazancUstuGun = new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {

            if (gunlukKazanclar.get(i)>ortalamaKazanc){
                ortalamaKazancUstuGun.add(haftaninGunleri.get(i));
            }
        }
        List<String> ortalamaKazancAltiGun = new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (gunlukKazanclar.get(i)<ortalamaKazanc){
                ortalamaKazancAltiGun.add(haftaninGunleri.get(i));
            }
        }
        System.out.println(haftaninGunleri);
        System.out.println("Kazanc Listesi :\n " + haftaninGunleri +"\n\t" +gunlukKazanclar);
        System.out.println("Ortalama Kazanc : " + ortalamaKazanc);
        System.out.println("Ortalama Ustu Kazanc Gunleri : " + ortalamaKazancUstuGun);
        System.out.println("Ortalama Alti Kazanc Gunleri : " + ortalamaKazancAltiGun);
    }
}



