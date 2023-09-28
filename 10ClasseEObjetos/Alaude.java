package ClasseEObjetos;

import java.util.Scanner;

public class Alaude {
    private int cordas;
    private String material;
    private boolean analogico;

    public Alaude(int cordas, String material, boolean analogico){
        this.cordas = cordas;
        this.material = material;
        this.analogico = analogico;
    }

    //metodos
    Scanner sc = new Scanner(System.in);
    public void afinar(String tom) {
        System.out.println("Escolha o tom de afinação do alaude: ");
        String escolhaTom = sc.next();
        String emoji = Character.toString((char) 0x1F49B);
        System.out.println("Seu alaude foi afinado no tom"+ escolhaTom + emoji);
    }

    public void tocar(boolean som) {
        if (som){
            System.out.println("*Tocando música*");//https://www.youtube.com/watch?v=uOQMn89S4a0
        }
    }

    public void historia(String contarHistoria) {
        System.out.println("Escolha a história que gostaria de ouvir: ");
        System.out.println("1.O amor de uma princesa");
        System.out.println("2.A aventura do bardo");
        System.out.println("3.O herói improvável");
        int numHistoria = sc.nextInt();
        if (numHistoria == 1){
            System.out.println("\uD83C\uDFB5Em um reino longínquo, vivia uma princesa que era tão bela quanto bondosa. Ela era amada por todos, mas seu coração era partido por um amor não correspondido.\uD83C\uDFB5 \n" +
                    "O príncipe do reino vizinho era rude e arrogante, e não a via como nada além de uma peça em seu jogo de poder.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5Um dia, a princesa decidiu que não podia mais viver assim. Ela fugiu do castelo e partiu em uma jornada para encontrar o verdadeiro amor.\uD83C\uDFB5 \n" +
                    "\uD83C\uDFB5Ao longo do caminho, ela conheceu pessoas de todos os tipos, e aprendeu muito sobre si mesma.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5Finalmente, ela chegou a um pequeno vilarejo. Lá, ela conheceu um jovem fazendeiro que era gentil e honesto.\uD83C\uDFB5 \n" +
                    "\uD83C\uDFB5Eles se apaixonaram perdidamente, e a princesa finalmente encontrou a felicidade que sempre procurou.\uD83C\uDFB5");
        } else if (numHistoria == 2) {
            System.out.println("\uD83C\uDFB5Um bardo vivia em uma pequena aldeia. Ele era um homem talentoso, e sua música era amada por todos. Um dia, ele decidiu partir em uma aventura para ver o mundo.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5O bardo viajou por muitos reinos, e viu muitas coisas maravilhosas. Ele conheceu pessoas de todos os tipos, e aprendeu muito sobre a vida.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5Em sua jornada, o bardo também enfrentou muitos perigos. Ele foi atacado por bandidos, perdido em florestas escuras, e quase morreu em um ataque de dragão.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5No entanto, o bardo sempre superou os desafios, e continuou sua jornada. Ele finalmente retornou à sua aldeia, um homem mais sábio e experiente.\uD83C\uDFB5");
        } else if (numHistoria == 3) {
            System.out.println("\uD83C\uDFB5Um jovem camponês vivia em uma pequena aldeia. Ele era um homem humilde, e não tinha grandes ambições. No entanto, ele era um homem bom e compassivo, e sempre estava disposto a ajudar os outros.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5Um dia, um exército de orcs atacou a aldeia. Os orcs eram ferozes e cruéis, e rapidamente derrotaram os defensores da aldeia.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5O jovem camponês viu a destruição e o caos, e decidiu que não poderia ficar parado. Ele pegou uma espada e uma lança, e liderou os habitantes da aldeia na luta contra os orcs.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5O jovem camponês era um lutador habilidoso, e ele inspirou os outros a lutarem com coragem. No final, os habitantes da aldeia conseguiram derrotar os orcs, e salvar a aldeia.\uD83C\uDFB5\n" +
                    "\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5" +
                    "\uD83C\uDFB5O jovem camponês foi considerado um herói, e sua história foi contada por toda a região. Ele mostrou que mesmo as pessoas mais improváveis podem fazer a diferença.\uD83C\uDFB5");
        } else {
            System.out.println("Não temos está história, desculpe \uD83D\uDE25");
        }
    }

    //get e set
    public int getCordas() {
        return cordas;
    }
    public void setCordas(int cordas){
        this.cordas = cordas;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean analogico(){ return analogico; }
    public void setAnalogico(boolean analogico) {
        this.analogico = analogico;
    }
}
