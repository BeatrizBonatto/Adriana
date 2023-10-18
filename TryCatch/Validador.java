package TryCatch;

import java.util.Scanner;

public class Validador {
    public static void validarNumero(String numero) {
        Scanner sc = new Scanner(System.in);

        try {
            int numeroInteiro = Integer.parseInt(numero);

            Calculo calculo = new Calculo();
            Calculo.calcularTabuada(numeroInteiro);

        } catch (Exception ex) {
            System.out.println("O valor inserido deve ser um número inteiro!");
            System.out.print("Escolha um número para ver tabuada: ");
            String novoNumero = sc.next();
            numero = novoNumero;
            validarNumero(novoNumero);
        }
    }
}
