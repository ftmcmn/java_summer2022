package day22_multiDimensionalArray;

public class OdevMda02 {
    public static void main(String[] args) {

        //Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        //ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

        int arr[][]={ {1,2,3}, {4,5}, {6} };

        int sonElemanCarpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j =  arr[i].length-1; j < arr[i].length; j++) {

                sonElemanCarpim*=arr[i][j];



            }

        }
        System.out.println("sonElemanCarpim = " + sonElemanCarpim);
    }
}
