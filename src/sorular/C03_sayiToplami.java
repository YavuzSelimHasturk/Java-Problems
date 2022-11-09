package sorular;

import java.util.Scanner;

public class C03_sayiToplami {
    /*
        Kullanicidan toplanmak uzere sayilar isteyin.
        Sayi adedi 10'u gecerse yada toplami 500'u gecerse
         " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
    */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int sayi =0;
        int toplam = 0;
        int sayac=0;

        while (sayac<11 && toplam<500){
            System.out.println("Lutfen toplamak istediginiz sayilari giriniz");
            sayi= scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        if (toplam>500){
            System.out.println("Girdiginiz " + sayac + " adet sayinin toplami " + toplam);
        }else
            System.out.println("Bu kadar sayi yeter. " +sayac+ " adet sayi girdiniz. Girilen sayilarin toplami : " +toplam );
    }


}
