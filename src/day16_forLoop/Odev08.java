package day16_forLoop;

import java.util.Scanner;

public class Odev08 {
    public static void main(String[] args) {
        //kull bir string isteyin ve stringi tersine ceviren bir method yazin.


        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= scan.nextLine();

        tersineCevir(str);
    }

    public static void tersineCevir(String str) {

        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));

        }


    }
}
