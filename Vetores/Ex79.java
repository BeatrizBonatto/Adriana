import javax.swing.*;
import java.text.DecimalFormat;

public class Ex79 {
    public static void main(String[] args) {
        int[] notaAluno = new int[20];

        int i;
        for (i = 0; i < 20; i++) {
            notaAluno[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1)));
        }

        // Verifica se as notas são válidas
        for (i = 0; i < 20; i++) {
            if (notaAluno[i] < 0 || notaAluno[i] > 100) {
                JOptionPane.showMessageDialog(null, "Nota inválida.");
                return;
            }
        }

        // Calcula a média da turma
        int somaNotas = 0;
        for (i = 0; i < 20; i++) {
            somaNotas += notaAluno[i];
        }
        float mediaTurma = (float) somaNotas / 20;

        // Imprime a média da turma
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Média da turma: " + df.format(mediaTurma));

        // Imprime a quantidade de alunos com nota acima da média
        int contadorAcimaMedia = 0;
        for (i = 0; i < 20; i++) {
            if (notaAluno[i] >= mediaTurma) {
                contadorAcimaMedia++;
            }
        }
        System.out.println("Quantidade de alunos com nota acima da média: " + contadorAcimaMedia);
    }
}