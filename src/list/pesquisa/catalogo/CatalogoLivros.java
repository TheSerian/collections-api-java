package list.pesquisa.catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	//atributo
	private List<Livro> livros;
	
	//construtor personalizado
	public CatalogoLivros() {
		this.livros = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarAutor(String autor){
		List<Livro> livrosAutor = new ArrayList<>();
		
		if(livros.isEmpty())
			System.out.println("Lista vazia!");
		else {
			for(Livro l : livros) {
				if(l.getAutor().equalsIgnoreCase(autor))
					livrosAutor.add(l);
			}
		}
		return livrosAutor;
	}
	
	public List<Livro> pesquisarIntervaloAnos(int anoInicio, int anoFim){
		List<Livro> livrosIntervalo = new ArrayList<>();
		
		if(livros.isEmpty())
			System.out.println("Lista vazia!");
		else {
			for(Livro l : livros) {
				if(l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim)
					livrosIntervalo.add(l);
			}
		}
		return livrosIntervalo;
	}
	
	public Livro pesquisarTitulo(String titulo) {
		Livro livroTitulo = null;
		
		if(livros.isEmpty())
			System.out.println("Lista vazia!");
		else {
			for(Livro l : livros) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroTitulo = l;
					break;
				}
			}
		}
		return livroTitulo;
	}
}