package day12_stringManipulation;

import java.util.Scanner;

public class Odev8 {
    public static void main(String[] args) {
        /*
        kull isim ve soyismini isteyin ve hangisinin daha uzun
        oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("isim daha uzun");
        }else if (isim.length()<soyisim.length()) {
            System.out.println("soyisim daha uzun");
        }else System.out.println("esit uzunlukta");
    }
}
