package day03_scanner;

import java.util.Scanner;

public class G06 {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini ve soyismini alip
        aralarinda bir bosluk olusturarak
        asagidaki sekilde yazdirin
        Isim - soyisim : Mehmet Bulut
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Isim - soyisim : "+isim +" "+soyisim);




    }
}
