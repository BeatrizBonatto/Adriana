package Vetores;/*91) Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se
existem números repetidos no vetor VET e em que posições se encontram.*/

import java.util.Scanner;

public class Ex91 {
    public static void main(String[] args) {
        //declarando Scanner para ultilizar em outras funções
        Scanner sc = new Scanner(System.in);

        //criar vetor com 50 numeros
        Integer tamanhoVetor = 50;
        Double[] vetorVET = new Double[tamanhoVetor];

        //usando funçao de guardar numeros no vetor
        System.out.println("Recebendo vetor de " + tamanhoVetor + " numeros");
        vetorVET = guardaNumeros(tamanhoVetor, sc);

        //Uma coluna com o numero e sua contagem de repeticoes
        Double[][] matrizRepeticoes = new Double[tamanhoVetor][2];

        matrizRepeticoes = registraNumerosExistentesMatriz(matrizRepeticoes, vetorVET, tamanhoVetor);
        matrizRepeticoes = contarRepeticoes(matrizRepeticoes, vetorVET, tamanhoVetor);
        
        imprimeRepeticoes(matrizRepeticoes, tamanhoVetor);
        
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
    
    public static Double[][] registraNumerosExistentesMatriz(Double[][] matriz, Double[] vetor, Integer tamanho) {
        int repeticao = 0;
        Double numeroAtual;

        Double[][] matrizFuncao = matriz;
        
        for (int i = 0; i < tamanho; i++) {
            numeroAtual = vetor[i];

            if(!verificaNumeroExiste(matrizFuncao, vetor[i], tamanho)) {
                matriz[encontraPosicaoDisponivelMatriz(matrizFuncao, tamanho)][0] = numeroAtual;
            }
        }
        
        return matrizFuncao;
    }

    public static Double[][] contarRepeticoes(Double[][] matriz, Double[] vetor, Integer tamanho) {

        Double[][] matrizFuncao = matriz;
        
        for (int i = 0; i < tamanho; i++) {

            double repeticoes = 0.0;
            
            for (int j = 0; j < tamanho && matrizFuncao[i][0] != null; j++) {
                if(matrizFuncao[i][0].equals(vetor[j])) {
                    repeticoes++;
                }
            }

            matrizFuncao[i][1] = repeticoes;
            
        }
        
        return matrizFuncao;
    }



    public static boolean verificaNumeroExiste(Double[][] matriz, Double numero, Integer tamanho) {
        boolean numeroExiste = false;

        //verifica se o numero ja existe na matriz
        for (int i = 0; i < tamanho; i++) {
            if (matriz[i][0] != null && matriz[i][0].equals(numero)) {
                numeroExiste = true;
                break;
            }
        }

        return numeroExiste;
    }


    public static int encontraPosicaoDisponivelMatriz(Double[][] matriz, Integer tamanho) {

        int posicao = 0;
        
        for (int i = 0; i < tamanho; i++) {
            if (matriz[i][0] == null) {
                posicao = i;
            }
        }

        return posicao;
    }

    public static void imprimeRepeticoes(Double[][] matrizRepeticoes, int tamanhoVetor) {
        for (int i = 0; i < tamanhoVetor; i++) {
            if (matrizRepeticoes[i][0] != null) {
                System.out.println("O numero " + matrizRepeticoes[i][0]
                        + " repete-se " + matrizRepeticoes[i][1] + " vezes.");
            }
        }
    }
    
}