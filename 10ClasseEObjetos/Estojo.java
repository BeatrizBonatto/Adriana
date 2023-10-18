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
    public int estaCheio(int tamanho) {
      String[] vetorEstojo = new String[tamanho]; 
      if (vetorEstojo.lengh < tamanho) {
        System.out.println("Ainda há espaço no estojo");
      } else { 
        System.out.println("Acabou o espaço no estojo")
      }
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
