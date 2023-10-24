package ClasseEObjetos;

import java.util.Scanner;

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
    if (aberto) {
      System.out.println("Estojo esta aberto");
    } else {
      System.out.println("Estojo esta fechado");
      return false;
    }
  }

  public boolean guardar(boolean guardado) {
    Scanner sc = new Scanner(System.in);
    String[] vetorEstojo = new String[tamanho];

    if (guardado) {
      for (int i = 0; i < tamanho; i++) {
        System.out.println("O que quer guardar no esstojo?");
        String item = sc.next();
        vetorEstojo[i] = item;
      }
    } System.out.println("Acabou o espaço no estojo");
    return guardado;
  }

  public boolean limpar(boolean limpo) {
    if (limpo) {
      System.out.println("Estojo limpo!");
    }
      return limpo;
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
