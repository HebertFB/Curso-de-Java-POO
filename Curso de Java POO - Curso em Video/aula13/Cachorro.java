package aula13;

public class Cachorro extends Lobo {
    //Metodo Sobreposto
    @Override
    public void emitirSom() {
        System.out.println("----- Cachorro -----");
        System.out.println("Au! Au! Au! ");
    }

    //Metodo Sobrecarga (Sobrecarregado)
    public void reagir(String frase) {
        System.out.println("----- String -----");
        if (frase == "toma comida" || frase == "Ola") {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        System.out.println("----- Int, Int -----");
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean dono) {
        System.out.println("----- Boolean -----");
        if (dono == true) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }

    public void reagir(int idade, float peso) {
        System.out.println("----- Int, Float -----");
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

}
