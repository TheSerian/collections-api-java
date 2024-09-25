package list.pesquisa.catalogo;

public class TesteCatalogo {

	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Vidas Secas", "Graciliano Ramos", 1938);
		catalogo.adicionarLivro("A Hora da Estrela", "Clarice Lispector", 1977);
		catalogo.adicionarLivro("JOJO NO KIMYO NA BOKEN", "Hirohiko Araki", 1987 );
		catalogo.adicionarLivro("Algoritmos: Teoria e Prática", "Mais de uma pessoa", 1989);
		catalogo.adicionarLivro("Algoritmos: Teoria e Prática", "Mais de uma pessoa", 2012);
		
		System.out.println(catalogo.pesquisarTitulo("Algoritmos: Teoria e Prática"));
		
		System.out.println(catalogo.pesquisarAutor("Hirohiko Araki"));
		
		System.out.println(catalogo.pesquisarIntervaloAnos(1930, 1987));

	}

}