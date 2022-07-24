package day24_arrayLists_ForEachLoop;

public class Odev01FEL {
    public static void main(String[] args) {
        //Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
        //kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        int arr[]={1,2,3,4,5};

        int carpim=1;

        for (int each:arr
             ) {

            carpim*=each;

        }
        System.out.println("carpim = " + carpim);
    }
}
