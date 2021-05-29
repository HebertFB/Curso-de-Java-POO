package aula11;

public class Aluno extends Pessoa{ //Herança, Aluno herda (extends) da classe abstrata Pessoa
    //Atributos
    private String matricula;
    private String curso;
    
    //Metodos
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga pelo aluno " + this.getNome());
    }
    public void inforAluno(){
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    }
    
    //Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
