package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Odev05 {
    public static void main(String[] args) {
        //) Verilen bir sayidan kucuk tum Fibonacci sayilarini bir liste olarak olusturup
        //yazdirin.

        int sayi=56;

        List<Integer> fibonacci=new ArrayList<>();

        int ilk=0;
        int ilkiki=1;
        int son=0;
        fibonacci.add(ilk);
        fibonacci.add(ilkiki);

        while (son<sayi){

            son=ilk+ilkiki;
            ilk=ilkiki;
            ilkiki=son;

            fibonacci.add(son);
        }
        fibonacci.remove(fibonacci.size()-1);
        System.out.println(fibonacci);
    }
}
