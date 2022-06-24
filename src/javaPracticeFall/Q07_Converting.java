package javaPracticeFall;

public class Q07_Converting {
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

    public static void main(String[] args) {
        double litre=1;
        double gallon=1;

        litre=gallon*3.785;

        gallon=litre*3.785;

        System.out.println(litre);
        System.out.println(gallon);

    }




}
