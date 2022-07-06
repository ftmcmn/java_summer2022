package Works;

public class Email {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        String eMail="techproed@hotmail.com";

        if (!eMail.contains("@")){
            System.out.println("gecerli bir email girin");
        }else if (eMail.endsWith("@gmail.com")){
            System.out.println("email onaylandi");
        }else System.out.println("Lutfen gmail hesabinizi girin");

        boolean kontrol=eMail.contains("@");
        int index=eMail.indexOf("@");

        if (!kontrol){
            System.out.println("gecerli bir email girin");
        }else if (eMail.substring(index+1).equals("gmail.com")){
            System.out.println("email onaylandi");
        }else System.out.println("Lutfen gmail hesabinizi girin");
    }
}
