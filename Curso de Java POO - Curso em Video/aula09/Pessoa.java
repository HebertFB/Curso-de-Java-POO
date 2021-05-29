package aula09;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //Metodo
    public void fazerAniver(){
        System.out.println("***************************************************");
        if (this.idade != -1) {
            this.setIdade(this.getIdade() + 1);
            System.out.println("Feliz Aniversario " + this.getNome() + "!!! Agora voce tem " + this.getIdade() + " anos!");
        } else {
            System.out.println("Impossivel fazer aniversario, informe sua idade atual!");
        }
        System.out.println("***************************************************");
    }
    public void informacoes(){
        System.out.println("-------- Informacoes do Leitor --------");
        System.out.println("Nome do Leitor: " + this.getNome());
        System.out.println("Idade do Leitor: " + this.getIdade() + " anos");
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("---------------------------------------\n");
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
