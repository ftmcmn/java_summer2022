package grupCalismasi;

import java.util.Scanner;

public class G03 {
    public static void main(String[] args) {

        //soru3: kullanıcıdan yarıçap isteyip cemberin
        //cevresini ve dairenin alanını hesaplayıp yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();

        System.out.println("cemberin cevresi : "+2*3.14*yaricap);
        System.out.println("dairenin alani : "+3.14*yaricap*yaricap);



    }
}
