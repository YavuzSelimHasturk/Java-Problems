package problems.Kitaplik.MapCozum;

import java.util.Map;
import java.util.TreeMap;

public class Kitap_Map {
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

    //Kitap value su Kitap Adı, Yazar Adı, Yayin Evi, Yayın Yılı ve Fiyat bilgilerini icerecek

    static int kitapNo = 1000;
    //  static Scanner scan= new Scanner(System.in);

    public static Map<Integer, String> kitaplarMap() {
        Map<Integer, String> kitaplar = new TreeMap<>();
        kitaplar.put(kitapNo++, "Savas ve Baris , Tolstoy , Is bankasi, 2017,150\n");
        kitaplar.put(kitapNo++, "Germinal, Emile Zola, Is Bankasi, 2018, 90\n");
        kitaplar.put(kitapNo++, "Suc ve Ceza, Dostoyevski, Is Bankasi, 2020, 135\n");
        kitaplar.put(kitapNo++, "Masumiyet Muzesi, Orhan Pamuk, Yapi Kredi Yayinlari, 2016, 100\n");
        kitaplar.put(kitapNo++, "Ince Memed, Yasar Kemal, Yapi Kredi Yayinlari, 2018,250\n");

        return kitaplar;
    }
}
