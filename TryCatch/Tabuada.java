package TryCatch;

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Validador validador = new Validador();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("GERADOR DE TABUADA");
        System.out.print("Escolha um número para ver tabuada: ");
        Integer numero = sc.nextInt();
        System.out.println();
        Validador.validarNumero(numero);
        sc.close();
    }
}
