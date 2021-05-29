package projetopessoas;

public class Professor extends Pessoa{ //Herança, Professor herda (extends) de Pessoa
    //Atributos
    private String especialidade;
    private float salario;
    
    //Metodos
    public void receberAumento(float aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
    //Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
