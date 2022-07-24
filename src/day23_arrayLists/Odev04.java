package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odev04 {
    public static void main(String[] args) {
        //Verilen bir array’de istenmeyen harf iceren kelimeleri silip, kalan elementleri
        //yeni bir array yapin

        String arr[]={"ali","ayse","arda","fatma","elif","gunes"};

        String harf="a";

        List<String> kalanlar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!arr[i].contains("a")){
                kalanlar.add(arr[i]);
            }

        }
        String kalanlarArrayi[]=new String[kalanlar.size()];

        for (int i = 0; i <kalanlar.size() ; i++) {

            kalanlarArrayi[i]=kalanlar.get(i);

        }

        System.out.println(Arrays.toString(kalanlarArrayi));



    }
}
