package Works;

import java.util.Scanner;

public class Sesli {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String str= scan.next();
        char harf=str.charAt(0);

        if (str.length()>1 || !(harf>='a' && harf<='z')){
            System.out.println("yanlıs karakter");
        }else {
            for (char i = 'a'; i <='z'; i++) {

                if (i=='a' || i=='e' || i=='u' || i=='o' || i=='i'){
                    System.out.println("sesli");

                }else System.out.println("sessiz");



            }

        }









    }
}
