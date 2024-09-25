package list.pesquisa.catalogo;

public class Livro {
	
	//atributos
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	//construtor personalizado
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	//getters e setters
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

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro " + titulo + ", autor = " + autor + ", ano de publicacao = " + anoPublicacao;
	}

}