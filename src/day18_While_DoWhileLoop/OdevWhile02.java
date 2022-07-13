package day18_While_DoWhileLoop;

public class OdevWhile02 {
    public static void main(String[] args) {
        /*
        for ve while loop kullanarak 3 basamaklı sayilardan
        15,20 ve 90 'a tam bolunebilen sayılari yazdirin
         */

        for (int i = 100; i < 1000; i++) {

            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();

        int i=100;
        while (i<1000){
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
