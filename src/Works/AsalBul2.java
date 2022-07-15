package Works;

import java.util.Scanner;

public class AsalBul2 {
    public static void main(String[] args) {

        //  Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
        // -->> Asal sayi : 1 ve kendisinden başka böleni olmayan sayılardır
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen asal sayi olup olmadigini \nogrenmek istediginiz sayiyi giriniz");
        int sayi = scan.nextInt();
       boolean asalMi=asalMi(sayi);

    }
    private static boolean asalMi(int sayi) {
        int sayac = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }

        if(sayac == 0) {
            System.out.println(true);
        } else
            System.out.println(false);


        return false;
    }

}
