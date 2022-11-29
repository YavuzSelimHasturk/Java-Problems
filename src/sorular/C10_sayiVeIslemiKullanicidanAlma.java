package sorular;

import java.util.Scanner;

public class C10_sayiVeIslemiKullanicidanAlma {
    /*
  Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
  dort islemden biri ile isleme koyup sonucu yazdirin
 */

    static Scanner scan = new Scanner(System.in);
    static double sayi1;
    static double sayi2;

    public static void main(String[] args) {
        scanner();
    }
    public static void scanner(){
        System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        dortIslem();
    }
        public static void dortIslem(){
            System.out.println("Yapmak istediginiz islem turunu seciniz : " +
                    "\n1- (+) \n2- (-) \n3- (*) \n4- (/) ");
            int yapilacakIslem = scan.nextInt();

        if (yapilacakIslem<1 || yapilacakIslem>4){
            System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz : ");
            dortIslem();
        }
        if (yapilacakIslem==1){
            System.out.println("Girdiginiz sayilarin toplami : " + (sayi1+sayi2));
        } else if (yapilacakIslem==2) {
            System.out.println("Girdiginiz sayilarin farki : " + (sayi1-sayi2));
        } else if (yapilacakIslem==3){
            System.out.println("Girdiginiz sayilarin carpimi : " + (sayi1*sayi2));
        } else if (yapilacakIslem==4){
            System.out.println("Girdiginiz sayilarin bolumu : " + (sayi1/sayi2));
        }
            System.out.println("Yeni islem yapmak icin 1'e basiniz");
            int sayi3= scan.nextInt();
            if (sayi3==1) {
                scanner();
            } else {
                System.out.println("Islem sonlandirildi. Iyi gunler dileriz");
            }
    }
}