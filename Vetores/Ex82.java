import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        double[] A = new double[tamanhoVetor];
        double X;
        double[] M = new double[tamanhoVetor];

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira " + tamanhoVetor + " números:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(i + "- ");
            double numero = sc.nextDouble();
            A[i] = numero;
        }

        System.out.print("Insira um valor multiplicador: ");
        X = sc.nextDouble();
        for (int i = 0; i < tamanhoVetor; i++) {
            M[i] = A[i] * X;
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(M[i]);
        }
    }
}