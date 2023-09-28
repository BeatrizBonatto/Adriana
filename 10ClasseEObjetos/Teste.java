package ClasseEObjetos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Gatos:");
        System.out.println();

        Gato gato1 = new Gato("preto", "curto", 3);
        System.out.println("O gato 1 é "+gato1.getCor() + ", tem pelo "+gato1.getPelo() +"e tem "+gato1.getIdade()+ " anos");
        System.out.println();

    }
}
