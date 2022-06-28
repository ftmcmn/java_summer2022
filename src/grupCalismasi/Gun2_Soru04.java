package grupCalismasi;

public class Gun2_Soru04 {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {

        double fiyat=9;

        String sonuc=fiyat<10?"ucuz":(fiyat>=10 && fiyat<20)?"normal":"pahali";
        System.out.println(sonuc);
    }
}
