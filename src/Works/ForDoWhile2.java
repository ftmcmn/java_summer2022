package Works;

import java.util.Scanner;

public class ForDoWhile2 {
    /*
    sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
    DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.
     */
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

       */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "";
        str=scan.nextLine();


       while (!str.equalsIgnoreCase("x")){

           System.out.println("birseyler yaziniz");


           System.out.println("d");


        }
        System.out.println("program bitti");



   /*     do {


            System.out.println("çalıstı");




        }while (!str.equalsIgnoreCase("x"));
        System.out.println("program bitti");

*/

    }
}
