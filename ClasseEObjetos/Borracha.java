package ClasseEObjetos;
public class Borracha {
    String cor;
    String marca;
    boolean capa;

    public Borracha(String cor, String marca, boolean capa) {
        this.cor = cor;
        this.marca = marca;
        this.capa = capa;
    }

    public String apagar () {
        return ("Use para apagar o texto");
    }

    public String borrar () {
            return ("Use para borrar o desenho");
    }

    public String esfregar () {
            return ("Use para esfregar no papel");
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getCapa() {
        return capa;
    }
    public void setCapa(Boolean capa) {
        this.capa = capa;
    }

}
