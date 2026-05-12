import java.util.Scanner;
import java.util.ArrayList;



public class AnalisadorTexto {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("      ANALISADOR DE TEXTO       ");
        System.out.println("========================================");

    }

    static int contarPalavras(String texto) {
        if (texto == null || texto.trim().isEmpty()) return 0;
        String[] palavras = texto.trim().split("\\s+");
        return palavras.length;
    }


    static int contarVogais(String texto) {
        int contador = 0;
        char[] letras = texto.toLowerCase().toCharArray();

        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú'
                    || c == 'â' || c == 'ê' || c == 'î' || c == 'ô' || c == 'û'
                    || c == 'ã' || c == 'õ' || c == 'à') {
                contador++;
            }
        }
        return contador;
    }
}
