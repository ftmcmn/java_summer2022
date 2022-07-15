package day18_While_DoWhileLoop;

public class OdevDoWhile01 {
    public static void main(String[] args) {
        /*
        9 dan 190 a kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
         */

        int sayi=9;

        do {
            if (sayi%7==0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }while (sayi<190);


    }
}
