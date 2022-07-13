package day16_forLoop;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

        /*kull 100 den kucuk bir tam sayi isteyin.
        1 den baslayarak girilen sayiya kadar olan tum sayilari yazdirin.Ancak
        - sayi 3'ün kati ise sayi yerine "Java" yazdirin.
        - sayi 5'in katı ise sayi yerine "Guzeldir" yazdirin.
        - sayi hem 3'ün hem 5'in katı ise sayi yerine "Java Guzeldir" yazdirin.
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir tam sayi giriniz");
        int sayi= scan.nextInt();

        for (int i =1; i <sayi ; i++) {

            if (i%15==0){
                System.out.println("Java Guzeldir");
            }else if (i%5==0){
                System.out.print("Guzeldir ");
            }else if (i%3==0){
                System.out.print("Java ");
            }else System.out.print(i+" ");
        }


    }
}
