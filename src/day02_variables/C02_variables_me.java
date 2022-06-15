package day02_variables;

public class C02_variables_me {
    public static void main(String[] args) {

       /* 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        2- isim ve soyisim icin iki variable olusturun ve bunlari
        isminiz : Mehmet
        soyisminiz : Bulutluoz
        seklinde yazdirin
        3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        5 – char data turunde bir variable olusturun ve yazdirin
        6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.*/


        String isim="mehmet";
        String soyIsim="bulutluoz";
        System.out.println("isminiz :"+isim);
        System.out.println("soyisminiz :"+soyIsim);

        int sayi1=66;
        long sayi2=55;
        System.out.println(sayi1+sayi2);
        System.out.println();

        int sayi3=77;
        double sayi4=55.4;
        System.out.println(sayi3+sayi4);

        char harf='f';
        System.out.println(harf);

        int sayi5=4;
        char sayi='A';
        System.out.println(sayi5+sayi);
    }

}
