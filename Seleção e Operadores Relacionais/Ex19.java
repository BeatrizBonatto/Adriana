import java.util.Scanner;

//19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 

public class Ex19 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Entre com dois valores");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            //entrada de dados
                System.out.print("Valor 1: ");
                double val1 = sc.nextDouble();
                System.out.print("Valor 2: ");
                double val2 = sc.nextDouble();

            //condição para escrever qum é o maior
            if (val1 != val2) {
                if (val1 > val2) {
                    System.out.println();
                    System.out.println("O valor maior é " + val1);
                    break;
                } else {
                    System.out.println();
                    System.out.println("O valor maior é " + val2);
                    break;
                }
            } else {
                System.out.println();
                System.out.println("Os valores não podem ser iguais.");
            }
        }
        sc.close();
        System.out.println();
    }
}
