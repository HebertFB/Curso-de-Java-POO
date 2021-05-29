package aula13;

public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    
    //Metodos
    @Override
    public void emitirSom() {
        System.out.println("----- Mamifero -----");
        System.out.println("Som de Mamifero!!");
    }
    
}
