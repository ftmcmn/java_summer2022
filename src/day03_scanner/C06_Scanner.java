package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*
        kullanıcıdan ismini soyismini ve yasını alıp
        girilen bilgiler = fatma cimen 34 seklinde yazdirin
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.next();
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("girilen bilgiler = "+isim+" "+soyisim+" "+yas);
    }
}
