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

}
