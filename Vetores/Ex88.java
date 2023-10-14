/*88) Faça um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais um número
qualquer e verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo
vetor sem esse número. (Considere que não haverão números repetidos no vetor).*/

import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        //criar vetor com 20 e add mais um
        int tamanhoVetor = 20;
        double[] vetorNumeros = new double[tamanhoVetor];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite " + tamanhoVetor + " números para o vetor:");

        for (int i=0; i <tamanhoVetor; i++) {
            System.out.print((i+1) + " - ");
            double numero = sc.nextDouble();
            vetorNumeros[i] = numero;
        }
        System.out.println();

        int tamanhoVetorMaisUm = tamanhoVetor + 1;
        Double[] vetorNumerosMaisUm = new Double[tamanhoVetorMaisUm];

        Boolean existeNumero = false;

        //digitar novo numero
        System.out.println("Digite mais um número: ");
        double novoNumero = sc.nextDouble();

        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetorNumeros[i] != novoNumero) {
                vetorNumerosMaisUm[i] = vetorNumeros[i];
            } else {
                vetorNumerosMaisUm[i] = null;
                existeNumero = true;
            }
        }

        if (!existeNumero) {
            vetorNumerosMaisUm[tamanhoVetor] = novoNumero;
        }

        System.out.println("Novo vetor:");
        for (int i = 0; i < tamanhoVetorMaisUm; i++) {
            if (vetorNumerosMaisUm[i] != null) {
                System.out.println(vetorNumerosMaisUm[i]);
            }
        }
    }
}
