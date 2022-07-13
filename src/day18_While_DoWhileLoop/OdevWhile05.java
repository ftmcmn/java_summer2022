package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevWhile05 {
    public static void main(String[] args) {
        /*
        kull bir rakam alın ve bu rakam için carpim tablosunu ekrana yazdirin.
        kull hata yapmadigini farz edin.
        ornegin 3 girerse;
        1x3=3 2x3=6 3x3=9 4x3=12 5x3=15 6x3=18 7x3=21 8x3=24 9x3=27 10x3=30
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int rakam= scan.nextInt();

        int i=1;

        while (i<=10){

            int sonuc=i*rakam;
            System.out.print(i+"x"+rakam+"="+sonuc+" ");
            i++;
        }

    }
}
