package ClasseEObjetos;

public class Disquete {
  private String cor;
  private double tamanho;
  private double capacidade;

  public Disquete (String cor, double tamanho, double capacidade) {
    this.cor = cor;
    this.tamanho = tamanho;
    this.capacidade = capacidade;
  }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
