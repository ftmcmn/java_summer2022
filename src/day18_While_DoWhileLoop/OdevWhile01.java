package day18_While_DoWhileLoop;

public class OdevWhile01 {
    /*
    While loop kullanarak 3'den 13'e kadar tum tek sayilari ekrana yazdiriniz
     */

    public static void main(String[] args) {


        int i=3;
        while ( i<13){

            if (i%2==1) {

                System.out.print(i + " ");
            }
            i++;

        }

    }
}
