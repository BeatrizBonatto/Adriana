package ClasseEObjetos;

import java.util.ArrayList;

public class Harpa {
    public static void main(String[] args) {
        
        String tom;
        String tomAtua;
        
        ArrayList<String> cordas = new ArrayList<>();
        cordas.add("Dó");
        cordas.add("Ré");
        cordas.add("Mi");
        cordas.add("Fá");
        cordas.add("Sol");
        cordas.add("Lá");
        cordas.add("Si");
        
        
        public String cordasHarpa(){
            System.out.println("|  |  |  |  |  |  |  |"+
                             "\n   |  |  |  |  |  |  |"+
                             "\n      |  |  |  |  |  |"+
                             "\n         |  |  |  |  |"+
                             "\n            |  |  |  |"+
                             "\n               |  |  |"+
                             "\n                  |  |"+
                             "\n                     |");
        return cordasHarpa;
        }
        
        public Corda[] getCordas() {
            return this.cordas;
        }
        
        public void setCordas(Corda[] cordas) {
            this.cordas = cordas;}
        
        public String getTom() {
            return this.tom;
        }
        
        public void setTom(String tom) {
            this.tom = tom;
        }
        
        public String getTomAtual() {
            return this.tomAtual;
        }
        
        public void setTomAtual(String tomAtual) {
            this.tomAtual = tomAtual;
        }
    }
}
