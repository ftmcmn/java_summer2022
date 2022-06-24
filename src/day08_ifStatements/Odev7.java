package day08_ifStatements;

import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        /*
        kull 100 uzerinden notunu isteyin
        notu harf sistemine cevirip yazdirin.
        50den kucukse "D",50-60 arasi "C"
        60-80 arasi "B",80nin uzerinde ise"A"
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not=scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("gecerli bir not giriniz");
        }else if (not<50){
            System.out.println("D");
        }else if (not<60){
            System.out.println("C");
        }else if (not<80){
            System.out.println("B");
        }else System.out.println("A");

    }
}
