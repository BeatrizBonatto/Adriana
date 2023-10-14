import java.util.Scanner;

/*85) Faça um algoritmo para ler e armazenar em um vetor a temperatura média
de todos os dias do ano.
Calcular e escrever:
a) Menor temperatura do ano
b) Maior temperatura do ano
c) Temperatura média anual
d) O número de dias no ano em que a temperatura foi inferior a média anual*/

public class Ex85 {
    public static void main(String[] args) {

        Ex85 ex85 = new Ex85();

        // definir ano para registro
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o ano: ");
        Integer ano = sc.nextInt();
        Integer anoDias = ex85.defineDias(ano);

        // vetor de 365 ou 366 dias
        Double[] vetorTemperaturasDias = new Double[anoDias];

        System.out.println();
        //gravar temperatura em cada dia
        for (int i=0;i < ex85.defineDias(ano);i++) {
            System.out.print("Digite a temperatura média do dia " + (i+1) + " : ");
            Double temperaturaDia = sc.nextDouble();
            vetorTemperaturasDias[i] = temperaturaDia;
        }

        //comparar pra achar menor
        Double menor = vetorTemperaturasDias[0];

        for (int i = 1; i < anoDias; i++) {
            if (menor > vetorTemperaturasDias[i]) {
                menor = vetorTemperaturasDias[i];
            }
        }
        System.out.println("A menor temperatura do ano foi " + menor + "°C.");

        //comparar pra achar maior
        double maior = vetorTemperaturasDias[0];

        for (int i = 1; i < anoDias; i++) {
            if(vetorTemperaturasDias[i] > maior) {
                maior = vetorTemperaturasDias[i];
            }
        }
        System.out.println("A menor temperatura do ano foi " + maior + "°C.");

        //média do ano
        Double somaTemperaturas = 0.0;
        for (int i=0; i < vetorTemperaturasDias.length; i++) {
            somaTemperaturas = somaTemperaturas + vetorTemperaturasDias[i];
        }

        Double mediaTemperatura = somaTemperaturas / vetorTemperaturasDias.length;
        System.out.println("A média de temperaturas do ano é de " + mediaTemperatura + " °C.");

        /*comparar e ver as temperaturas menores que a média*/
        Double[] vetorTemperaturasAbaixoMedia = new Double[anoDias];
        for (int i=0; i < vetorTemperaturasDias.length; i++) {
            if (vetorTemperaturasDias[i] < mediaTemperatura) {
                vetorTemperaturasAbaixoMedia[i] = vetorTemperaturasDias[i];
            }
        }

        System.out.println("As temperaturas abaixo da média do ano foram: ");
        for (int i=0; i<vetorTemperaturasAbaixoMedia.length; i++) {
            if (vetorTemperaturasAbaixoMedia[i] != null) {
                System.out.println(vetorTemperaturasAbaixoMedia[i]);
            }
        }
    }

    //descorir se o ano é bixesto ou não e retornar quantidade de dias
    public Integer defineDias(Integer ano) {
        Integer quantidadeDias = 365;
        if (ano % 4 == 0) {
            quantidadeDias = 366;
        }
        return quantidadeDias;
    }

}
