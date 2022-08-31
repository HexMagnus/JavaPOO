package projetoyoutube;

public class ProjetoYouTube {

	public static void main(String[] args) {
		Video v [] = new Video [3];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP" );
		v[2] = new Video ("Aula 10 de Html5");
		
		Gafanhoto g[]= new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		Visualizacao vis[] = new Visualizacao [5];
		vis[0] = new Visualizacao(g[0], v[2]);
		System.out.println(vis[0].toString());
		vis[1] = new Visualizacao(g[0], v[1]);
		System.out.println(vis[0].toString());
	}

}
