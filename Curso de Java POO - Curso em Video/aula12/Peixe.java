package aula12;

public class Peixe extends Animal{
    //Atributos
    private String corEscama;
    
    //Metodos Sobrepostos
    @Override
    public void locover() {
        System.out.println("\n--- Peixe ---");
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("\n--- Peixe ---");
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n--- Peixe ---");
        System.out.println("Peixe nao emiti som!!!");
    }
    
    //Metodos
    public void soltarBolha(){
        System.out.println("\n--- Peixe ---");
        System.out.println("Peixe soltou uma bolha de ar!");
    }
    
    //Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
