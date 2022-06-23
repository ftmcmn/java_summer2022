package day08_ifStatements;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        /*
        kull bir ucgenin uc kenar uzunlugunu alın uc kenar uzunlugu
        birbirine esit ise ekrana "Eskenar ucgen" yazdırın
        diger durumlarda ekrana "Eskenar degil" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen  ucgenin kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eskenar ucgen");
        }else System.out.println("eskenar degil");

    }
}
