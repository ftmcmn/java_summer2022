package day18_While_DoWhileLoop;

import java.util.Scanner;

public class OdevDoWhile05 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
        */

        Scanner scan=new Scanner(System.in);
        String sifre;
        boolean hataliMi=true;
        String ozelKarakterler="";
        for (char i = 0; i < 255; i++) {

            ozelKarakterler+=i;

        }
        ozelKarakterler=ozelKarakterler.replaceAll("\\w","");


        do {
            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            if (hataliMi){
                for (int i = 0; i <sifre.length() ; i++) {

                    if (!(sifre.charAt(i)>'a' && sifre.charAt(i)<'z')){
                        System.out.println("Sifre kucuk harf icermelidir");
                    }

                    if (!(sifre.charAt(i)>'A' && sifre.charAt(i)<'Z')){
                        System.out.println("Sifre buyuk harf icermelidir");
                    }

                    if (!(ozelKarakterler.contains(sifre.substring(i,i+1)))){
                        System.out.println("sifre ozel karakter icermeli");
                    }
                    break;
                }
                if (sifre.length()<8){
                    System.out.println("sifre en az 8 karakter olmalidir");
                }

            }




        }while (!hataliMi);
        System.out.println("sifreniz kabul edilmiştir.");


    }
}
