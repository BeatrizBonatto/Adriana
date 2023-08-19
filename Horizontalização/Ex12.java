package Horizontalização;

import java.util.Scanner;
import java.text.DecimalFormat;


//12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius (baseado na fórmula abaixo):
//    C          F - 32
//---------- = -----------
//    5            9
//Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F.

public class Ex12 {
    public static void main(String [] args) {
        System.out.println();
        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("");
        System.out.println("Fahrenheit -> Celsius");
        System.out.println("--------------------------");
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Fahrenheit: ");
            double f = sc.nextDouble();
        sc.close();
        
        //conversão
        double c = ((f - 32) / 9) * 5;
        
        DecimalFormat def = new DecimalFormat("#,###.0");
        
        System.out.println("Resultado: " + def.format(c) + "°C");
        System.out.println("--------------------------");
        System.out.println();
    }
}