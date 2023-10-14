/*89) Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. Calcular e escrever a
quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições.*/

import java.util.Objects;
import java.util.Scanner;

public class Ex89 {
    public static void main(String[] args) {
        //criar vetor com 15 numeros
        Integer tamanhoPadraoVetor = 15;
        Double[] vetorV1 = new Double[tamanhoPadraoVetor];
        Double[] vetorV2 = new Double[tamanhoPadraoVetor];

        //usando funçao de guardar numeros no vetor
        System.out.println("Recebendo V1");
        vetorV1 = guardaNumeros(tamanhoPadraoVetor);

        System.out.println("Recebendo V2");
        vetorV2 = guardaNumeros(tamanhoPadraoVetor);

        Integer repeticao = comparaVetor(vetorV1, vetorV2, tamanhoPadraoVetor);

        System.out.println("A quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições é: "
                + repeticao + ".");
    }

    public static Double[] guardaNumeros(Integer tamanho) {
        Double[] vetor = new Double[tamanho];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print((i+1) + " - ");
            double numero = sc.nextDouble();
            vetor[i] = numero;
        }

        return vetor;
    }

    public static Integer comparaVetor(Double[] vetor1, Double[] vetor2, Integer tamanho) {
        int repeticao = 0;

        for (int i = 0; i < tamanho; i++) {
            if (Objects.equals(vetor1[i], vetor2[i])) {
                repeticao++;
            }
        }

        return repeticao;
    }
}