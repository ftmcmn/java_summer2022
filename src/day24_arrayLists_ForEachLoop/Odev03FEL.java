package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Odev03FEL {
    public static void main(String[] args) {

        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
        //kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String arr1[]={"1","2","3","4"};
        String arr2[]={"5","6","3","4"};

        List<String>ortakEleman=new ArrayList<>();

        for (String each:arr1
             ) {

            for (String each2:arr2
                 ) {

               if (each.equals(each2)){
                   ortakEleman.add(each);
               }

            }

        }
        if (ortakEleman.isEmpty()){
            System.out.println("ortak eleman yoktur");
        }else System.out.println("ortakEleman = " + ortakEleman);


    }
}
