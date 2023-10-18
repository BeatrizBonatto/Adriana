package ClasseEObjetos;

public class Estojo {
  public static void main(String[] args) {
    private String cor;
    private int compartimentos;
    private int tamanho;

    public Estojo(String cor, int compartimentos, int tamanho) {
      this.cor = cor;
      this.compartimentos = compartimentos;
      this.tamanho = tamanho;
    }
      
    //metodos
    public boolean abrir(boolean aberto) {
      if (aberto = true) {
      System.out.println("Estojo esta aberto");
    } else {
      System.out.println("Estojo esta fechado");
    }
    }
    
    public int guardar(int tamanho, String item) {
      String[] vetorEstojo = new String[tamanho]; 
      for (int i = 0; i < tamanho, i++) {
        System.out.println("O que quer guardar no esstojo?");
        item = sc.nextLine();
        vetor[i] = item;
      }
      System.out.println("Acabou o espaço no estojo");
    }
    
    //get e set 
    public String getCor() {
      return cor;
    }
    public String setCor(String cor) {
      this.cor = cor;
    }
    public int getCompartimentos() {
      return quantidadeDeCompartimentos;
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
}
