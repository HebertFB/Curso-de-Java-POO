package projetopessoas;

public class Aluno extends Pessoa{ //Herança, Aluno herda (extends) de Pessoa
    //Atributos
    private int matricula;
    private String curso;
    
    //Metodo
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada!!!");
        this.setMatricula(0);
    }
    
    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
