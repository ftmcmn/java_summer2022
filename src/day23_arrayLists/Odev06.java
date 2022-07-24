package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Odev06 {
    public static void main(String[] args) {
        //1’den baslayarak istenen kadar Fibonacci sayisini bir liste olarak
        //olusturup yazdirin.

        int size=10;
        List<Integer> fibonacci=new ArrayList<>();

        int ilk=0;
        int ilkiki=1;
        int son=0;
        fibonacci.add(ilk);
        fibonacci.add(ilkiki);

        while (!(fibonacci.size()==size)){

            son=ilk+ilkiki;
            ilk=ilkiki;
            ilkiki=son;

            fibonacci.add(son);
        }

        System.out.println(fibonacci);


    }
}
