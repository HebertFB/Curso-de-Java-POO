package projetopessoas;

public class Funcionario extends Pessoa{ //Herança, Funcionario herda (extends) de Pessoa
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Metodos
    public void mudaTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
    
    //Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
