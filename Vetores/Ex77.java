public class Ex77 {
    public static void main(String[] args) {
        System.out.println("   1  2  3  4  5  6  7  8");
        System.out.println("V  5  1  4  2  7  8  3  6");

        int[] vetor = {5, 1, 4, 2, 7, 8, 3, 6};
        int i;

        for (i = 8; i >= 5; i--) {
            if (i < vetor.length) {
                int aux = vetor[i];
                vetor[i] = vetor[8 - i + 1];
                vetor[8 - i + 1] = aux;
            }
        }

        int aux = vetor[3];
        vetor[3] = vetor[1];
        vetor[aux] = vetor[vetor[2]];

        System.out.println();
         System.out.print("   ");
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }
    }
    }
