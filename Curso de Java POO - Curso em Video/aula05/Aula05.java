package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(001);
        p1.setDono("Beto");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(002);
        p2.setDono("Jao");
        p2.abrirConta("CP");
        
        p1.depositar(777);
        p2.depositar(250);
        p1.sacar(227);
        
        p2.sacar(400);
        p2.fecharConta();
        
        p1.informacoes();
        p2.informacoes();
    }
    
}
