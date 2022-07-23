package day22_multiDimensionalArray;

public class Odev04 {
    public static void main(String[] args) {

        //Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int arr[]={1,22,85,100,1000,5,2000,1};

       int enBu=enBuyukSayi(arr);
        System.out.println(enBu);
    }

    private static int enBuyukSayi(int[] arr) {
        int enBuyuk=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (enBuyuk<arr[i]){
                enBuyuk=arr[i];
            }

        }

        return enBuyuk;
    }
}
