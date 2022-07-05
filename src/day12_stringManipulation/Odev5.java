package day12_stringManipulation;

public class Odev5 {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str="  Java ogrenmek123 Cok guzel@  ";

        str= str.trim();
        System.out.println(str);

        str=str.replace("C","c");
        System.out.println(str);
        str=str.replaceAll("\\d","");
        System.out.println(str);
        str=str.replace("@",".");
        System.out.println(str);





    }
}
