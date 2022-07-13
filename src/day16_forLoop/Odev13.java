package day16_forLoop;

import java.util.Scanner;

public class Odev13 {
    public static void main(String[] args) {

        /*
        kull pozitif bir rakam girmesini isteyin girilen rakama göre carpım tablosunu olusturun
        orn: 1 2 3
             2 4 6
             3 6 9
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir rakam giriniz");
        int rakam= scan.nextInt();

        for (int i = 1; i <=rakam; i++) {

            for (int j = 1; j <=rakam ; j++) {

                System.out.print(i*j+" ");

            }
            System.out.println();

        }







    }
}
