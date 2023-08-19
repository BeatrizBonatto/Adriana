import java.util.Scanner;
import java.text.DecimalFormat;

// 8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
// brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
// de eleitores. 

public class Ex8{
    public static void main(String[] args){
        System.out.println(); //pula linha para melhor visualização
        System.out.println("Entre com as seguintes informações: ");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

            //dados
            System.out.print("Quantidade de eleitores: ");
            int n_el = sc.nextInt();

            System.out.print("Quantidade de votos brancos: ");
            int vt_b = sc.nextInt();

            System.out.print("Quantidade de votos nulos: ");
            int vt_n = sc.nextInt();

            System.out.print("Quantidade de votos válidos: ");
            int vt_v = sc.nextInt();

            //agora, a porcentagem de cada um de acordo com os votos
            double pcnt_b = (double) vt_b / n_el * 100;
            double pcnt_n = (double) vt_n / n_el * 100;
            double pcnt_v = (double) vt_v / n_el * 100;

            sc.close();

            DecimalFormat def = new DecimalFormat("#,###.00");

            //lista de resultados
            System.out.println(); //pula linha para melhor visualização
            System.out.println("--------------------------");
            System.out.println("Resultado da votação em %");
            System.out.println("--------------------------");
            System.out.println("Branco: " + def.format(pcnt_b) + "%");
            System.out.println("Nulo: " + def.format(pcnt_n) + "%");
            System.out.println("Válido: " + def.format(pcnt_v) + "%");
            System.out.println("--------------------------");
            System.out.println(); //pula linha para melhor visualização

    }
}