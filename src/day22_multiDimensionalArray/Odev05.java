package day22_multiDimensionalArray;

public class Odev05 {
    public static void main(String[] args) {

        //Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun.

        String arr[]={"ayse","fatma","hayriye","hayrullah","ali"};

        enUzunEnKısa(arr);

    }

    private static void enUzunEnKısa(String[] arr) {
        int enUzun=arr[0].length();
        String enUzunn="";
        int enKısa=arr[1].length();
        String enKısaa="";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()<enKısa){
                enKısa=arr[i].length();
                enKısaa=arr[i];
            }

            if (arr[i].length()>enUzun){
                enUzun=arr[i].length();
                enUzunn=arr[i];
            }

        }
        System.out.println("enKısa : "+enKısaa+ "\nenUzun : "+enUzunn);
    }
}
