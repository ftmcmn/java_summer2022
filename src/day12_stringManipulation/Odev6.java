package day12_stringManipulation;

public class Odev6 {
    public static void main(String[] args) {
        /*
        Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String str1 = “$13.99”
        String str2 = “$10.55”
        ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
         */

        String str1 = "$13.99".replace("$","");
        String str2 = "$10.55".replace("$","");

        double sayi1=Double.valueOf(str1);
        double sayi2=Double.valueOf(str2);

        String sonuc="$"+(sayi1+sayi2);
        System.out.println(sonuc);

    }
}
