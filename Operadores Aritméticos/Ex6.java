import java.util.Scanner;

//6) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. 

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor da base do retângulo(metros):");
            int b = sc.nextInt();
            System.out.println("Digite a altura(metros):");
            int a = sc.nextInt();

            int area =a*b;

            System.out.println("A área do retângulo é de "+ area + "m^2");

        sc.close();
    }
}
