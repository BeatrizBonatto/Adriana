package ClasseEObjetos;

import java.util.ArrayList;

public class Harpa {
    private String tom;
    private String tomAtua;
    private String material;

    public Harpa(String tom, String tomAtua, String material) {
        this.tom = tom;
        this.tomAtua = tomAtua;
        this.material = material;
    }

    public void harpa(boolean tonsCordas) {
            ArrayList<String> cordas = new ArrayList<>();
            cordas.add("Dó");
            cordas.add("Ré");
            cordas.add("Mi");
            cordas.add("Fá");
            cordas.add("Sol");
            cordas.add("Lá");
            cordas.add("Si");
        }

        public void cordasHarpa(boolean verHarpa) {
            if (verHarpa) {
                System.out.println("""
                    |  |  |  |  |  |  |
                       |  |  |  |  |  |
                          |  |  |  |  |
                             |  |  |  |
                                |  |  |
                                   |  |
                                      |
                                       """);
            }
        }

    public String getTom() {
        return tom;
    }

    public void setTom(String tom) {
        this.tom = tom;
    }

    public String getTomAtua() {
        return tomAtua;
    }

    public void setTomAtua(String tomAtua) {
        this.tomAtua = tomAtua;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
