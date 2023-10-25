package ClasseEObjetos;

public class Impressora {
    private boolean  colorido = false;
    private String marca;
    private String tamanho;

    public Impressora(boolean colorido, String marca, String tamanho) {
        this.colorido = colorido;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    //imprimir
    public void imprimir(String impressao) {
        int caracteres = impressao.length();

        for (int i = 0; i < caracteres+4; i++) {
            System.out.print("-");
        }

        System.out.println("\n\n| " + impressao + " |\n");

        for (int i = 0; i < caracteres+4; i++) {
            System.out.print("-");
        }
    }

    public void recarregar(boolean refilFolhas) {
        if (!refilFolhas) {
            System.out.println("ATENÇÃO: Acabaram as folhas!!\nPor favor, insira mais papel");
        }
    }

    public void cores() {
        if(isColorido()){
            System.out.println("azul, amarela, vermelha e preta");
        }
        System.out.println("apenas preta");
    }

    public boolean isColorido() {
        return colorido;
    }

    public void setColorido(boolean colorido) {
        this.colorido = colorido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
