package aula11;

public class Professor extends Pessoa{  //Herança, Professor herda (extends) da classe abstrata Pessoa
    //Atributos
    private String especialidade;
    private float salario;
    
    //Metodos
    public void inforProfessor(){
        System.out.println("Especialista em: " + this.getEspecialidade());
    }
    public void receberAumento(float aumento){
        System.out.println("Professor " + this.getNome() + " recebeu um aumento de R$" + aumento);
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Salario atual R$" + this.getSalario());
        System.out.println(" ");
    }
    public void receberSalario(){
        System.out.println("Professor " + this.getNome() + " sacou o salario de R$" + this.getSalario());
        this.setSalario(this.getSalario() - this.getSalario());
        System.out.println("Saldo atual para receber R$" + this.getSalario());
        System.out.println(" ");
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
