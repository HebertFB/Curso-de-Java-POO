package aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //Metodos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("-------------  MENU  -------------\n");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for(int i=0; i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println("\n\n----------------------------------");
        } else {
            System.out.println("Impossivel abrir menu!");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel aumenta volume!!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir volume!!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Volume MUDO ativado!!");
        } else {
            System.out.println("Volume ja esta MUDO!!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Volume MUDO desativado!!");
        } else {
            System.out.println("Volume MUDO ja esta desativado!!");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && ! (this.getTocando())) {
            this.setTocando(true);
            System.out.println("PLAY ativado!!");
        } else {
            System.out.println("PLAY ja esta ativado!!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando())) {
            this.setTocando(false);
            System.out.println("PAUSE ativado!!");
        } else {
            System.out.println("PAUSE ja esta ativado!!");
        }
    }
    
    //Getters e Setters
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
