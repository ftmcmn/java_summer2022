package Works;

public class AsalSayiBul {
    public static void main(String[] args) {
        /*
         Bir sayı asal olduğunda true, aksi halde false
         çıktısı return eden bir Java Methodu yazınız.
         -->> Asal sayi : 1 ve kendisinden başka böleni olmayan sayılardır
         */

        int sayi=13;

        asalSayiBul(sayi);
    }

    private static void asalSayiBul(int sayi) {



        for (int i = 2; i <sayi ; i++) {
            boolean asalMı=false;

           if (sayi%i==0){
               System.out.println(asalMı);
               break;

           }else System.out.println(!asalMı);
           break;


        }




    }
}
