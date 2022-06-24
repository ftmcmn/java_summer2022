package day09_ternary;

import java.util.Scanner;

public class Odev03 {
    public static void main(String[] args) {
        /*
        kull bir sayi alin ve sayinin mutlak degerini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi>0?sayi:(-1*sayi));

    }
}
