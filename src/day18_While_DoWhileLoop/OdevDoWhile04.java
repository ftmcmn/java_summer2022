package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevDoWhile04 {
    public static void main(String[] args) {

        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */


        int negsayiAdedi=0;
        int pozsayiAdedi=0;
        int pozsayiTop=0;
        int sayi;

        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("toplamak uzere pozitif sayilar girin, bitirmek icin 0'a basın");
            sayi=scan.nextInt();

            if (sayi<0){
                negsayiAdedi++;
                System.out.println("negatif sayi giremezsiniz");

            }else if (sayi>0){
                pozsayiTop+=sayi;
                pozsayiAdedi++;

            }

        }while (!(sayi==0));

        System.out.println("girilen pozitif sayi adedi : "+pozsayiAdedi);
        System.out.println("girilen negatif sayi adedi : "+negsayiAdedi);
        System.out.println("pozitif sayilar toplami : "+pozsayiTop);
    }
}
