import java.util.Scanner;
import java.text.DecimalFormat;

//9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário. 

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println();
            System.out.println("Consulta de reajuste do salário");
            System.out.println("");
            
            System.out.print("Digite qual o seu salário atual: R$");
            double slr1 = sc.nextInt();

            double rjst = 0.12;
            double slr2 = slr1 + (slr1 * rjst);

        sc.close();
        
        DecimalFormat def = new DecimalFormat("#,###.00");

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Reajuste deste mês será de 12%");
        System.out.println();
        System.out.println("Seu novo salário será de R$" + def.format(slr2));
        System.out.println("-------------------------------------");
        System.out.println();

    }
}