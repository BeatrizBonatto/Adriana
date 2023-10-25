package ClasseEObjetos;

public class Livro {
    private String nome;
    private String editora;
    private int numeroFolhas;

    public Livro(String nome, String editora, int numeroFolhas) {
        this.nome = nome;
        this.editora = editora;
        this.numeroFolhas = numeroFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }
}
