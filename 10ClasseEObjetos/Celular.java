package ClasseEObjetos;

public class Celular {
    private String modelo;
    private String marca;
    private double preco;

    public void Celular(String modelo, String marca, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public void ligar(boolean ligando) {
        if (ligando = true){
            System.out.println("Ligando celular");
        } else {
            System.out.println("Desligando celular");
    } 
        
    public void discar(String numero) {
        System.out.println("Digite um numero para ligar: ")
        numero = sc.nextLine();
        System.out.println("Ligando para " + numero + " ...");

    public void mandarMensagem(String numero, String mensagem) {
        System.out.print("Digite um numero para ligar: ");
        numero = sc.nextLine();
        System.out.println("Qual mensagem deseja enviar?");
        mensagem = sc.nextLine();
        System.out.println("Mandando mensagem para " + mensagem + "para o numero " + numero);
        
        
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
