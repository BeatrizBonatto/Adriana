package ClasseEObjetos;

import java.util.Scanner;

//exemplo da classe: https://www.adorocinema.com/filmes/filme-270074/

public class Filme {
    private String nome;
    private String genero;
    private String diretor;

    public Filme(String nome, String genero, String diretor){
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretor;
    }

    Scanner sc = new Scanner(System.in);
    public void darNotaFilme(boolean notaFilme){
        if (notaFilme = true) {
            System.out.println("Digite uma nota para o filme: ");
            double nota =sc.nextDouble();
            System.out.println("Obrigado por avaliar!");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
