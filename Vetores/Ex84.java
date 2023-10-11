import java.util.Scanner;

/*84) Faça um algoritmo para ler um valor N qualquer 
(que será o tamanho dos vetores). Após, ler dois vetores A e B 
(de tamanho N cada um) e depois armazenar em um terceiro vetor 
Soma a soma dos elementos do vetor A com os do vetor B 
(respeitando as mesmas posições) e escrever o vetor Soma*/

public class Ex84 {
    public static void main(String[] args) {
        //define tamanho do vetor
        Scanner sc = new Scanner(System.in);
        System.out.print("Defina um valor N para tamanho do vetor: ");
        int N = sc.nextInt();
        System.out.println();

        //vetores A e B
        double[] vetorA = new double[N];
        double[] vetorB = new double[N];
        double[] somaAB = new double[N];

        //adiciona valores em A e B
        System.out.println("Insira " + N + " valores para o vetor A:");
        for (int i=0; i < N; i++) {
            System.out.print((i+1) + " - ");
            vetorA[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.println("Insira " + N + " valores para o vetor B:");
        for (int i=0; i < N; i++) {
            System.out.print((i+1) + " - ");
            vetorB[i] = sc.nextDouble();
        }

        System.out.println();

        //soma dos valores de A e B
        for (int i=0; i < N; i++) {
            double soma = vetorA[i] + vetorB[i];
            somaAB[i] = soma;
        }

        //print vetor soma
        System.out.println("Soma dos valores dos vetores:");
        for (int i=0; i < N; i++) {
            if (i < (N-1)) {
                System.out.print(somaAB[i] + ", ");
            } else {
                System.out.print(somaAB[i]);
            }
        }
    }
}