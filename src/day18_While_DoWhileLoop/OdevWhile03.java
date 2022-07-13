package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevWhile03 {
    public static void main(String[] args) {

        /*
        kull baslangıc ve bitis degerleri alin.
        baslangıc ve bitis degerleri dahil aralarında ki
        tum cift tam sayilari while loop kullanarak ekrana yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("baslangıc ve bitis degerleri giriniz");
        int baslangic= scan.nextInt();
        int bitis=scan.nextInt();

        while (baslangic<=bitis){

            if (baslangic%2==0){
                System.out.print(baslangic+" ");
            }
            baslangic++;
        }

        while (bitis<=baslangic){
            if (baslangic%2==0){
                System.out.print(baslangic+" ");
            }
            baslangic--;

        }
    }
}
