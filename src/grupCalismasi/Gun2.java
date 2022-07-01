package grupCalismasi;

import java.util.Scanner;

public class Gun2 {
    public static void main(String[] args) {
        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("musteri kartiniz var mi?");
        boolean kartVarMi=scan.nextBoolean();

        System.out.println("kac urun aldiniz");
        int urunAdedi=scan.nextInt();

        System.out.println("urun fiyatini yaziniz");
        double urunFiyati=scan.nextDouble();

        double tutar;

        if (kartVarMi){ //burada ==true yapmayada gerek yokmus bu haliyle calısıyor if burda dogrudan true kabul ediyor else( degilse) false kabul ediyor
            // burada kartin olmasi durumu degerlendiriliyor
            if (urunAdedi>10){
                tutar=urunAdedi*urunFiyati*80/100;
                System.out.println(tutar);

            }else {
                tutar=urunAdedi*urunFiyati*85/100;
            }



        }else { //kartın olmamasi durumu degerlendiriliyor

            if (urunAdedi>10){
                tutar=urunAdedi*urunFiyati*85/100;
                System.out.println(tutar);

            }else {
                tutar=urunAdedi*urunFiyati*90/100;
            }

        }



    }
}
