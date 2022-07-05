package day12_stringManipulation;

import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {
        /*
        kull ismini, soyismini ve kredi karti bilgisini
        isteyin ve asagidaki gibi yazdirin.
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();
        System.out.println("16 haneli kredi kartı numaranızı giriniz");
        String kartNo=scan.next();

        System.out.println(isim.toUpperCase().charAt(0)+
                isim.substring(1).replaceAll("\\w","*"));
        System.out.println(soyisim.toUpperCase().charAt(0)+
                soyisim.substring(1).replaceAll("\\w","*"));

        System.out.println(kartNo.substring(0,4).replaceAll("\\d","*").concat(" ")+
                        kartNo.substring(4,8).replaceAll("\\d","*").concat(" ")+
                        kartNo.substring(8,12).replaceAll("\\d","*").concat(" ")+
                kartNo.substring(12));



    }
}
