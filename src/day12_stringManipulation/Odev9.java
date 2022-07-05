package day12_stringManipulation;

import java.util.Scanner;

public class Odev9 {
    public static void main(String[] args) {
        /*
        kull 4 harfli bir kelime isteyin ve girilen
        kelimeyi tersten yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime=scan.nextLine();


        System.out.println(kelime.substring(3)+
                           kelime.substring(2,3)+
                            kelime.substring(1,2)+
                             kelime.substring(0,1));


    }
}
