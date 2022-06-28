package javaPracticeFall;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("sayilarin toplami :"+(sayi1+sayi2));
    }



}
