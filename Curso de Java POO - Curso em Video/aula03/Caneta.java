package aula03;

public class Caneta {
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //Metodos
    public void status() {
        System.out.println("\nQual o modelo da caneta? " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Qual é o tamanho da ponta? " + this.ponta);
        System.out.println("Qual a carga da caneta? " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println(" ");
    }

    public void rabiscar() {
        if (this.tampada == false) {
            System.out.println("Estou rabiscando!!!");
        } else {
            System.out.println("A caneta está tampada, destampe para rabiscar!!!");
        }

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
