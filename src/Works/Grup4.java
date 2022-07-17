package Works;

import java.util.Scanner;

public class Grup4 {
   /* Bir Dize ve kullanıcıdan bir karakter alın
   Dizedeki verilen karakterin ilk oluşumu ile son bulunuşu arasındaki karakter sayısını sayın,
   eğer kullanıcının seçtiği karakterDize dönüşünde bir kez görüntüleniyorsa, boşluk karakterlerini saymayın.
        "Java kolaydır" - 'a' ==> 5
        "Java kolaydır" - 'w' ==> -1
        "Java kolaydır" - 'e' ==> -1
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("lutfen bir harf giriniz");
        String harf = scan.next();

        if (cumle.contains(harf)){
            if (cumle.indexOf(harf)==cumle.lastIndexOf(harf)){
                System.out.println("harf bir kez kullanılmıstır");
            }else {

                System.out.println(cumle.substring(cumle.indexOf(harf)+1,cumle.lastIndexOf(harf)).replace(" ","").length());
            }

        }else System.out.println(cumle.indexOf(harf));


    }
}
