package grupCalismasi;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {

        //kullanicidan karenin bir kenar uzunlugunu alin
        //ve karenin cevresini ve alanini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen karenin kenar uzunlugunu cm cinsinden giriniz");
        double kenarUzunlugu=scan.nextDouble();

        kenarUzunlugu/=100;

        System.out.println("karenin cevresi : "+ 4*kenarUzunlugu+ " m dir");
        System.out.println("karenin alani : " +kenarUzunlugu*kenarUzunlugu +" m karedir");



    }
}
