package Works;

import java.util.Scanner;

public class IsimSoyisimKartno {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:**** **** *** 1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.nextLine();
        System.out.print("Lutfen bir soyisim giriniz :");
        String soyisim = scan.nextLine();
        System.out.print("Lutfen kart numaranizi giriniz :");
        String kartno=scan.next();

       if (kartno.length()==16){

           if (isim.contains(" ") || (soyisim.contains(" "))){
               System.out.println(isim.toUpperCase().charAt(0) + isim.substring(1, isim.indexOf(" ")).replaceAll("\\w","*")+
                       isim.substring(isim.indexOf(" ")).replaceAll("\\w","*"));
               System.out.println(soyisim.toUpperCase().charAt(0) + soyisim.substring(1, soyisim.indexOf(" ")).replaceAll("\\w","*")+
                       soyisim.substring(soyisim.indexOf(" ")).replaceAll("\\w","*"));


           }else {
               System.out.println(isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w","*"));
               System.out.println(soyisim.toUpperCase().charAt(0) + soyisim.substring(1).replaceAll("\\w","*"));
           }

           System.out.println(kartno.substring(0,4).replaceAll("\\d","*").concat(" ")+
                           kartno.substring(4,8).replaceAll("\\d","*").concat(" ")+
                           kartno.substring(8,12).replaceAll("\\d","*").concat(" ")+
                           kartno.substring(12));



       }else System.out.println("gecerli bir kart numarasi giriniz");
    }
}
