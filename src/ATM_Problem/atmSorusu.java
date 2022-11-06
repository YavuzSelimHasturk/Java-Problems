package ATM_Problem;

import java.util.Scanner;

public class atmSorusu {
    public static void main(String[] args) {

        /*
        Kullanicidan daha önceden kayitli kullanici adi ve sifresi alin.
        3 kere yanlis girme hakki var, fazla girerse bloke edin
        para yatirma, para cekme, bakiye sorgulama, cikis menuleri bulunsun.
         */

        String kullaniciAdi, parola;

        Scanner scan = new Scanner(System.in);
        String userName = "Yavuz", password = "Istanbul1991";
        int kalanHak = 3;
        int bakiye = 5000;
        int secim;

        while (kalanHak > 0) {

            System.out.println("Lutfen kullanici adinizi giriniz : ");
            kullaniciAdi = scan.nextLine();
            System.out.println("Lutfen parolanizi giriniz :");
            parola = scan.nextLine();

            if (kullaniciAdi.equals(userName) && parola.equals(password)) {
                System.out.println("Merhaba HAS BANK 'a hosgeldiniz");

                do {
                    System.out.println("1- Para Yatirma" + "\n2- Para Cekme" +
                            "\n3- Bakiye Sorgula" + "\n4- Cikis");

                    System.out.println("Lutfen yapmak istediginiz islemi giriniz :");
                    secim = scan.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("Lutfen yatirmak istediginiz miktari giriniz : ");
                            int eklenenMiktar = scan.nextInt();
                            bakiye += eklenenMiktar;
                            System.out.println("Hesabinizda mevcut miktar :" + bakiye + " olmustur");
                            break;

                        case 2:
                            System.out.println("Lutfen cekmek istediginiz miktari giriniz : ");
                            int paraCekme = scan.nextInt();

                            if (paraCekme <= bakiye) {
                                bakiye -= paraCekme;
                                System.out.println("Hesabinizda mevcut miktar :" + bakiye + " olmustur");
                            } else {
                                System.out.println("Bakiye yetersiz");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;

                        case 4:
                            System.out.println("İsleminiz tamamlandı. Iyi gunler dileriz");
                        default:

                    }
                } while (secim != 4);
                break;
            } else {
                kalanHak--;


                if (kalanHak == 0) {
                    System.out.println("Hesabiniz bloke olmustur. Lutfen en yakin sube ile iletisime geciniz");
                } else {
                    System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz");
                    System.out.println("Kalan hakkiniz : " + kalanHak);
                }
            }


        }


    }
}
