package sorular;

import java.util.Scanner;

public class C07_KelimeninOrtasiniYazdirma { /*
    Tek sayida harf iceren bir String degiskeninin ortasindaki harfi yazdiriniz,
    Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String input = scan.next();

        System.out.println(ortadakiHarfiYazdir(input));
    }
    private static String ortadakiHarfiYazdir(String input) {

        int uzunluk=input.length();
        int ortadakiIndex=uzunluk/2;
        int baslangicIndex = ortadakiIndex-1;
        int bitisIndex = ortadakiIndex+1;

        if (uzunluk%2==0) return input.substring(baslangicIndex,bitisIndex);
        else              return input.substring(ortadakiIndex,ortadakiIndex+1);

    }
}
