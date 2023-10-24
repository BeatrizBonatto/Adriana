
package ClasseEObjetos;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1- Alaude
                2- Borracha
                3- Celular
                4- Disquete
                5- Estojo
                6- Filme
                7- Gato
                8- Harpa
                9- Impressora
                10- Livro""");

        System.out.println("Qual objeto gostária de vizualizar?");
        int resposta = sc.nextInt();

        switch (resposta) {
            case 1:
                Alaude alaude = new Alaude(6, "Madeira", true);
                System.out.println("O número de cordas do alaude é: " + alaude.getCordas());
                System.out.println("O material do alaude é: " + alaude.getMaterial());
                if (alaude.analogico()) {
                    System.out.println("O alaude é analógico");
                } else {
                    System.out.println("O alaude não é analógico");
                }

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaA = sc.nextInt();

                if (respostaA == 1) {
                    alaude.afinar("Sol");
                    alaude.tocar(true);
                    alaude.historia("1");
                }

            case 2:
                Borracha borracha = new Borracha("Branca", "Mercur", false);
                System.out.println("A cor da borracha é " + borracha.getCor());
                System.out.println("A marca da borracha é " + borracha.getMarca());
                if (borracha.getCapa()) {
                    System.out.println("A borracha possui capa");
                } else {
                    System.out.println("A borracha não possui capa");
                }

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaB = sc.nextInt();

                if (respostaB == 1) {
                    borracha.apagar();
                    borracha.borrar();
                    borracha.esfregar();
                }

            case 3:
                Celular celular = new Celular("iPhone 13", "Apple", 5000);
                System.out.println("O modelo do celular é " + celular.getModelo());
                System.out.println("A marca do celular é " + celular.getMarca());
                System.out.println("O preço do celular é R$" + celular.getPreco());

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaC = sc.nextInt();

                if (respostaC == 1) {
                    celular.ligar(true);
                    celular.discar(true);
                    celular.mandarMensagem(true);
                    celular.ligar(false);
                }
            case 4:
                Estojo estojo = new Estojo("Vermelho", 5);
                System.out.println("A cor do estojo é " +estojo.getCor() +
                        "\nO estojo possui " + estojo.getCompartimentos() + "compartimentos");

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaE = sc.nextInt();

                if (respostaE == 1) {
                    estojo.abrir(true);
                    estojo.guardar(true);
                    estojo.abrir(false);
                    estojo.limpar(true);
                }
            case 5:
                Filme filme = new Filme("Up Altas Aventuras", "animação", "Pete Docter");
                System.out.println("Nome: " + filme.getNome() +
                        "\nGênero: " + filme.getGenero() +
                        "\nDiretor: " + filme.getDiretor());

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaF = sc.nextInt();

                if (respostaF == 1) {
                    filme.darNotaFilme(true);
                }
            case 6:
                Gato gato = new Gato("preto", "curto", 3);
                System.out.println("A cor do gato é " + gato.getCor());
                System.out.println("O gato tem o pelo \n" + gato.getPelo());
                System.out.println("O gato tem " + gato.getIdade() + "anos");

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaG = sc.nextInt();

                if (respostaG == 1) {
                    gato.correr(10);
                    gato.arranhar();
                    gato.miar();
                }
        }

    }
//    public void visualizar(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//        System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
//        System.out.print("Resposta: ");
//        int resposta = sc.nextInt();
//    }
}
