package javaPracticeFall;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz ");
        String ad=scan.nextLine();
        System.out.println("lutfen memleketinizi giriniz ");
        String memleket=scan.nextLine();
        System.out.println("lutfen su anki konumuzu giriniz ");
        String konum=scan.nextLine();
        System.out.println("lutfen yasinizi giriniz ");
        int yas=scan.nextInt();
        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();


        System.out.println("yasadiginiz yeri seviyor iseniz true, degilse false yaziniz");
        boolean seviyorMu=scan.hasNextBoolean();
        if (seviyorMu){
            System.out.println("seviyorsunuz");
        }else System.out.println("sevmiyorsunuz");
    }




}
