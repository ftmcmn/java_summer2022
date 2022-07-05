package day12_stringManipulation;

public class Odev01 {
    public static void main(String[] args) {
        /*
        kull bir cumle ve bir harf isteyin, harfin cumlede
        var olup olmadıgını yazdırın
         */

        String cumle="bu hayatin heyecani meyacani yok";
        String kelime="bu";

        System.out.println(cumle.contains(kelime)?"var":"yok");
    }
}
