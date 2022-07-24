package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Odev02FEL {
    public static void main(String[] args) {
        //Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
        //loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(3);

        int kareToplam=0;

        for (int each:sayilar
             ) {
            kareToplam+=each*each;

        }
        System.out.println("kareToplam = " + kareToplam);
    }
}
