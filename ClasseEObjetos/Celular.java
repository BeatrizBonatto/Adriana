package ClasseEObjetos;

import java.util.Scanner;

public class Celular {
    private String modelo;
    private String marca;
    private double preco;

    public Celular(String modelo, String marca, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public boolean ligar(boolean ligandoCelular) {
        if (ligandoCelular = true){
            System.out.println("Celular ligando");
        } else {
            System.out.println("Celular desligando");
        }
        return ligandoCelular;
    }

    public boolean discar(boolean telefonado) {
        Scanner sc = new Scanner(System.in);
        if (telefonado = true){
            System.out.println("digite o numero para o qual quer ligar:");
            String num = sc.nextLine();
            System.out.println("Ligando para " + num + "...");
        }
        return telefonado;
    }

    public String mandarMensagem(boolean mensagem) {
        Scanner sc = new Scanner(System.in);
        if (mensagem = true){
            System.out.println("DIgite a mensagem que quer enviar:");
            String msg = sc.next();
            System.out.println("digite o numero para o qual quer enviar:");
            String numero = sc.nextLine();
            System.out.println("Mensagem" + msg  + " enviada para " + numero);
        }
        return null;
    }
        
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
