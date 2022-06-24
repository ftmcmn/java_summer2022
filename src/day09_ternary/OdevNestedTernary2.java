package day09_ternary;

import java.util.Scanner;

public class OdevNestedTernary2 {
    public static void main(String[] args) {
        /*
        kull bir harf isteyin kucuk harf ise konsola "kucuk harf"
        buyuk harf ise konsola "buyuk harf"
        yoksa "girdiginiz karakter harf degil" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z'?"kucuk harf":harf>='A' && harf<='Z'
                                                 ?"buyuk harf":"girdiginiz karakter harf degil");


    }
}
