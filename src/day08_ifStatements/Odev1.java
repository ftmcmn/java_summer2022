package day08_ifStatements;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        /*
        kulldan dikdortgenin kenar uzunluklarını isteyin
        ve dikdortgenin kare olup olmadıgını yazdırın
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdortgenin kenar uzunluklarını giriniz");
        double uKenar= scan.nextDouble();
        double kKenar=scan.nextDouble();

        if (kKenar==uKenar){
            System.out.println("dikdörtgen karedir");
        }else System.out.println("dikdortgen kare degildir");



    }
}
