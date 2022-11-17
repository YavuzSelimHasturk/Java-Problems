package sorular;
import java.util.ArrayList;

public class C05_ArraylerinOrtakElemaniniBulma {
    /*
      iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
      (buyuk kucuk harf onemsiz)

      input1 : {john, brad, ange, sofia, Emily}
      input2 : {sofia, brad, grace, emily, hazel}

      output : [sofia, brad, emily]
       */
    public static void main(String[] args) {

        String [] array1 = {"john", "brad", "ange", "sofia", "Emily"};
        String [] array2 = {"sofia", "brad", "grace", "emily", "hazel"};

        ortakElemanArraytoList(array1,array2);
    }
    private static void ortakElemanArraytoList(String[] array1, String[] array2) {

        ArrayList<String> arrList = new ArrayList<>();

        for (String each: array1) {
            for (String hic: array2) {
                if (each.equalsIgnoreCase(hic)){
                    arrList.add(each);
                }
            }
        }
        System.out.println(arrList);
    }
}
