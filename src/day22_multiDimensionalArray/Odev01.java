package day22_multiDimensionalArray;

import java.util.Arrays;

public class Odev01 {
    public static void main(String[] args) {

        //Elemanlari “Ali”,“Veli”,“Ayse” ve “Fatma” olan bir array olusturun ve bu array’i yazdirin.

        String str[]={"ali","veli","ayse","fatma"};

        System.out.println(Arrays.toString(str));

        str[0]="can";
        str[2]="gul";

        System.out.println(Arrays.toString(str));

    }
}
