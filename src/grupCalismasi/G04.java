package grupCalismasi;

import java.util.Scanner;

public class G04 {
    public static void main(String[] args) {
        //kullanicidan dikdortgenler prizmasinin
        //uzun, kisa kenarlarinin uzunluğunu ve yuksekligini
        //isteyip prizmanin hacmini hesaplayip yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("prizmanin uzun kenarını cm cinsinden giriniz");
        double uzunKenar= scan.nextDouble();
        System.out.println("prizmanin kisa kenarını cm cinsinden giriniz");
        double kisaKenar= scan.nextDouble();
        System.out.println("prizmanin yuksekligini cm cinsinden giriniz");
        double yukseklik= scan.nextDouble();

        System.out.println("prizmanin hacmi : "+uzunKenar*kisaKenar*yukseklik);



    }
}
