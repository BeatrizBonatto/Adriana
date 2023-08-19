import java.util.Scanner;
import java.util.Date;

//7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

public class Ex7{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            System.out.println("Qual o dia de hoje:");
            int d1 = sc.nextInt();
            System.out.println("Agora, qual o mês:");
            int m1 = sc.nextInt();    //mês
            System.out.println("E qual o ano:");
            int a1 = sc.nextInt();    //ano

            System.out.println("Digite sua data de nascimento, separadamente(dia;mês;ano): ");
            int d2 = sc.nextInt();    //dia
            int m2 = sc.nextInt();    //mês
            int a2 = sc.nextInt();    //ano

            //primeiro, validação do ano
            if (a1 > a2):
                int dif_a = a1 - a2;

                //depois, validação do mês
                if (m1 > m2):
                    int dif_m = m1 - m2;
                else:
                    int nova_dif_a = dif_a - 1;
                    int dif_m = 12 - (m2 - m1); 
            else:
                System.out.println("Data inválida");


        sc.close();


    }

}