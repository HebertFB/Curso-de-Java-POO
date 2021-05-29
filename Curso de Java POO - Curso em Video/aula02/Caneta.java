package aula02;

public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Metodos
    void status() {
        System.out.println("\nQual o modelo da caneta? " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Qual é o tamanho da ponta? " + this.ponta);
        System.out.println("Qual a carga da caneta? " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println(" ");
    }

    void rabiscar() {
        if (this.tampada == false) {
            System.out.println("Estou rabiscando!!!");
        } else {
            System.out.println("A caneta está tampada, destampe para rabiscar!!!");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
