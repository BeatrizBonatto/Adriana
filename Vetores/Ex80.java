
/*Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir o valor do
maior elemento de Q e a respectiva posição que ele ocupa no vetor. */

import javax.swing.JOptionPane;

public class Ex80 {
    public static void main(String[] args) {
        int tamanhoVetor = 20;
        double [] Q = new double[tamanhoVetor];

        //caixa de texto para entrar com os valores
        int i;
        System.out.println("Insira " + tamanhoVetor + " valores para o vetor Q");
        for (i = 0; i <tamanhoVetor; i++) {
            while (true){
                Q[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para a posição" + i + " do vetor Q"));

                if (Q[i] > 0) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "O valor deve ser positivo", null, JOptionPane.INFORMATION_MESSAGE, null);
                }
            }
        }

        //percorrer lista, encontrar maior valor e sua posição
        double maior = 0;
        int posicaoMaior = 0;
        for (i=0; i < tamanhoVetor; i++) {
            if(Q[i] > maior) {
                maior = Q[i];
                posicaoMaior = i;
            }
        }
        System.out.println("O maior elemento do vetor é " + maior + " e sua posição é " + posicaoMaior);
    }

}
