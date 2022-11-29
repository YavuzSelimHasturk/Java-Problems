package okul_Yonetim_Platformu;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciMenu implements Islemler{
    ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
    Scanner scan= new Scanner(System.in);

    void ogrMenu(){
        System.out.println("==============ISLEMLER===============" +
                "\n1- EKLEME" +
                "\n2- ARAMA" +
                "\n3- LISTELEME" +
                "\n4- SILME" +
                "\nQ- CIKIS" +
                "\nSECIMINIZ : ");



        while (true){
            char secim = scan.next().toUpperCase().charAt(0);
            switch (secim){
                case '1':{
                    ekleme();
                }
                case '2':{
                    arama();
                }
                case '3':{
                    listeleme();
                }
                case '4':{
                    silme();
                }
                case 'Q':{
                    cikis();
                }
            }
        }
    }


    @Override
    public void ekleme() {
        System.out.println("Isim giriniz : ");
        String isim = scan.nextLine();
        System.out.println("Soyisim giriniz : ");
        String soyIsim = scan.nextLine();
        System.out.println("TC No giriniz : ");
        String tcNo = scan.next();
        System.out.println("Yas giriniz : ");
        int yas = scan.nextInt();
        System.out.println("Sinif giriniz : ");
        String sinif = scan.nextLine();
        System.out.println("Ogrenci No giriniz : ");
        int ogrNo = scan.nextInt();
        Ogrenci ogrenci = new Ogrenci(isim,soyIsim,tcNo,yas,sinif,ogrNo);
        ogrenciList.add(ogrenci);
        ogrMenu();
    }

    @Override
    public void arama() {
        if (!ogrenciList.isEmpty()){
            System.out.println("Arama yapilacak TC No giriniz :");
            String aranacakTc= scan.next();
            for (Ogrenci each: ogrenciList){
                    if(each.getTcNo().equals(aranacakTc)){
                        System.out.println(each.toString());
                    }else {
                        System.out.println(aranacakTc + " Tc No ya ait bilgi bulunamadi");
                        ogrMenu();
                    }
            } ogrMenu();
        }else {
            System.out.println("Ogrenci Listesi bos");
            ogrMenu();
        }
    }

    @Override
    public void listeleme() {
        if (!ogrenciList.isEmpty()){
            for (Ogrenci each: ogrenciList) {
                System.out.println(each.toString());
            }
            ogrMenu();
        }else {
            System.out.println("Ogrenci Listesi bos");
            ogrMenu();
        }
    }

    @Override
    public void silme() {
        if (!ogrenciList.isEmpty()){
        System.out.println("Silme yapilacak TC No giriniz :");
        String aranacakTc= scan.next();
            for (int i = 0; i <ogrenciList.size() ; i++) {
                if (aranacakTc.equals(ogrenciList.get(i).getTcNo())) {
                    ogrenciList.remove(i);
                    ogrMenu();
                    }
            } ogrMenu();
        }else {
            System.out.println("Ogrenci Listesi bos");
            ogrMenu();
    }

    }

    @Override
    public void cikis() {
        AnaMenu anaMenu =new AnaMenu();
        anaMenu.anaMenu();
    }
}
