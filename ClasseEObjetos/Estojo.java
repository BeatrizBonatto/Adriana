package ClasseEObjetos;

public class Estojo {
  private String cor;
  private int compartimentos;
  private int tamanho;

  public Estojo(String cor, int compartimentos) {
      this.cor = cor;
      this.compartimentos = compartimentos;
      this.tamanho = tamanho;
  }

  //metodos
  public boolean abrir(boolean aberto) {
    if (aberto = true) {
      System.out.println("Estojo esta aberto");
      return aberto;
    } else {
      System.out.println("Estojo esta fechado");
      return false;
    }
  }

  public int guardar(int tamanho, String item) {
    String[] vetorEstojo = new String[tamanho];
    for (int i = 0; i < tamanho; i++) {
      System.out.println("O que quer guardar no esstojo?");
      String item1 = item;
      vetorEstojo[i] = item1;
    }
    System.out.println("Acabou o espaço no estojo");
    return tamanho;
  }

  //get e set
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getCompartimentos() {
    return compartimentos;
  }
  public void setCompartimentos(int compartimentos) {
    this.compartimentos = compartimentos;
  }
  public int getTamanho() {
    return tamanho;
  }
  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }
}
