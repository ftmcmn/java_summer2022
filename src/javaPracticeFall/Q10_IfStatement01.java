package javaPracticeFall;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Y veya N harfinden birini giriniz ");
        char input=scan.next().toUpperCase().charAt(0);

        if (input=='Y'){
            System.out.println("YES");
        }else if (input=='N') System.out.println("NO");
    }

}
