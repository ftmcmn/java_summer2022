package day08_ifStatements;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        /*
        kull yasini sorun eger yas 65 den kucukse "emekli olamazsin
        calısmalısın", 65 eesit veya buyukse "emekli olsbilirsin" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz ");
        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("gecerli bir yas girin");
        }else if (yas<65){
            System.out.println("emekli olamazsin "+(65-yas)+" yıl daha calısmalisin");

        }else System.out.println("emekli olabilirsin");
    }
}
