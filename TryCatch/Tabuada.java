package TryCatch;

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Validador validador = new Validador();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("GERADOR DE TABUADA");
        System.out.print("Escolha um número para ver tabuada: ");
        String numero = sc.next();
        System.out.println();
        Validador.validarNumero(numero);
        sc.close();
        System.out.println("Espero ter ajudado!");
    }
}
