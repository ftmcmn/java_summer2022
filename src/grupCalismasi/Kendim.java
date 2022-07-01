package grupCalismasi;

import java.util.Scanner;

public class Kendim {
    // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
    // pazartesi hafta başlangıcı
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();

        if (kacıncıGun<1 || kacıncıGun>7){
            System.out.println("hatali gun sayisi girdiniz");
        }else {
            System.out.println("kac gun sonraki gunu ogrenmek istiyorsunuz");
            int kacGunSonra=scan.nextInt();

            int hesaplananGun=(kacıncıGun+kacGunSonra)%7;

            switch (hesaplananGun){
                case 0:
                    System.out.println("girdiginiz gunden "+kacGunSonra+ " gun sonrasi pazar");
                case 1:
                    System.out.println("girdiginiz gunden "+kacGunSonra+ " gun sonrasi pazartesi");
                case 2:
                    System.out.println("girdiginiz gunden "+kacGunSonra+ " gun sonrasi sali");
                case 3:
                    System.out.println("girdiginiz gunden "+kacGunSonra+ " gun sonrasi carsamba");
                case 4:
                    System.out.println("girdiginiz gunden "+kacGunSonra+ " gun sonrasi persembe");
                case 5:
                    System.out.println("girdiginiz gunden "+kacGunSonra+ " gun sonrasi cuma");
                case 6:
                    System.out.println("girdiginiz gunden "+kacGunSonra+ " gun sonrasi cumartesi");
            }
        }
    }
}
