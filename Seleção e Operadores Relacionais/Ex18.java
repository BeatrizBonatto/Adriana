import java.util.Scanner;

//18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). 

public class Ex18 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Confira se você poderá votar neste ano de 2023");
        System.out.println("----------------------------------------------");

        int ano_hoje = 2023;

        Scanner sc = new Scanner(System.in);
            System.out.print("Insira seu ano de nascimento: ");
            int ano_nascimento = sc.nextInt();
            System.out.println();
        sc.close();

        int idade = ano_hoje - ano_nascimento;

        if (idade >= 18 && idade <=70) {
            System.out.println("Você poderá votar este ano.");
        } else if (idade == 16 || idade > 70) {
            System.out.println("Seu voto não é obrigatório, mas poderá votar.");
        } else {
            System.out.println("Você não poderá votar este ano.");
        }
        System.out.println("----------------------------------------------");
        System.out.println();
    }
}
