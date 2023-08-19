import java.util.Scanner;

//15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

public class Ex15 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Digite um valor e direi se é positivo ou negativo");
        
        //entrada de valor
        Scanner sc = new Scanner(System.in);
            System.out.print("Número: ");
            double num = sc.nextDouble();
            System.out.println();
        sc.close();
        
        //condição para mensagem de positivo ou negativo
        if (num >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }
            
    }
}