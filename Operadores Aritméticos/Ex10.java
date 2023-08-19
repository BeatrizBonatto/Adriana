import java.util.Scanner;
import java.text.DecimalFormat;

// 10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
// distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
// calcular e escrever o custo final ao consumidor. 

public class Ex10 {
    public static void main(String[] args) {

        //dados fornecidos, fixos
        double dist = 0.28; 
        double i = 0.45;

        System.out.println();
        System.out.println("Calculadora de custo de carro novo");
        System.out.println();
        System.out.print("Entre com o custo de fábrica (formato - 0.000,00): R$");

        Scanner sc = new Scanner(System.in);

            //entrada do custo de fábricação, variavel
            double cst_f = sc.nextDouble(); 

        sc.close();

        //calculo do valor para o consumidor
        double car_n = cst_f + (dist*cst_f) + (i*cst_f);

        DecimalFormat def = new DecimalFormat("#,###.00");

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("Considerando que:");
        System.out.println();
        System.out.println("Distribuidor = 28%");
        System.out.println("Impostos = 45%");
        System.out.println("--------------------------------------------------");
        System.out.println("Custo do carro para o consumidor é de R$" + def.format(car_n));
        System.out.println("--------------------------------------------------");
        System.out.println();

    }
}