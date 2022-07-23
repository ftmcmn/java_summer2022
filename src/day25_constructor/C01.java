package day25_constructor;

public class C01 {

    /*
  Java OOP konsept kullandigi icin
  olusturulan her bir class'in ihtiyac oldugunda obje uretebilmesine uygun dizayn etmistir
  Ama her class'dan obje uretilmeyebilir
  bunun icin Java ihtiyac halinde kullanilmasi icin
  her class'da default bir costructor koymustur.
  bu default constructor
  class'dan obje olusturuldugunda otomatik olarak calisir
  ornegin bu class'da constructor gorunmemesine ragmen
  C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik
 */

    public C01(int sayi) {


      this.sayi=sayi;

    }

    C01(){

    }

    int sayi=4;

   static double sayi1=3;

    public C01(int sayi, double sayi1) {

        System.out.println(sayi);
        System.out.println(sayi1);
    }


    public void deneme(){

        System.out.println("C01 den deneme method calisir");
    }

}
