package aula11;

public class Tecnico extends Aluno{ //Herança, Tecnico herda (extends) tudo da classe Aluno, que herda da classe abstrata Pessoa
    //Atributos
    private String registroProfissional;
    
    //Metodos
    public void inforTecnico(){
        System.out.println("Registro Profissional: " + this.getRegistroProfissional());
    }
    public void praticar(){
        System.out.println("Tecnico " + this.getNome() + " esta praticando!");
    }
    
    //Getters e Setters
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    

}
