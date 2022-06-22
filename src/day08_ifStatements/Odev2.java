package day08_ifStatements;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        /*
        kull bir karakter girmesini isteyin ve
        girilen karakterin harf olup olmadıgını yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz ");
        char karakter= scan.next().toLowerCase().charAt(0);

        if (karakter>='a' && karakter<='z'){
            System.out.println("girilen karakter bir harftir");
        }else System.out.println("girilen karakter harf degildir");
    }
}
