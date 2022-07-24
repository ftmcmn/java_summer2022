package day22_multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class OdevMda05 {
    public static void main(String[] args) {
        /*
        kull bir cumle isteyin.cumlede ki kelime sayisini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle girinz");
        String cumle=scan.nextLine();

        cumle=cumle.replace("  "," ");

        String arr[]=cumle.trim().split(" ");

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);


    }
}
