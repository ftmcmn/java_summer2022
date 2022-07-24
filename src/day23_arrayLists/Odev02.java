package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Odev02 {
    public static void main(String[] args) {
        // Verilen bir array’deki unique elementleri yeni bir array olarak donduren bir
        //method olusturun

        int arr[] = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5,11};


        List<Integer> tekrarEtmeyenler = new ArrayList<>();

        tekrarsizlar(arr,tekrarEtmeyenler);


    }

    private static void tekrarsizlar(int[] arr, List<Integer> tekrarEtmeyenler) {

        for (int i = 0; i < arr.length; i++) {

            tekrarEtmeyenler.add(arr[i]);
        }
        System.out.println(tekrarEtmeyenler);


        List<Integer> tekrarEdenler = new ArrayList<>();
        List<Integer> kalanlar = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j] &&!tekrarEdenler.contains(arr[i])) {
                    tekrarEdenler.add(arr[i]);

                }

            }

        }
        System.out.println(tekrarEdenler);
        tekrarEtmeyenler.removeAll(tekrarEdenler);
        System.out.println(tekrarEtmeyenler);
    }


}
