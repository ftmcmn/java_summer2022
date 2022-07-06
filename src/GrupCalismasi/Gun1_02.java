package GrupCalismasi;

import java.util.Scanner;

public class Gun1_02 {
    public static void main(java.lang.String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı


      kacGunSonraHesapla(); // method call


    }//main sonu

    public static void kacGunSonraHesapla() { //kacGunSonraHesapla diye bir method olusturduk
        Scanner scan=new Scanner(System.in);
        System.out.println("bugun Pazartesi ise 1\n Sali ise 2\n Carsamba ise3 \n persembe ise 4\n cuma ise 5\n cumartesi ise 6\n" +
                "pazar ise 7\n sayilarından birini giriniz");
        int gunSayisi=scan.nextInt();

        System.out.println("kac gun sonrasını ogrenmek istiyorsunuz?");
        int gunSonrasi=scan.nextInt();

        int bulunanGun=(gunSayisi+gunSonrasi)%7;
        if (gunSayisi<0 || gunSayisi>7){
            System.out.println("hatali secim yaptiniz");
        }else {

            switch (bulunanGun){
                case 0:
                    System.out.println(gunSonrasi + "sonra pazar gunudur");
                    break;
                case 1:
                    System.out.println(gunSonrasi + "sonra pazartesi gunudur");
                    break;
                case 2:
                    System.out.println(gunSonrasi + "sonra sali gunudur");
                    break;
                case 3:
                    System.out.println(gunSonrasi + "sonra carsamba gunudur");
                    break;
                case 4:
                    System.out.println(gunSonrasi + "sonra persembe gunudur");
                    break;
                case 5:
                    System.out.println(gunSonrasi + "sonra cuma gunudur");
                    break;
                case 6:
                    System.out.println(gunSonrasi + "sonra cumartesi gunudur");
                    break;

            }
        }

    }//kacGunSonraHesapla methodunun sonu

}
