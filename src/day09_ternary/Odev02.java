package day09_ternary;

import java.util.Scanner;

public class Odev02 {
    public static void main(String[] args) {
        /*
        kull bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println((sayi%2==0)?"sayi cifttir":"sayi tekdir");
    }
}
