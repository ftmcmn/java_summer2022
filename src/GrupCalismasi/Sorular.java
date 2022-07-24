package GrupCalismasi;

public class Sorular {

    /*
    soru1: stack memory asagıdakilerden hangilerini barındırır?
    a) primitive data tiplerine ait degerleri
    b)Non-primitive datalara (Object) ait referanslari(adres)
    c)Non-primitive datalari
    d) hepsi
    cevap:a ve b

    soru2:asagidaki kod blogunun cıktısı nedir?

    public static void main(String[] args) {
        int a=15;
        int b=a++;
        System.out.println(b); }
        a)14 b)15 c)16 d)17
        cevap=b

    soru3:asagıdaki hangi işlemi java daha hızlı yapar?

    a)40<30 & 50==50 & 60>50
    b)40>30 & 50!=50 & 60>50
    c)40>30 && 50!=50 && 60>50
    d)40<30 && 50==50 && 60>50

    cevap:d

    soru4:Switch Statement’da asagıdaki data typeların hangileri kullanilamaz

    a)long b)double c)float d)boolean
    cevap:a b c d

    soru5:asagidaki kodlardan hangisi hata(rte) vermez?

      a) String str="team10";
        System.out.println(str.charAt(6));//exception
      b)
        String str="team10";
        System.out.println(str.substring(6));//exception vermez
      c)
        String str="team10";
        System.out.println(str.substring(4,2));//exception
      d)
        String isim=null;
        System.out.println(isim.length());//exception

        cevap:b

    soru6:asagıdaki str'a göre sıklardan hangi(leri) dogrudur?

    String str="Team10 ile basariya dogru:)";
    a)System.out.println(str.Contains("a")); //true
    b)System.out.println(str.Contains(':)')); //true
    c)System.out.println(str.startsWith("Team10")); //true
    d)System.out.println(str.endsWith(':)')); //true

    cevap: a ve c


    soru6:asagıdaki hangi methodda char kullanilamaz?
    a)replace() b)indexOf() c)lastIndexOf() d)replaceAll()
    cevap:d

    soru7:Asagıdaki Access Modifier(Erisim duzenleyici)lerin hangileri bulundugu paket(package)’den kullanilir?
    a)public b)private c)default d)protected

    cevap:a c d

    soru8:Method signature(imzası)’i degistirmek icin asagıdakilerden hangisi yanlıstır?

    a)Parametrelerin data tipleri degistirilebilir
    b)Parametrelerin sayisi degistirilebilir
-   c)Parametre sayisi ayni olmak zorunda ise farkli data tipindeki parametrelerin sirasi degistirilir
    d)method’un return type’i, access modifier’i degistirilebilir veya static kelimesi eklenebilir

    cevap:d

    soru9)for loop ta Baslangic degeri icin bitis sarti false olursa asagıdakilerden hangisi yanlıstır?
     a)loop body’si hic devreye girmez.
     b)For loop calisir ama body hic calismamis olur.
     c)sonsuz döngü olusur
     d)hepsi

     cevap: c

     soru10: hangisi statik ve instance variable için dogru degilidir?

     a)Instance (Object) Variable, class icerisinde veya baska class’larda dogrudan kullanilamaz.
     b)Instance (Object) Variable, kullanmak istedigimizde MUTLAKA object olusturmaliyiz.
     c)Class (static) Variable, class icerisinde dogrudan kullanilabilir, baska class’larda kullanmak istedigimizde object olusturmalıyız.
     d)Static variable yetkisi olan herkes tarafindan degistirilebilir ve bu degisim her obje icin gecerlidir.

     cevap:c

     soru11:Arraylerle ilgili asagıdakilerden hangisi yanlıştır?
     a) Arrays’de sadece primitive datalar veya non-primitive datalara ait referans’lar depolanabilir
     b) Arrays icindeki tum variable’lar ayni data type’inde olmalidir
     c) Stack Memory’de depolanirlar.
     d) Value ile birlikte method’lara da sahiptirler.

     cevap:c

     soru12: binarySearch( ) method’u ile ilgili asagıdakilerden hangisi yanlıstır?
     a) belli bir elemanin bir array’de olup olmadigini kontrol etmek icin kullanilir.
     b) kullanmadan once mutlaka sort( ) methodu kullanilmalidir.
     c) eleman var ise index ini döner.
     d) eleman yok ise var olsaydi sıralamada ki indexinin negatif halini döner.

     cevap: d

     soru13:Asagıdaki çıktılardan hangisi dogrudur?
     List<String> hayvan = new ArrayList<>( );
     hayvan.add("kanarya");
     hayvan.add("kumru");
     hayvan.add(1, "kartal");
     hayvan.add(0, "at");
     hayvan.add(1, "aslan");
     System.out.println(hayvan)
     a)[at, kanarya, kumru, aslan, kartal]
     b)[at, aslan, kanarya, kartal, kumru]
     c)[at, aslan, kartal, kanarya, kumru]
     d)[at, aslan, kanarya, kumru, kartal]

     cevap:b

     soru14:Asagıdaki çıktılardan hangisi yanlıstır?
     List<String> hayvan = new ArrayList<>( );
     hayvan.add("kedi");
     hayvan.add("yilan");
     hayvan.add(“kuğu");

     a)System.out.println(hayvan.remove(“kedi”)); //true
     b)System.out.println(hayvan.remove(“tavsan”)); //false
     c)System.out.println(hayvan.remove(1)); //yilan
     d)System.out.println(hayvan.remove(0)); //true

     cevap:d

     soru15:Asagıdaki çıktılardan hangisi dogrudur?
     List<String> cicekler = new ArrayList<>();
     cicekler.add("yasemin");
     cicekler.add("nilufer");

     a) System.out.println(cicekler.set(1, "papatya")); // true
     b) System.out.println(cicekler.set(2, "papatya")); // IndexOutOfBoundsException
     c) System.out.println(cicekler.clear()); //true
     d) System.out.println(cicekler.isEmpty()); //false

     cevap:b

     soru16:asList() methodu ile arrayden liste cevrilen listte asagıdaki methodlardan hangisi kullanılabilir?
     a) add()
     b) remove()
     c) clear()
     d) get()

     cevap:d

    */

}
