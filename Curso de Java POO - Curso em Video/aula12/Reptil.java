package aula12;

public class Reptil extends Animal{
    //Atributos
    private String corEscana;
    
    //Metodos Sobrepostos
    @Override
    public void locover() {
        System.out.println("\n--- Reptil ---");
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("\n--- Reptil ---");
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n--- Reptil ---");
        System.out.println("Som de Reptil!!!");
    }
    
    //Getters e Setters
    public String getCorEscana() {
        return corEscana;
    }

    public void setCorEscana(String corEscana) {
        this.corEscana = corEscana;
    }
    
}
