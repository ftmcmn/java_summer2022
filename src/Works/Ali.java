package Works;

public class Ali {
    public static void main(String[] args) {
        /*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(pickName.substring(pickName.indexOf("A"),pickName.indexOf("A")+1)+" "+pickName.charAt(pickName.indexOf("L"))+" "+
                pickName.charAt(pickName.indexOf("I")));



    }
}
