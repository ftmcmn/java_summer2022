package MyWorks_01;

import grupCalismasi.String;

import java.util.Scanner;

public class Free07 {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hangi gunde oldugunuzu giriniz");
        java.lang.String gun=scan.next();

        int yuzGunSonra=100%7;

        switch (gun){
            case "pazartesi":
                System.out.println("100 gun sonra carsamba");
                break;
            case "sali":
                System.out.println("100 gun sonra persembe");
                break;
            case "carsamba":
                System.out.println("100 gun sonra cuma");
                break;
            case "persembe":
                System.out.println("100 gun sonra cumartesi");
                break;
            case "cuma":
                System.out.println("100 gun sonra pazar");
                break;
            case "cumartesi":
                System.out.println("100 gun sonra pazartesi");
                break;
            case "pazar":
                System.out.println("100 gun sonra sali");
                break;
            default:
                System.out.println("gecerli bir gun ismi giriniz");
        }




    }
}
