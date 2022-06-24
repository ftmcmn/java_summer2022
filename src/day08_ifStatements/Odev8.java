package day08_ifStatements;

import java.util.Scanner;

public class Odev8 {
    public static void main(String[] args) {
        /*
        kull maas icin bir teklif isteyin ve
        asagida ki degerlere gore cvp yazdirin
        teklif 80000in uzerinde ise "kabul ediyorum"
        60-80000 arasinda ise "konusabiliriz"
        60000 in altinda ise "maalesef kabul edemem" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen maas teklifinizi giriniz");
        double maas=scan.nextDouble();

        if (maas<60000){
            System.out.println("maalesef kabul edemem");
        }else if (maas<80000){
            System.out.println("konusabiliriz");
        }else System.out.println("kabul ediyorum");
    }
}
