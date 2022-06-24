package day08_ifStatements;

import java.util.Scanner;

public class Odev12 {
    public static void main(String[] args) {
        /*
        kull 4 basamaklı bir sayi girmesini isteyin. girdigi sayi 5e bolunuyorsa
        son rakamini kontrol edin. son rakamı 0 ise "5'e bolunebilen cift sayi"
        degilse "5'e bolunebilen tek sayi" yazdirin.
        girdigi sayi 5e bolunmuyorsa ekrana "tekrar deneyin" yazdirin.
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%5==0){
            if (sayi%2==0){
                System.out.println("5'e bolunebilen cift sayi");
            }else System.out.println("5'e bolunebilen tek sayi");
        }else System.out.println("tekrar deneyin");
    }
}
