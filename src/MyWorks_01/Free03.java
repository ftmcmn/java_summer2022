package MyWorks_01;

import grupCalismasi.String;

import java.util.Scanner;

public class Free03 {
    public static void main(String[] args) {

   /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen is unvaninizi giriniz ");
        java.lang.String unvan= scan.nextLine().toLowerCase();

        if (unvan.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (unvan.equals("dev")) {
            System.out.println("Developer");
        } else if (unvan.equals("ba")) {
            System.out.println("Business Analyst");
        } else if (unvan.equals("pm")) {
            System.out.println("Project Manager");
        }
    }
}
