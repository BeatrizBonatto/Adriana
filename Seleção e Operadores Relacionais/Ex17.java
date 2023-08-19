import java.util.Scanner;
import java.text.DecimalFormat;

//17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada. 

public class Ex17 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("MÉDIA ARITIMÉTICA");
        System.out.println("-------------------------------------");
        System.out.println("Digite suas notas da avaliação 1 e 2");
        
        Scanner sc = new Scanner(System.in);
            System.out.print("- Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("- Nota 2: ");
            double n2 = sc.nextDouble();
        sc.close();
        
        //calculo da media aritimetica
        double med_a = (n1 + n2) / 2;
        
        DecimalFormat def = new DecimalFormat("####.0");
        
        System.out.println("-------------------------------------");
        if (med_a > 6) {
            System.out.println("Sua média final é " + def.format(med_a) + " .");
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Sua média final é " + def.format(med_a) + " .");
            System.out.println("Sinto muito, você foi reprovado.");
            System.out.println();
            System.out.println("Boa sorte na próxima!");
        }
        
        System.out.println("-------------------------------------");
        
    }
}