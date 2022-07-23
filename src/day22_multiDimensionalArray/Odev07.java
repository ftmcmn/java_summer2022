package day22_multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;



public class Odev07 {
    public static void main(String[] args) {

        //Kullanicidan bir array’in boyutunu ve tum elementlerini alarak bir array
        //olusturup, bu array’i bize donduren bir method olusturun

        System.out.println(Arrays.toString(arrayOlusturr()));
    }

    private static int[] arrayOlusturr() {

        Scanner scan=new Scanner(System.in);
        System.out.println("arrayin boyutunu giriniz");
        int boyut=scan.nextInt();

        int arr[]=new int[boyut];

        for (int i = 0; i <boyut; i++) {

            System.out.println("arrayin "+i+". indexdeki elemanıni giriniz");
            arr[i]=scan.nextInt();


        }

       return arr;
    }
}
