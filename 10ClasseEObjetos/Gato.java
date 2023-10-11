package ClasseEObjetos;

//imagens: https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Collage_of_Six_Cats-02.jpg/1024px-Collage_of_Six_Cats-02.jpg

public class Gato {
    //atributos
    private double velocidade;
    private String cor;
    private String pelo;
    private double idade;


    public Gato(String cor, String pelo, double idade) {
        this.cor = cor;
        this.pelo = pelo;
        this.idade = idade;
    }

    //metodos
    public void correr (double distancia) {
        if (velocidade > 0) {
            velocidade = 5;
        }
        System.out.println("O gato percorreu a distancia de "+distancia);
    }
    public String irritado () {
        return ("Cuidado, ele irá arranhar");

    }
    public void miar () {
        if (idade >0) {
            System.out.println("Miau");
        }
    }

    //get e set
    public double getVelocidade () {
        return velocidade;
    }
    public void setVelocidade (double velocidade) {

    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPelo() {
        return pelo;
    }
    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    public double getIdade() {
        return idade;
    }
    public void setIdade(double idade) {
        this.idade = idade;
    }
}
