package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        /*
        kullanıcıdan ismini alıp ilk harfini
         buyuk harf olarak yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        System.out.println("ismin ilk harfi :"+ilkHarf);

    }
}
