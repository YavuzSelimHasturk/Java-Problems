package sorular;

import java.util.Arrays;

public class C03_ToplamiYeniArrayAtama {
    public static void main(String[] args) {
        /*
    Asagidaki array'in ic Array'lerindeki tum elemanlarin toplamini birer birer bulan ve
    her bir sonucu yeni bir array in elemani yapan ve yeni array'i ekrana yazdiran bir program yaziniz.
    {{4,2,7},{1,5,9,4,12},{3,7},{8,3,13}}
      */

    int arr [][]= {{4,2,7},{1,5,9,4,12},{3,7},{8,3,13}};

    int [] yeniArray = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            int toplam = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
            }
            yeniArray[i]=toplam;
        }
        System.out.println(Arrays.toString(yeniArray));
        }
}
