package Works;

import java.util.Scanner;

public class HarfSayisi {
    /* TASK :
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==harf){
                sayac++;
            }

        }
        System.out.println(sayac);
        sayac=0;

        int i=0;

        while (i<cumle.length()){
            if (cumle.charAt(i)==harf){
                sayac++;
            }
            i++;
        }
        System.out.println(sayac);
        sayac=0;

        int a=0;
        do {
            if (cumle.charAt(a)==harf){
                sayac++;
            }
            a++;

        }while (a<cumle.length());
        System.out.println(sayac);


    }
}
