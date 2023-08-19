import java.util.Scanner;
import java.text.DecimalFormat;

//16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra. 

public class Ex16 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("|       TABELA DE PREÇOS        |");
        System.out.println("--------------------------------");
        System.out.println("| Maçãs                         |");
        System.out.println("| - Menos de 12und - R$1,30/und |");
        System.out.println("| - Acima de 12und - R$1,00/und |");
        System.out.println("--------------------------------");
        System.out.println();
        
        //valores fixos
        double menos = 1.30;
        double acima = 1.00;
        
        //coleta de dados
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite quantas unidades quer: ");
            int num_macas = sc.nextInt();
            System.out.println();
        sc.close();
        
        DecimalFormat def = new DecimalFormat("####.00");
        
        //condicao e calculo do valor a pagar
        if (num_macas >= 12) {
            double custo = num_macas*acima ;
            
            System.out.println("---------------------------------");
            System.out.println("O valor da compra é de R$" + def.format(custo));
            System.out.println();
        } else {
            double custo = num_macas*menos ;
            
            System.out.println("---------------------------------");
            System.out.println("O valor da compra é de R$" + def.format(custo));
            System.out.println();
        }
        
    }
}