package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevWhile06 {
    public static void main(String[] args) {
        /*
        kull bir sayi alin ve bu sayiyi tam bölen sayilari
        ve toplamda kac tane olduklarini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();

        int i=2;
        int sayac=0;
        System.out.print(sayi+" sayisini tam bolen sayilar : ");

        while (i<=sayi){

            if (sayi%i==0){
                System.out.print(i+" ");
                sayac++;
            }
            i++;

        }
        System.out.println();
        System.out.println("tam bolen sayilar "+sayac+" tanedir.");
    }
}
