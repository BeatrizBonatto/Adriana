package ClasseEObjetos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("OBJETOS");
        System.out.println();

        System.out.println("Alaude");
        Alaude alaude = new Alaude(6, "Madeira", true);
        System.out.println("O número de cordas do alaude é: " + alaude.getCordas());
        System.out.println("O material do alaude é: " + alaude.getMaterial());
        System.out.println("O alaude é analógico: " + alaude.analogico());

        System.out.println();
        System.out.println("Gostaria de visualizar as ações?\n1- sim\n2- não");
        System.out.print("Resposta: ");
        int respostaA = sc.nextInt();

        if (respostaA == 1) {
            alaude.afinar("Sol");
            alaude.tocar(true);
            alaude.historia("1");
        }

        System.out.println("------------------------------------------------------------");

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

        System.out.println("------------------------------------------------------------");

        System.out.println("Celular");
        Celular celular = new Celular("iPhone 13", "Apple", 5000);
        System.out.println("O modelo do celular é: " + celular.getModelo());
        System.out.println("A marca do celular é: " + celular.getMarca());
        System.out.println("O preço do celular é: " + celular.getPreco());

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


        System.out.println("------------------------------------------------------------");

        System.out.println("Estojo");
        Estojo estojo = new Estojo("Vermelho", 5);
        estojo.abrir(true);
        estojo.guardar(true);
        estojo.abrir(false);

        System.out.println("------------------------------------------------------------");

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
            celular.ligar(true);
            celular.discar(true);
            celular.mandarMensagem(true);
            celular.ligar(false);
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Gato");
        Gato gato = new Gato("preto", "curto", 3);

        gato.correr(10);
        gato.arranhar();
        gato.miar();

        System.out.println("------------------------------------------------------------");


    }
}
