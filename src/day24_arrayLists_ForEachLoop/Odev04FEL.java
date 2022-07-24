package day24_arrayLists_ForEachLoop;

import java.util.Arrays;

public class Odev04FEL {
    public static void main(String[] args) {
        //Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
        //yazdiriniz. ipucu: split()

        String str="tasa degmesin ayagin";

        String arr[]=str.split("");

        for (String each:arr
             ) {
            System.out.print(each+" ");

        }
        System.out.println();

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
