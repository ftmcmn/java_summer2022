package day09_ternary;

import java.util.Scanner;

public class OdevNestedTernary4 {
    public static void main(String[] args) {
        /*
        kull bir sayi alin ve sayi 3 basamakli ise "uc basamakli sayi"
        degilse "uc basamakli degil" yazdirin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi>99 && sayi<1000?"uc basamakli sayi":"uc basamakli degil");
    }
}
