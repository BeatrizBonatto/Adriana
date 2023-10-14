/*90) Faça um algoritmo para ler um vetor de 30 números. Após isto, ler mais um número qualquer,
calcular e escrever quantas vezes esse número aparece no vetor.*/

import java.util.Objects;
import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        //declarando Scanner para ultilizar em outras funções
        Scanner sc = new Scanner(System.in);

        //criar vetor com 30 numeros
        Integer tamanhoVetor = 30;
        Double[] vetorNumeros = new Double[tamanhoVetor];

        //usando funçao de guardar numeros no vetor
        System.out.println("Recebendo vetor de " + tamanhoVetor + " numeros");
        vetorNumeros = guardaNumeros(tamanhoVetor, sc);

        //digitando numero para contar quantas vezes se repete no vetor
        System.out.print("Digite número para contar repetições no vetor: ");
        Double numero = sc.nextDouble();

        Integer repeticao = contarRepeticao(numero, vetorNumeros, tamanhoVetor);

        System.out.println("O número " + numero + " aparece " + repeticao + " vezes no vetor.");
    }

    public static Double[] guardaNumeros(Integer tamanho, Scanner sc) {
        Double[] vetor = new Double[tamanho];

        System.out.println("Digite os valores:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print((i+1) + " - ");
            double numero = sc.nextDouble();
            vetor[i] = numero;
        }

        return vetor;
    }

    public static Integer contarRepeticao(Double numero, Double[] vetor1, Integer tamanho) {
        int repeticao = 0;

        for (int i = 0; i < tamanho; i++) {
            if (Objects.equals(vetor1[i], numero)) {
                repeticao++;
            }
        }

        return repeticao;
    }
}