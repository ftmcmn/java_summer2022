package odev;

import java.util.Scanner;

public class G07 {
    public static void main(String[] args) {

        //kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();

        char ilkHarf=isim.charAt(0);
        System.out.println(ilkHarf);


    }
}
