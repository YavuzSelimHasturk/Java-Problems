package sorular;

import java.util.Scanner;

public class C13_ceviri_islemi {

    /*
       Saati saniyeye, mil'i kilometreye, kilogrami grama
       ceviren bir program yaziniz
     */
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Cevirmek istediginiz birimi seciniz : " +
                "\n1- Saat 2- Mil 3- Kilogram");
        int tercih = scan.nextInt();
        System.out.println("Cevirilecek birim degerini giriniz :");
        double deger = scan.nextDouble();

        if (tercih==1){
            cevirsaat(deger);
        } else if (tercih==2) {
            cevirMil(deger);
        } else if (tercih==3) {
            cevirKilo(deger);
        }else System.out.println("Hatali giris yaptiniz!!!");

    }
    private static double cevirKilo(double deger) {
        double gram = deger*1000;
        System.out.println("Girilen kilo degerinin ceviri karsiligi : " + gram +" gramdir.");
        return gram;
    }

    private static void cevirMil(double deger) {
        double kilometre = deger*1.6;
        System.out.println("Girilen mil degerinin ceviri karsiligi : " + kilometre+ " kilometredir.");
    }

    private static void cevirsaat(double deger) {
        double saniye = deger*3600;
        System.out.println("Girilen saat degerinin ceviri karsiligi : " + saniye+" saniyedir");
    }
}
