package day09_ternary;

import java.util.Scanner;

public class Odev01 {
    public static void main(String[] args) {
        /*
        kull iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);
    }
}
