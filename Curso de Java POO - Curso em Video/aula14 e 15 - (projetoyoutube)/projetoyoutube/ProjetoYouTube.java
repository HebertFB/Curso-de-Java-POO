package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de Java POO");
        v[1] = new Video("Aula de Python");
        v[2] = new Video("Aula de PHP");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Peter", 21, "M", "Spider");
        g[1] = new Gafanhoto("Mary Jane", 20, "F", "MJ");

        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
    }

}
