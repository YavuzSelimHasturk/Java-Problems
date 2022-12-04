package sorular;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C11_mountain_array {
    /*
    MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin Mountain Array
     olup olmadıgını kontrol etmek için bir kod yazınız.
    Not:
    Mountain Array ==> [0, 2, 5, 3, 1]
    Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli
    azalan deger alıyorsa Mountain Array' dir.
    Mountain Array Degil ==> [5, 2, 7, 1, 4]
    Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekli
    artan deger alıyorsa Mountain Array degildir. (edited)
     */

    public static void main(String[] args) {

        int [] arr1 = {0, 2, 5, 3,2, 1};
        int [] arr2 = {0, 2, 8,1, 5, 3, 2, 1};
        int [] arr3 = {2, 7};
        int [] arr4 = {5, 4, 3, 2};
        int [] arr5 = {2, 3, 4, 5, 6};
        int [] arr6 = {2, 3, 4, 5, 6, -2,-6};

        mountainArrayMi(arr1);
        mountainArrayMi(arr2);
        mountainArrayMi(arr3);
        mountainArrayMi(arr4);
        mountainArrayMi(arr5);
        mountainArrayMi(arr6);
    }

    private static void mountainArrayMi(int[] arr) {
        int max = arr[0];
        int buyukIndex = 0;
        boolean sonuc=true;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                buyukIndex = i;
            }
        }
        if (buyukIndex==0 || buyukIndex==arr.length-1) {
            sonuc = false;
        }
        for (int i = 0; i < buyukIndex; i++) {
            if (arr[i] < arr[i + 1]) {
               continue;
            } else {
                sonuc=false;
                break;
            }
        }


        if (sonuc){
            for (int i = buyukIndex; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1] ) {
                    continue;
                } else {
                    sonuc=false;
                    break;
                }
            }
        }
        if (sonuc) {
            System.out.println(Arrays.toString(arr) + " array mountain array");
        }else System.out.println(Arrays.toString(arr) + " montain array degildir");
    }
}





