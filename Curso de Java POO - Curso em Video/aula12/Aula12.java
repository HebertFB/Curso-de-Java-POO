package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro dog = new Cachorro();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();
        
        c.locover();
        dog.locover();
        c.emitirSom();
        dog.emitirSom();
        
        /*m.setPeso(20.2f);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Bege");
        
        r.setPeso(0.55f);
        r.setIdade(1);
        r.setMembros(4);
        r.setCorEscana("Verde");
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(2);
        p.setCorEscama("Prata esverdeada");
        
        a.setPeso(2.7f);
        a.setIdade(2);
        a.setMembros(4);
        a.setCorPena("Branca e Preta");*/
        
    }
    
}
