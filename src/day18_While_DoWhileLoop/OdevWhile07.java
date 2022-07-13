package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevWhile07 {
    public static void main(String[] args) {
        /*
        kull bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        int rakamlarToplami=0;

        while (sayi>0){

            rakamlarToplami+=sayi%10;
            sayi/=10;

        }
        System.out.println(rakamlarToplami);








    }
}
