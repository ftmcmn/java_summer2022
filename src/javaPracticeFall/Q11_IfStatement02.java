package javaPracticeFall;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz ");
        int not=scan.nextInt();

        if (not<0 || not>100){
            System.out.println("lutfen gecerli bir not giriniz");
        }else if (not<60){
            System.out.println("F");
        }else if (not<70){
            System.out.println("D");
        }else if (not<80){
            System.out.println("C");
        }else if (not<90){
            System.out.println("B");
        }else System.out.println("A");

    }

}
