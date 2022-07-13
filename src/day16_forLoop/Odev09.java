package day16_forLoop;

import java.util.Scanner;

public class Odev09 {
    //kull bir string isteyin. kullanicinin girdiği stringin
    //palindrom olup olmadiğini kontrol eden bir program yazin.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= scan.nextLine();

        String tersten="";

        for (int i =str.length()-1; i>=0 ; i--) {

            tersten+=str.charAt(i);

        }
        System.out.println(tersten);

        if (str.equals(tersten)){
            System.out.println("girilen string palindromdur");
        }else System.out.println("girilen string palindrom degildir");
    }


}
