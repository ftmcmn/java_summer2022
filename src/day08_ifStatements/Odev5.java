package day08_ifStatements;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        /*
        kull gun ismini yazmasını isteyin girilen gun
        gecerli bir gun ise girilen gun isminin 1. 2. 3. harflerini
        ilk harf buyuk diger ikisi kucuk olarak yazdirin.
        gun ismi gecerli degilse "gecerli gun ismi giriniz" yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazatesi") || gunIsmi.equals("pazar")){
            System.out.println("Paz");
        }else if (gunIsmi.equals("sali")){
            System.out.println("Sal");
        }else if (gunIsmi.equals("carsamba")){
            System.out.println("Car");
        }else if (gunIsmi.equals("persembe")){
            System.out.println("Per");
        }else if (gunIsmi.equals("cuma")||gunIsmi.equals("cumartesi")){
            System.out.println("Cum");
        }else System.out.println("gecerli gun ismi giriniz");
    }
}
