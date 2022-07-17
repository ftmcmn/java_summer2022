package Works;

public class Grup42 {
    public static void main(String[] args) {
       /*
        a) "Son rakamın yuvarlanması:" ve son basamak 5'e eşitse, yuvarlatılmış değeri yazdırın
        b) "Son basamak yuvarlama" ve son basamak 5'ten küçükse yuvarlatılmış değeri yazdır*/

        int sayi=488;

        String sayi1=String.valueOf(sayi);

       // int sonBasamak=sayi%10;

        if (sayi1.charAt(sayi1.length()-1)== '1' ||
                sayi1.charAt(sayi1.length()-1)== '2'||
                sayi1.charAt(sayi1.length()-1)== '3'||
                sayi1.charAt(sayi1.length()-1)== '4'){

            System.out.println(sayi-sayi%10);

        }else if (sayi1.charAt(sayi1.length()-1)== '5' ||
                sayi1.charAt(sayi1.length()-1)== '6'||
                sayi1.charAt(sayi1.length()-1)== '7'||
                sayi1.charAt(sayi1.length()-1)== '8'||
                sayi1.charAt(sayi1.length()-1)== '9'){

            System.out.println(sayi+(10-sayi%10));
        }


    }
}
