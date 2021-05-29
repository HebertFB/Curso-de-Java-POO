package aula13;

public class Aula13 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        //Testando Polimofismo de Sobrecarga
        c.reagir("Ola");
        c.reagir("Vai Apanhar");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.2f);
        c.reagir(17, 4.5f);
    }
    
}
