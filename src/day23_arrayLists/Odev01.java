package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Odev01 {
    public static void main(String[] args) {
        //Verilen bir array’deki tekrar eden elementleri yazdirin.

        int arr[]={2,3,5,6,3,5,4,1,9,6,3,5,5};

        List<Integer>tekrarEdenler=new ArrayList<>();

        for (int i =0; i < arr.length ; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]==arr[j]){

                    if (!tekrarEdenler.contains(arr[i])){
                    tekrarEdenler.add(arr[i]);
                    }
                }

            }

        }
        System.out.println(tekrarEdenler);


    }
}
