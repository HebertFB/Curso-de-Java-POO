package aula12;

public class Mamifero extends Animal{
    //Atributos
    private String corPelo;
    
    //Metodos Sobrepostos
    @Override
    public void locover() {
        System.out.println("\n--- Mamifero ---");
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("\n--- Mamifero ---");
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n--- Mamifero ---");
        System.out.println("Som de Mamifero!!!");
    }
    
    //Getters e Setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
