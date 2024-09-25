package list.operacoesbasicas.carrinho;

public class Item {
	
	//atributos
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtor personalizado
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Item " + nome + ", preço = " + preco + ", quantidade = " + quantidade;
	}
	
}