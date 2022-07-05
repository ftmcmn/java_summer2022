package day12_stringManipulation;

public class Odev4 {
    public static void main(String[] args) {
        /*
           Kullanicidan bir cumle isteyin.
           Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
           “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
           iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */

        String cumle=" usta";


        if (cumle.toLowerCase().contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.toLowerCase().contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");



    }
}
