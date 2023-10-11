import java.util.Scanner;

/*86) Faça um algoritmo para ler 10 números e armazenar em um vetor. 
Após isto, o algoritmo deve ordenar os números no vetor em ordem crescente. 
Escrever o vetor ordenado. */

public class Ex86 {
    public static void main(String[] args) {
        //criar vetor
        int tamanhoVetor = 10;
        double[] vetorNumeros = new double[tamanhoVetor];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite " + tamanhoVetor + "números para o vetor:");
        for (int i=0; i <tamanhoVetor; i++) {
            System.out.println((i+1) + " - ");
            double numero = sc.nextDouble();
        }

        //organizar numeros em ordem crescente
    }
}