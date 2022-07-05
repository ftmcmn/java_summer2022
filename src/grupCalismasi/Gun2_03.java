package grupCalismasi;

import java.util.Scanner;

public class Gun2_03 {
    public static void main(String[] args) {

        //soru3: kullanıcıdan yarıçap isteyip cemberin
        //cevresini ve dairenin alanını hesaplayıp yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cemberin yaricapini giriniz  ");
        double yariCap=scan.nextDouble();


        System.out.println("cemberin cevresi :"+ 2*Math.PI*yariCap);
        System.out.println("cemberin alani :" +Math.PI *yariCap*yariCap);
    }
}
