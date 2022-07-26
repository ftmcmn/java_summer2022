package Works;

import java.util.Arrays;

public class Yeni {
    public static void main(String[] args) {
        //Verilen bir array’deki tekrar eden elementleri yazdirin.

        int smyr[]={1,1,3,5,8,4,7,7,5,9,10};


        for (int i = 0; i <smyr.length; i++) {

            for (int j =i+1 ; j <smyr.length; j++) {

                if (smyr[i]==smyr[j] ){

                    System.out.print(smyr[i]+" ");
                }

            }




        }










    }
}
