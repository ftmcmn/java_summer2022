package odev;

import java.util.Scanner;

public class G05 {
    public static void main(String[] args) {
        /*
        kullanicidan ismini soyismini isteyip
        asagidaki sekilde yazdirin
        Isminiz : Mehmet
        Soyisminiz : Bulut
        Kursumuza katiliminiz alinmistir, tesekkur ederiz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Isminiz : "+isim + "\nSoyisminiz : "+ soyisim+
                "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");

    }
}
