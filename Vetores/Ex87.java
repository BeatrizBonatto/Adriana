
/*87) O mesmo exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja,
mantendo a ordem crescente do vetor.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex87 {
    public static void  main(String[] args) {
        //criar vetor
        int tamanhoVetor = 10;
        // tamanho com mais um espaço por conta do enunciado que estabele a inserção de mais um elemento
        int tamanhoVetorMaisUm = tamanhoVetor + 1;
        double[] vetorNumeros = new double[tamanhoVetorMaisUm];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite " + tamanhoVetor + " números para o vetor:");
        // inserção de apenas 10 posições por conta do enunciado
        for (int i=0; i <tamanhoVetor; i++) {
            System.out.print((i+1) + " - ");
            double numero = sc.nextDouble();
            vetorNumeros[i] = numero;
        }
        System.out.println();

        //organizar numeros em ordem crescente
        Arrays.sort(vetorNumeros);

        //print vetor
        System.out.println("O vetor em ordem crescente é:");
        for (int i=0; i < tamanhoVetor; i++) {
            if (i < (tamanhoVetor-1)){
                System.out.print(vetorNumeros[i] + ", ");
            } else {
                System.out.print(vetorNumeros[i] + ".");
            }
        }
        System.out.println("");

        //novo numero
        System.out.print("Insira um novo número: ");
        double novoNumero = sc.nextDouble();
        vetorNumeros[tamanhoVetor] = novoNumero;

        Arrays.sort(vetorNumeros);
        System.out.println();

        //print vetor
        System.out.println("O vetor em ordem crescente é:");
        // impressão de todos os elementos inclusive novo número obtido anteriormente
        for (int i=0; i < tamanhoVetorMaisUm; i++) {
            if (i < (tamanhoVetor)){
                System.out.print(vetorNumeros[i] + ", ");
            } else {
                System.out.print(vetorNumeros[i] + ".");
            }
        }
    }
}
