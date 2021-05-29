package aula11;

public class Bolsista extends Aluno{ //Herança, Bolsista herda (extends) tudo da classe Aluno, que herda da classe abstrata Pessoa
    //Atributos
    private float bolsa;
    
    //Metodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " e bolsista! Pagamento facilitado!");
    }
    
    //Getters e Setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}