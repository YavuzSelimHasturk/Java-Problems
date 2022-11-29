package sorular;

import java.util.Map;
import java.util.TreeMap;

public class C09_MapSoru {
    public static void main(String[] args) {

    /*
        MAP Soru 3 : Count the words in a String one by one    Girilen bir String'deki kelimeleri tek tek saydiran
        java code create ediniz.
        For Example:   Input :  String is "Ali came to school and Ayse came to school"
        Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
        */

    String input= "Ali came to school and Ayse came to school and Hasan didn't go to school";

    Map<String,Integer> cumle = new TreeMap<>();

    String[] inputArr = input.split(" ");

        for (String each: inputArr
             ) {
        if (!cumle.containsKey(each)){
            cumle.put(each,1);
        }else {
            cumle.replace(each,cumle.get(each)+1);
        }
    }
        System.out.println(cumle);

    }
}
