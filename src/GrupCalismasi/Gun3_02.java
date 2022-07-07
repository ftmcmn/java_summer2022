package GrupCalismasi;

public class Gun3_02 {
    public static void main(String[] args) {
         /*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(pickName.charAt(pickName.indexOf("A"))+" "
                +pickName.substring(pickName.indexOf("L"),pickName.indexOf("L")+1)+" "+
                pickName.charAt(pickName.indexOf("I")));


    }
}
