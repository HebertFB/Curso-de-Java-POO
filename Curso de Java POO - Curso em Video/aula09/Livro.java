package aula09;

import java.util.Random;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    //Metodos
    public void detalhes(){
        System.out.println("---------- DETALHES DO LIVRO ----------");
        System.out.println("Titulo do Livro: " + this.getTitulo());
        System.out.println("Nome do Autor: " + this.getAutor());
        System.out.println("Numero de paginas: " + this.getTotalPaginas());
        System.out.println("Livro esta Aberto? " + this.getAberto());
        System.out.println("Pagina Atual numero: " + this.getPagAtual());
        this.leitor.informacoes();
    }
    @Override
    public void abrir() {
        System.out.println("---------- Abrir Livro ----------");
        if (this.aberto == false) {
            this.setAberto(true);
            System.out.println("Livro aberto!!");
        } else {
            System.out.println("O livro ja esta aberto!!");
        }
        System.out.println(" ");
    }

    @Override
    public void fechar() {
        System.out.println("XXXXXXXXXXX Fechar Livro XXXXXXXXXXX");
        if (this.aberto == true) {
            this.setPagAtual(0);
            this.setAberto(false);
            System.out.println("Livro fechado!!");
        } else {
            System.out.println("O livro ja esta fechado!!");
        }
        System.out.println(" ");
    }

    @Override
    public void folhear() {
        System.out.println("---------- Folhear Livro ----------");
        if (this.aberto && this.getPagAtual() < this.getTotalPaginas()&& this.getPagAtual() >= 0) {
           Random aleatorio = new Random();
           int folhear = aleatorio.nextInt(this.getTotalPaginas());
           this.setPagAtual(folhear);
            System.out.println("Pagina folheada para numero: " + this.getPagAtual());
        } else {
            System.out.println("Impossivel folhear livro fechado!!");
        }
        System.out.println(" ");
    }

    @Override
    public void avancarPag() {
        System.out.println(">----------> Avancar pagina do Livro >---------->");
        if (this.aberto && this.getPagAtual() < this.getTotalPaginas()&& this.getPagAtual() >= 0) {
            System.out.println("Pagina atual numero: " + this.getPagAtual());
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Avancou para a seguinte pagina numero: " + this.getPagAtual());
        } else {
            System.out.println("Impossivel avanca pagina com livro fechado!!");
        }
        System.out.println(" ");
    }

    @Override
    public void voltarPag() {
        System.out.println("<----------< Voltar pagina do Livro <----------<");
        if (this.aberto && this.getPagAtual() < this.getTotalPaginas() && this.getPagAtual() >= 0) {
            System.out.println("Pagina atual numero: " + this.getPagAtual());
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Voltou para a pagina anterior numero: " + this.getPagAtual());
        } else {
            System.out.println("Impossivel voltar pagina com livro fechado!!");
        }
        System.out.println(" ");
    }
    
    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }   
}
