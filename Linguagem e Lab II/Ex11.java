import java.util.Scanner;
import java.text.DecimalFormat;

// 11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
// mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
// efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
// vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

public class Ex11 {
    public static void main(String[] args) {
        
        //salario fixo
        double slr_fx = 000;
        //vendas realizadas
        int vds = 000;
        //comissão por carro vendido
        double com_car = 000 * vds;

        //calculo do salario final
        double slr_f = slr_fx + com_car + (vds*0.05);

        System.out.println("Conciderando o salário do vendedor como R$1.500,00");
        System.out.println("e a comissão por compra ");
        System.out.println("Digite quantos carros vendeu: ");
        
        //formatação do valor com casa decimal
        DecimalFormat def = new DecimalFormat("#.###,00");

            System.out.println();
            System.out.println("O salário final do vendedor será de R$" + def.format(slr_f));
            System.out.println();
    }
}
