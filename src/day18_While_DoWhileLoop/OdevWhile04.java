package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevWhile04 {
    public static void main(String[] args) {
        /*
        kull dan baslangıc ve bitis harflerini alin ve baslangıc
         harfinden baslayıp bitis harfinde biten tum harfleri
        buyuk harf olarak ekrana yazdirin.kull hata yapmadıgını farz edin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("baslangıc ve bitis harfleri giriniz");
        char basharf=scan.next().toUpperCase().charAt(0);
        char bitharf=scan.next().toUpperCase().charAt(0);

        while (basharf<=bitharf){
            System.out.print(basharf+" ");
            basharf++;
        }
    }
}
