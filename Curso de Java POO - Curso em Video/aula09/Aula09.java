package aula09;

public class Aula09 {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Hebert", 23, "Masculino");
        
        Livro l = new Livro("A Arte da Guerra", "Sun Tzu", 64, p);
        
        l.detalhes();
        l.abrir();
        l.folhear();
        l.voltarPag();
        l.avancarPag();
        l.avancarPag();
        p.fazerAniver();
        l.detalhes();
    }
    
}
