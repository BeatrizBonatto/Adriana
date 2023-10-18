package TryCatch;

import java.util.Scanner;

public class Validador {
    public static void validarNumero(Integer numero) {
        try {
            Calculo calculo = new Calculo();
            Calculo.calcularTabuada(numero);

        } catch (Exception ex) {
            System.out.println("O valor inserido deve ser um número inteiro!");

        } finally {
            System.out.println("Prontinho");
            System.out.println("Espero ter ajudado!");
        }
    }
}
