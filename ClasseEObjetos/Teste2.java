
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

        System.out.println("\nQual objeto gostária de vizualizar?");
        System.out.print("Resposta: ");
        int resposta = sc.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Alaude");
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
                break;

            case 2:
                System.out.println("Borracha");
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
                break;

            case 3:
                System.out.println("Celular");
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
                break;
            case 4:
                System.out.println("Disquete");
                Disquete disquete = new Disquete("azul",3.5,1.44);
                System.out.println("A cor do disquete é " + disquete.getCor());
                System.out.println("O disquete tem " + disquete.getTamanho() + "polegadas");
                System.out.println("O disquete tem capacidade de armazenamento de " + disquete.getCapacidade() + "mg");

            case 5:
                System.out.println("Estojo");
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
                break;

            case 6:
                System.out.println("Filme");
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
                    filme.escreverCritica(true);
                }
                break;

            case 7:
                System.out.println("Gato");
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
                break;

            case 8:
                System.out.println("Harpa");
                Harpa harpa = new Harpa("Dó", "Ré", "Madeira");
                System.out.println("O tom da harpa é " + harpa.getTom());
                System.out.println("O tom atual da harpa para afinar é " + harpa.getTomAtua());
                System.out.println("A harpa é feita de " + harpa.getMaterial());

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaH = sc.nextInt();

                if (respostaH == 1) {
                    harpa.cordasHarpa(true);
                    harpa.harpa(true);
                }
                break;

            case 9:
                System.out.println("Impressora");
                Impressora impressora = new Impressora(true, "Epson", "grande");
                System.out.println("A impressora possue as cores: "+ impressora.isColorido());
                System.out.println("A marca da ipressora é " + impressora.getMarca());
                System.out.println("A impressora é " + impressora.getTamanho());

                System.out.println();
                System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
                System.out.print("Resposta: ");
                int respostaI = sc.nextInt();

                if (respostaI == 1) {
                    String impressao = "Olá mundo!";
                    impressora.imprimir(impressao);
                    impressora.recarregar(false);
                    impressora.cores();
                }
                break;

            case 10:
                System.out.println("Livro");
                Livro livro = new Livro("Harry Potter", "Bloomsbury Publishing Rocco Presença",
                                        224);
                System.out.println("O nome do livro é " + livro.getNome());
                System.out.println("A editora do livro é " + livro.getEditora());
                System.out.println("O livro possue " + livro.getNumeroFolhas() + "folhas");
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
