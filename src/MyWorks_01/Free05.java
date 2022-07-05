package MyWorks_01;

import grupCalismasi.String;

import java.util.Scanner;

public class Free05 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen koordinat noktasini giriniz(önce x degerini sonra da y degerini giriniz)");
        int x=scan.nextInt();
        int y=scan.nextInt();

        if (x>0 && y>0){
            System.out.println("1. bolgededir");
        }else if (x<0 && y>0){
            System.out.println("2. bolgededir");
        }else if (x<0 && y<0){
            System.out.println("3. bolgededir");
        }else if (x>0 && y<0){
            System.out.println("4. bolgededir");
        }else if (x==0){
            System.out.println("y ekseni uzerindedir");
        }else System.out.println("x ekseni uzerindedir");

    }
}
