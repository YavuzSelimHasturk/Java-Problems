package problems;

import java.util.Scanner;

public class ATMSorusu2 {
    /*
    Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
    eger değilse menü ekranina geri donsun.
    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */

    final static String kartNo = "159574562588624";
    static Scanner scan= new Scanner(System.in);
    static String sifre ="1457";
    static double bakiye = 13000;

    public static void main(String[] args) {
        giris();
    }
    private static void giris() {
        System.out.println("KART NUMARANIZI GIRINIZ : ");
        String kKartno=scan.nextLine();
        System.out.println("SIFRE GIRINIZ : ");
        String kSifre= scan.next();
        kKartno=kKartno.replaceAll("\\s","" );

        if (kSifre.equals(sifre)&&kKartno.equals(kartNo)){menu();
        }else {
            System.out.println("YANLIS GIRIS YAPILDI");
            giris();
        }
    }
    private static void menu() {
        System.out.println("******* JAVABANKA HOSGELDİNİZ*********\n" +
                "YAPMAK İSTEDİGİNİZ İSLEMİ SECİNİZ\n" +
                "1. BAKIYE SORGULAMA\n"+
                "2. PARA YATIRMA \n" +
                "3. PARA CEKME\n" +
                "4. PARA GONDERME\n" +
                "5. SIFRE DEGISTIRME\n"+
                "6. CIKIS");

        int secim= scan.nextInt();
        switch (secim){
            case 1 :{bakiyeSorgula();}
            case 2 :{
                System.out.println("YATIRILACAK MIKTARI GIRINIZ : ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);}
            case 3 :{
                System.out.println("CEKİLECEK MIKTARI GIRINIZ : ");
                double miktar = scan.nextDouble();
                paraCekme(miktar);}
            case 4 :{
                System.out.println("IBAN NO GIRINIZ : ");
                String iban = scan.nextLine();
                scan.nextLine();
                System.out.println("GONDERILECEK MIKTARI GIRINIZ : ");
                double miktar = scan.nextDouble();
                paraGonderme(ibanKontrol(iban),miktar);}
            case 5 :{
                sifreDegistir();}
            case 6 :{
                System.out.println("**********HOSCAKALIN**********");
                System.exit(0);}
        }
    }
    private static void sifreDegistir() {
        System.out.println("ESKI SIFRENIZI GIRINIZ : ");
        String kSifre = scan.next();
        if (kSifre.equals(sifre)){
            System.out.println("YENI SIFRE GIRINIZ : ");
            sifre = scan.next();
            scan.nextLine();
            giris();
        }else {
            System.out.println("YANLIS GIRIS YAPTINIZ. ESKI SIFRENIZI GIRINIZ : ");
            sifreDegistir();
        }
    }
    private static void paraGonderme(String iban,double miktar) {
    if(miktar<=bakiye){
        bakiye-=miktar;
        System.out.println(iban +" NO'LU IBAN NO'SUNA " + miktar + " GONDERILDI");
        bakiyeSorgula();
    }else {
        System.out.println("GECERLI MIKTAR GIRINIZ : ");
        paraGonderme(iban,scan.nextDouble());}
    }

    private static String ibanKontrol(String iban) {
        iban = iban.replaceAll("\\s", "");
        if (iban.startsWith("TR")&& iban.length() ==26 ){

        }else {
            System.out.println("GECERLİ IBAN NO GIRINIZ");
            scan.nextLine();
            ibanKontrol(scan.nextLine());}
        return iban;
    }

    private static void paraCekme(double miktar) {
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyeSorgula();

        }else {
            System.out.println("YETERLI BAKIYE YOK");
            paraCekme(scan.nextDouble());}
    }
    private static void paraYatirma(double miktar) {
        bakiye +=miktar;
        bakiyeSorgula();
    }
    private static void bakiyeSorgula() {
        System.out.println("MEVCUT BAKIYENIZ : " + bakiye);
        menu();
    }
}

