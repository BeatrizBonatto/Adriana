import java.util.Scanner;

//14) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//contrário escrever NÃO É MAIOR QUE 10! 

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Digite um número inteiro e direi se é maior ou menor que 10");
            System.out.print("Número: ");
            double num = sc.nextDouble();
            System.out.println();
        sc.close();
        
        if (num > 10){
            System.out.println("É MARIO QUE 10!");
        } else {
            System.out.println("NÃO É MARIO QUE 10!");
        }
        
    }
}