package day22_multiDimensionalArray;

import java.util.Arrays;

public class OdevMda06 {
    public static void main(String[] args) {
        /*
        Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
        Array olarak yazdiran bir method yaziniz
         */

        int arr[] = {1, 2, 3, 1, 1, 4, 7, 8};

        int istenenDeger = 1;
        String kalanlar="";

        String yeniArr[]=new String[kalanlar.length()];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != istenenDeger) {
                kalanlar += arr[i];
            }

        }
        System.out.println(kalanlar);



        for (int j = 0; j<kalanlar.length() ; j++) {


            yeniArr=kalanlar.split("");




        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
