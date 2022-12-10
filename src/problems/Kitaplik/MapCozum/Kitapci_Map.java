package problems.Kitaplik.MapCozum;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Kitapci_Map {

    /*

	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.
	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayin Evi, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.
	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.
		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir
 */
    static Scanner scan = new Scanner(System.in);
    static Map<Integer,String> kitaplar = Kitap_Map.kitaplarMap();

    public static void main(String[] args) {
        System.out.println("Mevcut Kitaplar : \n" + kitaplar);
        System.out.println("");
        anaMenu(kitaplar);
    }

    public static void anaMenu(Map<Integer,String> kitaplar) {

        System.out.println("*****************KITAP PROGRAMI******************\n" +
                "1- KITAP EKLE\n" +
                "2- NUMARA ILE KITAP SIL\n" +
                "3- TUM KITAPLARI LISTELE\n" +
                "4- CIKIS");


        System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1: {
                kitapEkle();
                break;
            }
            case 2: {
                numaraIleKitapSil();
                break;
            }
            case 3: {
                tumKitaplariListele();
                break;
            }
            case 4: {
                cikis();
                break;
            }
            default:
                System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz");
                break;
        }
    }
    public static void numaraIleKitapSil() {
        System.out.println("Silmek istediginiz kitabin kitap No'sunu giriniz : ");
        int silinecekNo = scan.nextInt();
        kitaplar.remove(silinecekNo);
        System.out.println(kitaplar);

    }
    public static void kitapEkle() {

        System.out.println("Kitap ismi giriniz : ");


        String kitapAdi= scan.nextLine();
        scan.nextLine();
        System.out.println("Kitap yazarini giriniz : ");
        String kitapYazar= scan.nextLine();
        System.out.println("Yayinevi ismini giriniz : ");
        String yayinEvi= scan.nextLine();
        System.out.println("Yayin yilini giriniz : ");
        int yayinYili= scan.nextInt();
        scan.nextLine();
        System.out.println("Kitap fiyatini giriniz : ");
        double fiyat = scan.nextDouble();

        String eklenecekKitap= kitapAdi+","+kitapYazar+","+yayinEvi+","+yayinYili+","+fiyat+"\n";

        Set<Integer> kitaplarKeySeti = kitaplar.keySet();
        Integer [] keyArray = kitaplarKeySeti.toArray(new Integer[0]);
        int kitapNo= keyArray[kitaplar.size()-1];

        kitaplar.put(++kitapNo,eklenecekKitap);
        System.out.println("Eklenen kitap bilgileri : " + (kitapNo)+ "=" +eklenecekKitap);

        System.out.println("Devam etmek istiyor musunuz? : E/H ");
        char cevap1 = scan.next().charAt(0);
        String cevap=""+cevap1;

        if (cevap.equalsIgnoreCase("e")){
            anaMenu(kitaplar);
        } else if (cevap.equalsIgnoreCase("h")) {
            cikis();
        }else {
            try {
                System.out.println("Hatali giris yaptiniz.");
            } catch (Exception ignored) {
            }
        }
        anaMenu(kitaplar);
    }

    public static void tumKitaplariListele() {
        System.out.println(kitaplar);

    }
    public static void cikis() {
        System.out.println("Tesekkur ederiz. Yine bekleriz... ");
    }

}
