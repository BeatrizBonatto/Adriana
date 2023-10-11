import java.util.Scanner;

public class Ex81 {
    public static void main(String[] args) {
        int tamanhoVetor = 20;
        int i;

        double []Q = new double[tamanhoVetor];

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira " + tamanhoVetor + "para o vetor Q");
        for (i = 0; i < tamanhoVetor; i++) {
            while (true) {
                System.out.print(i + " - ");
                double num = sc.nextDouble();
                Q[i] = num;

                if (Q[i] > 0) {
                    break;
                } else {
                    System.out.println("valor tem que ser positivo!");
                }
            }
        }

//      achar menor valor e sua posição
        double menor = Q[0];
        int posicao = 0;

        for (i = 1; i < tamanhoVetor; i++) {
            if (menor > Q[i]) {
                menor = Q[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor é " + menor + " e sua posiçâo é " + posicao);
    }
}
