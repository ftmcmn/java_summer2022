package day12_stringManipulation;

public class Odev3 {
    public static void main(String[] args) {
        /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        */

        String eMail="ftmcmn@gmail.commm";

        if (!eMail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (eMail.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else if (!eMail.endsWith("@gmail.com")){
            System.out.println("lutfen yazimi kontol edin");
        }

    }
}
