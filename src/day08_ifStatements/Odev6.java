package day08_ifStatements;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        /*
        kull iki sayi isteyin, sayilarin ikiside pozitif ise sayilarin
        toplamini yazdirin. sayilarin ikisi de negative ise sayilarin
        carpimini yazdirin. sayilarin ikisi de farkli isaretlere sahipse
        "farkli isaretlerde sayilarla islem yapamazsin" yazdirin.
        sayilardan sıfıra esit olan varsa "sifir carpmaya göre yutan elemandır"
        yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("lütfen bir sayi daha giriniz");
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("sayilarin toplami : " +(sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("sayilarin carpimi : "+sayi1*sayi2);
        }else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin" );
        }else System.out.println("sifir carpmaya göre yutan elemandır");



    }
}
