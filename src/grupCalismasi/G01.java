package grupCalismasi;

import java.util.Scanner;

public class G01 {
    public static void main(String[] args) {

        //kullanıcadan iki tam sayi alip bu sayilarin
        //toplam, fark ve carpimlarini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("iki tam sayi toplami : "+(sayi1+sayi2));
        System.out.println("iki tam sayinin farki : "+(sayi1-sayi2));
        System.out.println("iki tam sayi carpimi : "+sayi1*sayi2);
    }
}
