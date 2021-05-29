package aula11;

public abstract class Pessoa { //Classe Abstrata
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //toString
    @Override
    public String toString() {
        System.out.println(" ");
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    //Metodos
    public final void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
