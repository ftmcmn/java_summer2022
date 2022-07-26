package GrupCalismasi;


import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();

        isimler.add("Maria");
        isimler.add("Marina");
        isimler.add("Cate");
        isimler.add("Mehmet");
        isimler.add("Carina");
        System.out.println(isimler);

        for (String each:isimler
             ) {
            if(isimler.get(isimler.indexOf(each)).startsWith("M") && isimler.get(isimler.indexOf(each)).endsWith("a")){
                isimler.remove(each);

            }

        }
        System.out.println("isimler  M-a silinince  = " + isimler); // [Marina, Cate, Mehmet, Carina]



    }
}
