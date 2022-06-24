package day09_ternary;

import java.util.Scanner;

public class OdevNestedTernary {
    public static void main(String[] args) {
         /*
    kull bir tamsayi alin ve sayi 10dan kucukse "rakam"
    100den kucukse"iki basamakli sayi"
    degilse "uc basamakli veya daha buyuk sayi" yazdirin.
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi<0?"- sayi":sayi<10 && sayi>=0?"rakam":sayi>=10 &&  sayi<100
                                             ?"iki basamakli sayi" :"uc basamakli veya daha buyuk");
    }
}
