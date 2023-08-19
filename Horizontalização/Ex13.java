package Horizontalização;

import java.util.Scanner;
import java.text.DecimalFormat;


//13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
//final é:
//                  n1 * 2 + n2 * 3 + n3 * 5
//mediafinal = -----------------------------------
//                              10 

public class Ex13 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("MÉDIA FINAL");
        System.out.println("");
        System.out.println("Digite suas notas abaixo");
        System.out.println("-------------------------------------------------");
        
        //dados das notas do aluno
        Scanner sc = new Scanner(System.in);
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double n3 = sc.nextDouble();
            System.out.println("-------------------------------------------------");
        sc.close();
        
        //calculo da media final
        double medf = ((n1*2)+(n2*3)+(n3*5))/ (2+3+5) ;
        
        //mensagem de acordo com a nota
        DecimalFormat def = new DecimalFormat("####.00");
        
        if (medf > 5){
            System.out.println("Parabéns! Sua média final é " + def.format(medf) + ".");
        } else if (medf == 5) {
            System.out.println("Sua média final é " + def.format(medf) + ", na média.");
        } else {
            System.out.println("Sinto muito, sua média final foi " + def.format(medf) + ".");
            System.out.println("Boa sorte na próxima!");
            System.out.println();
            System.out.println("Lembrando que os pesos das notas são 2, 3 e 5 respectivamente");
        }
    }
}