package ClasseEObjetos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Gatos:");
        System.out.println();

        Alaude alaude = new Alaude(6, "Madeira", true);
        System.out.println("O número de cordas do alaude é: " + alaude.getCordas());
        System.out.println("O material do alaude é: " + alaude.getMaterial());
        System.out.println("O alaude é analógico: " + alaude.analogico());
        alaude.afinar("Sol");
        alaude.tocar(true);
        alaude.historia("1");
        
        Celular celular = new Celular("iPhone 13", "Apple", 5000);
        System.out.println("O modelo do celular é: " + celular.getModelo());
        System.out.println("A marca do celular é: " + celular.getMarca());
        System.out.println("O preço do celular é: " + celular.getPreco());
        celular.ligar(true);
        celular.discar("11999999999");
        celular.mandarMensagem("11999999999", "Olá, tudo bem?");
        celular.ligar(false);
        
        Borracha borracha = new Borracha("Vermelha", "Lápis de Cor", false);
        System.out.println(borracha.apagar());
        System.out.println(borracha.borrar());
        System.out.println(borracha.esfregar());
        
        Gato gato = new Gato("preto", "curto", 3);
        gato.correr(10);
        System.out.println(gato.irritado());
        gato.miar();
        gato.brincar();
        gato.comer();
        gato.dormir();

    }
}
