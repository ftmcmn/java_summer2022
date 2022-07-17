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
        System.out.println("birseyler yaziniz");



/*
       while (!str.equalsIgnoreCase("x")){

           str=scan.nextLine();
           System.out.println("program calısıyor");

        }
        System.out.println("program bitti");



       do {


            System.out.println("çalıstı");




        }while (!str.equalsIgnoreCase("x"));
        System.out.println("program bitti");

*/      int num=2;
        for (int i = 0; i <num; i++) {


            str=scan.nextLine();

            if (str.equalsIgnoreCase("x")) break;
            if (i==num-1) break;
            System.out.println("program çalısıyor");

        }
        System.out.println("bitti");

    }
}
