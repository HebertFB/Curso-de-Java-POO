package aula12;

public class Cobra extends Reptil{
    //Metodos Sobrepostos
    @Override
    public void alimentar() {
        System.out.println("\n--- Cobra ---");
        System.out.println("Comendo outros animais");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n--- Cobra ---");
        System.out.println("psi! psi! psi! ");
    }
}
