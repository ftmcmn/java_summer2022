package GrupCalismasi;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();
        System.out.print("Lutfen bir soyisim giriniz :");
        String soyisim = scan.next();
        System.out.print("Lutfen kart numaranizi giriniz :");
        String kartno=scan.next();

        if (kartno.length()==16) {

            isim= isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
            soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
            kartno="**** **** **** "+ kartno.substring(kartno.length()-4);

        }else {
            System.out.print("lutfen 16 haneli kart numarasi giriniz :");
        }

        System.out.println(isim + " " +  soyisim + " " + kartno);

    }
}
