package day16_forLoop;

import java.util.Scanner;

public class Odev12 {
    public static void main(String[] args) {

        /*
        kull pozitif bir rakam girmesini isteyin girilen rakama gore asagidaki sekli cizdirin

       *
       * *
       * * *
       * * * *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir rakam giriniz");
        int rakam= scan.nextInt();

        for (int i = 1; i <=rakam ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }
        for (int i = rakam-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {

                System.out.print("* ");

            }

            System.out.println();

        }
    }
}
