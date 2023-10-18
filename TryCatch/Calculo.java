package TryCatch;

import java.util.List;

public class Calculo {
    public static void calcularTabuada(Integer numero) {
        Integer tamanhoVetor = 11;
        Integer multiplicador = 0;
        Integer[] vetorResultado = new Integer[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
           int resultado = numero*multiplicador;
           multiplicador++;
           vetorResultado[i] = resultado;
       }

        Integer numeroMultiplicador = 0;

        System.out.println();
        System.out.println("------------------");
        System.out.println("TABUADA DO " + numero);
        System.out.println("------------------");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(numero + " X " + numeroMultiplicador + " = "  + vetorResultado[i]);
            numeroMultiplicador++;
        }
        System.out.println("------------------");
    }
}
