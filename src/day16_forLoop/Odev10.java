package day16_forLoop;

import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {

        /*
        kull iki tam sayi isteyin.girilen sayilar ve aralarinda ki
        tum tamsayilari toplayıp, sonucu yazdiran bir program yazin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");
        int sayi= scan.nextInt();
        int sayi1= scan.nextInt();
        int toplam=0;
        if (sayi<sayi1){
            for (int i = sayi; i <=sayi1 ; i++) {

                toplam+=i;
            }
            System.out.println(toplam);
        }else {
            for (int i =sayi1; i <=sayi ; i++) {
                toplam+=i;
            }
            System.out.println(toplam);
        }
    }
}
