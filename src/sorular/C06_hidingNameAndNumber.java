package sorular;

import java.util.Scanner;

public class C06_hidingNameAndNumber {

    /*
      Ask user Name, Surname and credit card numbers than convert it to special form
      (Check credit card number, if there aren't 16 digit print "invalid credit card number")
      Input : John White 1234123412341234
      Output: Name : J*** W***
              CCN  : **** **** **** 1234
              (initial name-surname should be uppercase)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyisim = scan.nextLine();
        System.out.print("Lutfen 16 haneli card numaranizi giriniz : ");
        String cardNumb = scan.nextLine();

        if (cardNumb.length() != 16){
            System.out.println("invalid credit card number");
        }
        else {
            isim = isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
            soyisim = soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w","*");
            cardNumb= "**** **** **** "+ cardNumb.substring(12);

            System.out.println("Isim : "+ isim + "\nSoyisim : " +soyisim + "\nCard Number : " +cardNumb);
        }
    }
}
