package aula12;

public class Canguru extends Mamifero{
    //Metodos Sobrepostos
    @Override
    public void locover() {
        System.out.println("\n--- Canguru ---");
        System.out.println("Saltando");
    }
    public void usarBolsa(){
        System.out.println("\n--- Canguru ---");
        System.out.println("Usando bolsa");
    }
}
