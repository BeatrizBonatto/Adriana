import java.util.Scanner;

/*Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em
um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois
escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no
vetor), ou NÃO ACHEI caso contrário. */

public class Ex78 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;

            String[] lista = new String[10];

            // Método para adicionar nomes à lista
            System.out.println("Digite 10 nomes:");
            for (i = 0; i < 10; i++) {
                System.out.print(i + 1 + "- ");
                lista[i] = sc.nextLine();
            }

            // Método de procurar nome
            System.out.print("Digite o nome a ser procurado: ");
            String nomeProcurado = sc.nextLine();

            // Valida o nome a ser procurado
            if (!nomeProcurado.matches("[a-zA-Z]+")) {
                System.out.println("O nome deve ser uma string.");
                return;
            }

            // Verifica se o nome foi encontrado
            boolean nomeEncontrado = false;
            for (i = 0; i < lista.length; i++) {
                if (lista[i].equals(nomeProcurado)) {
                    nomeEncontrado = true;
                    break;
                }
            }

            // Imprime a mensagem de resultado
            if (nomeEncontrado) {
                System.out.println("ACHEI");
            } else {
                System.out.println("NÃO ACHEI");
            }
        }
    }
}