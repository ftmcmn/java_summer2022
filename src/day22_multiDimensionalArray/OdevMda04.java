package day22_multiDimensionalArray;

import java.util.Arrays;

public class OdevMda04 {
    public static void main(String[] args) {

        /*
        Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
        birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
        yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
         */

        int arr[][]={ {1,2,3}, {4,5}, {6,7} ,{1,1}};
        int arr2[]=new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                arr2[i]+=arr[i][j];

            }

        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
    }
}
