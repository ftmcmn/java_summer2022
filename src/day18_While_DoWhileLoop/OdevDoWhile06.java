package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevDoWhile06 {
    public static void main(String[] args) {
        /*
        kull toplamak icin sayi isteyin ve toplam 500'e ulasincaya kadar devam ettirmesini isteyin
        toplam 500'e ulastıginda veya gectiginde toplami ve kac sayi girildigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayac=0;

        do {

            System.out.println("toplam 500'e ulasincaya kadar toplamak icin sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;


        }while (toplam<500);

        System.out.println(sayac+" sayi girdiniz, toplamlari : "+toplam);
    }
}
