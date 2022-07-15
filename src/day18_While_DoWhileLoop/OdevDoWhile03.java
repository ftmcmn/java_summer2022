package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevDoWhile03 {
    public static void main(String[] args) {
        /*
        kull toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0'a basmasını soyleyın
        kull 0'a bastiginda toplam kac pozitif sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
         */



        int sayi;
        int toplam=0;
        int sayac=0;

        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("toplamak uzere pozitif sayilar girin, bitirmek icin 0'a basın");
            sayi=scan.nextInt();

            if (!(sayi==0)){
                toplam+=sayi;
                sayac++;
            }

        }while (!(sayi==0));
        System.out.println("girdiginiz pozitif sayilar toplami : "+toplam);
        System.out.println("girdiginiz pozitif sayilar adedi : "+ sayac);
    }
}
