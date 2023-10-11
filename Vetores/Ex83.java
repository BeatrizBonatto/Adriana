import java.util.Scanner;

public class Ex83 {
    public static void main(String[] args) {
        int tamanhoVetor = 5;
        double[] vetor = new double[tamanhoVetor];

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira " + tamanhoVetor + " números: ");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(i + "- ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Ordem inversa:");
        for (int i = tamanhoVetor - 1; i>=0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
