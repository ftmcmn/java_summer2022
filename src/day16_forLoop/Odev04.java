package day16_forLoop;

import java.util.Scanner;

public class Odev04 {
    public static void main(String[] args) {

        //kull 100 den kucuk bir tam sayi isteyin.
        //1 den baslayarak girilen sayiya kadar 3'ün kati olan sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir tam sayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (i%3==0){
                System.out.print(i+" ");
            }

        }
    }
}
