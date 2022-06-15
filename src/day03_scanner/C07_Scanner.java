package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    /*
    bir önceki soruyu tek seferde
    kullanıcıdan tüm bilgileri alarak yapınız
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi soyisminizi ve yasinizi giriniz");

        String isim= scan.nextLine();

        String soyisim=scan.next();

        int yas=scan.nextInt();
        System.out.println("girilen bilgiler = "+isim+" "+soyisim+" "+yas);

    }
}
