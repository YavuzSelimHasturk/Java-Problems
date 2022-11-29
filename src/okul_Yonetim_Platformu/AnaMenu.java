package okul_Yonetim_Platformu;

import java.util.Scanner;

public class AnaMenu {

    void anaMenu() {

        System.out.println("========================================" +
                "\nOGRENCI VE OGRETMEN YONETIM PANELI" +
                "\n============================================" +
                "\n1- OGRENCI ISLEMLERI" +
                "\n2- OGRETMEN ISLEMLERI" +
                "\nQ- CIKIS" +
                "\n SECIMINIZ : ");

        Scanner scan = new Scanner(System.in);

        while (true){
            char secim = scan.next().toUpperCase().charAt(0);
            switch (secim){
                case '1': {
                }
                case '2': {
                }
                case 'Q':{

                }
                default:{
                    System.out.println("Gecerli deger giriniz");
                    anaMenu();
                }
            }
        }
    }
}
