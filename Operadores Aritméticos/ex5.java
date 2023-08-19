import java.util.Scanner;

//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor: ");
            int a= sc.nextInt();
            System.out.println("Seu antecessor é "+(a-1));

        sc.close();
    }
}