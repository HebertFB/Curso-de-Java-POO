package aula12;

public class Ave extends Animal{
    //Atributos
    private String corPena;
    
    //Metodos Sobrepostos
    @Override
    public void locover() {
        System.out.println("\n--- Ave ---");
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("\n--- Ave ---");
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n--- Ave ---");
        System.out.println("Som de ave!!!");
    }
    
    //Metodos
    public void fazerNinho(){
        System.out.println("\n--- Ave ---");
        System.out.println("Construiu um ninho!");   
    }
    
    //Getters e Setters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
