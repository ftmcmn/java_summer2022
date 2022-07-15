package Works;

import java.util.Scanner;

public class ForDoWhile {
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

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        int sayac=0;

        for (int i = 0; i <cumle.length() ; i++) {


            if (cumle.charAt(i)==harf){

                sayac++;

            }


        } System.out.println(sayac);

        sayac=0;

        int a=0;
        while (a<cumle.length()){

            if (cumle.charAt(a)==harf){
                sayac++;
            }
            a++;
        }
        System.out.println(sayac);

        sayac=0;

        int s=0;

        do {
            if (cumle.charAt(s)==harf){
                sayac++;
            }
            s++;

        }while (s<cumle.length());
        System.out.println(sayac);







    }
}
