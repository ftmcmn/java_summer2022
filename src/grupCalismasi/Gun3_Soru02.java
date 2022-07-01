package grupCalismasi;

public class Gun3_Soru02 {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        int ayNo=2;
        int yil=2024;

       if (ayNo<=0 || ayNo>12){
           System.out.println("gecerli bir ay numarasi giriniz");
       }else {
           switch (ayNo){
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12:
                   System.out.println("31 gundur");
                   break;
               case 4:
               case 6:
               case 9:
               case 11:
                   System.out.println("30 gundur");
                   break;
               default:
                   if (yil%4==0){
                       System.out.println("29 gundur");

                   }else System.out.println("28 gundur");
           }
       }
    }
}
