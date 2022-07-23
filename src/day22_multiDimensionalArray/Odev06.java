package day22_multiDimensionalArray;

public class Odev06 {
    public static void main(String[] args) {
        //Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip, bize
        //true veya false sonucu donen bir method olusturun.

        String arr[]={"fatma","ayse","elif","zeynep"};



        String istenenEleman="ay";

       boolean sonuc=iceriyorMu(arr, istenenEleman);
        System.out.println(sonuc);

    }

    private static boolean iceriyorMu(String[] arr, String istenenEleman) {

        boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains(istenenEleman)) {

                sonuc=true;

            }

        }


        return sonuc;
    }
}
