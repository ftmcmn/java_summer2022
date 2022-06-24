package day09_ternary;

import java.util.Scanner;

public class Odev04 {
    public static void main(String[] args) {
        /*
        Kull bir sayi alin. sayi pozitif ise "sayi pozitif"
        negatifse sayinin karesini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi>0?"sayi pozitif":(sayi*sayi));
    }
}
