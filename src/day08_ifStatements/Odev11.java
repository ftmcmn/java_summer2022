package day08_ifStatements;

import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {
        /*
        nested if kullanarak asagidaki soruyu coxen kodu yaziniz
        kull bir sifre girmesini isteyin
        eger ilk harf buyuk ise "A"olup olmadıgini kontrol edin.
        ilk harf A ise "gecerli sifre", degilse "gecersiz sifre" yazdirin.
        ilk harf kucuk ise "z"olup olmadıgini kontrol edin.
        ilk harf z ise "gecerli sifre", degilse "gecersiz sifre" yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sifre giriniz");
        char ilkHarf=scan.next().charAt(0);
        if (ilkHarf>='A' && ilkHarf<='Z') {
            if (ilkHarf == 'A') {
                System.out.println("gecerli sifre");
            } else System.out.println("gecersiz sifre");

        }else if (ilkHarf>='a' && ilkHarf<='z'){
            if (ilkHarf == 'z'){
                System.out.println("gecerli sifre");
            }else System.out.println("gecersiz sifre");

        }




    }
}
