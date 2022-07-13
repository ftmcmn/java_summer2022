package day16_forLoop;

import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {

        //kull 10'dan kucuk bir tamsayi isteyin ve girilen sayinin faktoriyelini bulun.

        Scanner scan=new Scanner(System.in);
        System.out.println("10 dan kucuk bir tam sayi giriniz");
        int sayi= scan.nextInt();

        int faktoriyel=1;

        System.out.print(sayi+"!=");

        for (int i = sayi; i >0 ; i--) {

            faktoriyel*=i;
           if (i>1){
               System.out.print(i+"*");
           }else if (i==1)System.out.println(i+ "="+faktoriyel );

        }




    }
}
