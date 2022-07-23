package day22_multiDimensionalArray;

import java.util.Arrays;

public class Odev08 {
    public static void main(String[] args) {

        //Verilen bir array’e yeni bir element ekleyen method olusturun

        int arr[]={1,2,3,4};

        int eklenecekSayi=5;


        elemanEklee(arr,eklenecekSayi);
    }

    private static void elemanEklee(int[] arr, int eklenecekSayi) {

        int arr1[]=new int[arr.length+1];


        for (int i = 0; i <arr1.length-1 ; i++) {

            arr1[i]=arr[i];

        }arr1[arr1.length-1]=eklenecekSayi;

        System.out.println(Arrays.toString(arr1));


    }

}
