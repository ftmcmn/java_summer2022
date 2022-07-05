package day12_stringManipulation;

import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        /*
        kull dan isim isteyin. eger
        -isim "a" harfi iceriyorsa "girdiginiz isim a harfi iceriyor"
        -isim "Z" harfi iceriyorsa "girdiginiz isim Z harfi iceriyor"
        -ikisi de yoksa "girdiginiz isim a veya Z harfi iceriyormiyor"
        yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();

        if (isim.contains("a")){
            System.out.println("girdiginiz isim a harfi iceriyor");
        }else if (isim.contains("Z")){
            System.out.println("girdiginiz isim Z harfi iceriyor");
        }else System.out.println("girdiginiz isim a veya Z harfi iceriyormiyor");


    }
}
