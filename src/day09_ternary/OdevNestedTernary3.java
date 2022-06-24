package day09_ternary;

import java.util.Scanner;

public class OdevNestedTernary3 {
    public static void main(String[] args) {
        /*
        kull dikdortgenin uzunlugunu ve genisligini alin.
        girilen degerlere göre dikdortgenin kare olup olmadigini yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen dikdortgenin uzun kenarını giriniz");
        double uzunKenar=scan.nextDouble();
        System.out.println("lütfen dikdortgenin kısa kenarını giriniz");
        double kisaKenar=scan.nextDouble();

        System.out.println(uzunKenar==kisaKenar?"dikdortgen karedir":"dikdortgen kare degildir");

    }
}
