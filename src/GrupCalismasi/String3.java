package GrupCalismasi;

public class String3 {
    public static void main(java.lang.String[] args) {
        /*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
        String  harfDeposu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char a=harfDeposu.charAt(harfDeposu.indexOf("A"));//A
        char l=harfDeposu.charAt(harfDeposu.indexOf("L"));//L
        char ı=harfDeposu.charAt(harfDeposu.indexOf("I"));//I

        System.out.println(""+a+l+ı);

    }
}
