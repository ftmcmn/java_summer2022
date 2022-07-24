package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev03 {
    public static void main(String[] args) {
        //Kullanici Q’ya basincaya kadar girecegi isimleri alarak bir liste olusturup, bu
        //isimleri bir list olarak bize donduren bir method olusturun


        Scanner scan=new Scanner(System.in);
        String isim="";

       List isimler=isimlerList(isim,scan);
        System.out.println(isimler);

    }

    private static List<String> isimlerList(String isim, Scanner scan) {
        List<String> isimler = new ArrayList<>();

        while (!isim.equalsIgnoreCase("q")){

            System.out.println("isim giriniz yoksa q ya basiniz");
            isim=scan.nextLine();

            isimler.add(isim);
            isimler.remove("q");

        }

        return isimler;
    }


}
