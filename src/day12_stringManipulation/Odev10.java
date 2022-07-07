package day12_stringManipulation;

import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
         /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sifre giriniz");
        String sifre = scan.nextLine();
        boolean hataliMi = true;

        if (hataliMi) {
            if (!('A' <= sifre.charAt(0) && sifre.charAt(0) <= 'Z')) {
                System.out.println("Ilk harf buyuk harf olmali");
            }
            if (!('a' <= sifre.charAt(sifre.length() - 1) && sifre.charAt(sifre.length() - 1) <= 'z')) {
                System.out.println("Son harf kucuk harf olmali");
            }
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            }
            if (sifre.length() < 8) {
                System.out.println("Sifre uzunlugu en az 8 karakter olmali");
            }
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");


        } else  System.out.println("Sifre basari ile tanimlandi");

    }
 }

