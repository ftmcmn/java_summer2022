package day12_stringManipulation;

public class Odev02 {
    public static void main(String[] args) {
        /*
        kull bir cumle ve bir kelime isteyin, kelimenin
        cumlede ki kullanımına bakarak asagidaki uc cumleden
        uygun olani yazdirin
        -girilen kelime cumlede kullanilmamis
        -girilen kelime cumlede 1 kere kullanilmis
        -girilen kelime cumlede 1den fazla kullanilmis

         */

        String cumle="bu hayatin heyecani meyacani yok bu kadar";
        String kelime="bu";

        if (!cumle.contains(kelime)){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){
            System.out.println("girilen kelime cumlede 1 kere kullanilmis");
        }else System.out.println("girilen kelime cumlede 1den fazla kullanilmis");

    }
}
