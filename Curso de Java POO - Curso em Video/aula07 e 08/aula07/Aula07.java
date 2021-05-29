package aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];   //Instaciando clase do objeto Lutador com vetor com 6 lutadores
        
        //Atribuindo atributos/dados dos lutadores em cada posicao do vetor(cada posicao eh um lutador)
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2 , 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0 ,2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta luta1 = new Luta();    //Instaciando clase-agrecacao Luta
        
        //Passando objetos Lutador 'l[0]' e Lutador 'l[1]' como parametros para o metodo 'marcarLuta()'
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
        l[0].status();
        l[1].status();
    }
    
}
