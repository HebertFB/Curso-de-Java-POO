package aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p = new Pessoa();  //Impossivel instancia uma classe abstrata
        
        /*Visitante v = new Visitante(); //Instaciando classe pobre (Herda tudo de uma classe abstrata)
        v.setNome("Beto");
        v.setIdade(22);
        v.setSexo("M");
        System.out.println(v.toString());*/
        
        Aluno a = new Aluno();        //Instaciando classe especializada (Herda tudo de uma classe abstrata)
        a.setNome("Peter");
        a.setIdade(18);
        a.setCurso("Ciencias");
        a.setMatricula("0123");
        a.setSexo("M");
        System.out.println(a.toString());
        a.inforAluno();
        a.pagarMensalidade();
        
        Bolsista b = new Bolsista();
        b.setNome("Camila");
        b.setIdade(21);
        b.setSexo("F");
        b.setBolsa(12.5f);
        b.setCurso("ADM");
        b.setMatricula("0124");
        System.out.println(b.toString());
        b.inforAluno();
        b.pagarMensalidade();
        
        Professor p = new Professor();
        p.setNome("Pagotto");
        p.setIdade(68);
        p.setSexo("M");
        p.setEspecialidade("Linguagem C");
        System.out.println(p.toString());
        p.inforProfessor();
        p.setSalario(4500.50f);
        p.receberAumento(1200.50f);
        p.receberSalario();
        
        Tecnico t = new Tecnico();
        t.setNome("Guanabara");
        t.setIdade(40);
        t.setSexo("M");
        t.setCurso("TI");
        t.setMatricula("0125");
        t.setRegistroProfissional("01");
        System.out.println(t.toString());
        t.inforAluno();
        t.inforTecnico();
        t.praticar();
    }
    
}
