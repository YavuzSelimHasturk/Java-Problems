package sorular;

import java.util.Scanner;

public class C12_Burc_Hesaplama {
    // kullanicidan alinan dogum tarihine gore burc hesaplayiniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi sayi olarak giriniz : ");
        int ay= scan.nextInt();
        System.out.println("Lutfen dogdugunuz gunu sayi olarak giriniz : ");
        int gun= scan.nextInt();

        if (ay>12 || ay<1){
            System.out.println("Hatali ay girisi yaptiniz");
        }
        switch (ay) {
            case 1:
                if (gun>0 && gun<=31){
                    if (gun<21){
                        System.out.println("Burcunuz : Oglak");
                        break;
                    }else {
                        System.out.println("Burcunuz : Kova");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 2:
                if (gun>0 && gun<=28){
                    if (gun<20){
                        System.out.println("Burcunuz : Kova");
                        break;
                    }else {
                        System.out.println("Burcunuz : Balik");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 3:
                if (gun>0 && gun<=31){
                    if (gun<21){
                        System.out.println("Burcunuz : Balik");
                        break;
                    }else {
                        System.out.println("Burcunuz : Koc");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 4:
                if (gun>0 && gun<=30){
                    if (gun<21){
                        System.out.println("Burcunuz : Koc");
                        break;
                    }else {
                        System.out.println("Burcunuz : Boga");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 5:
                if (gun>0 && gun<=31){
                    if (gun<22){
                        System.out.println("Burcunuz : Boga");
                        break;
                    }else {
                        System.out.println("Burcunuz : Ikizler");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 6:
                if (gun>0 && gun<=30){
                    if (gun<22){
                        System.out.println("Burcunuz : Ikizler");
                        break;
                    }else {
                        System.out.println("Burcunuz : Yengec");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 7:
                if (gun>0 && gun<=31){
                    if (gun<23){
                        System.out.println("Burcunuz : Yengec");
                        break;
                    }else {
                        System.out.println("Burcunuz : Aslan");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 8:
                if (gun>0 && gun<=31){
                    if (gun<23){
                        System.out.println("Burcunuz : Aslan");
                        break;
                    }else {
                        System.out.println("Burcunuz : Basak");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 9:
                if (gun>0 && gun<=30){
                    if (gun<23){
                        System.out.println("Burcunuz : Basak");
                        break;
                    }else {
                        System.out.println("Burcunuz : Terazi");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 10:
                if (gun>0 && gun<=31){
                    if (gun<24){
                        System.out.println("Burcunuz : Terazi");
                        break;
                    }else {
                        System.out.println("Burcunuz : Akrep");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 11:
                if (gun>0 && gun<=30){
                    if (gun<23){
                        System.out.println("Burcunuz : Akrep");
                        break;
                    }else {
                        System.out.println("Burcunuz : Yay");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;

            case 12:
                if (gun>0 && gun<=31){
                    if (gun<22){
                        System.out.println("Burcunuz : Yay");
                        break;
                    }else {
                        System.out.println("Burcunuz : Oglak");
                        break;
                    }
                }else System.out.println("Hatali gun girisi yaptiniz");
                break;
        }
    }
}
