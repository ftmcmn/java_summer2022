package day18_While_DoWhileLoop;

public class OdevDoWhile02 {
    public static void main(String[] args) {
        /*
        m harfinden baslayarak c harfine kadar tum harfleri yazdirin
         */

        char bas='m';

        do {
            System.out.print(bas+" ");
            bas--;

        }while (bas>'c');
    }
}
