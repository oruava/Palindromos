import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        System.out.println(esPalindromo("radar"));

    }
    public static boolean esPalindromo(String cadena) {
        String palabrainvertida = "";
        for (int i = cadena.length()-1 ; i >= 0; i--) {
            palabrainvertida += cadena.charAt(i);
        }
        if (palabrainvertida.equals(cadena)){
            return true;
        }
        return false;
    }
}
