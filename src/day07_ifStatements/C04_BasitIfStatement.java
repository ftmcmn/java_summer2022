package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {
       /* Soru 3) Kullanicidan gun ismini alin ve haftaici veya
        hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilenGun=scan.next().toUpperCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("girilen gun haftasonu");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                ||girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") ||girilenGun.equals("cuma")){
            System.out.println("girilen gun haftasonu");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                ||girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") ||girilenGun.equals("cuma")
                 ||girilenGun.equals("pazar") || girilenGun.equals("cumartesi"))){
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }

    }
}
