package list.operacoesbasicas.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	//atributo
	private List<Item> carrinho;
	
	//construtor personalizado
	public CarrinhoDeCompras() {
		this.carrinho = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensRemover = new ArrayList<>();
		
		if(carrinho.isEmpty())
			System.out.println("Carrinho vazio!");
		
		else {
			for(Item i : carrinho) {
				if(i.getNome().equalsIgnoreCase(nome))
					itensRemover.add(i);
			}
			carrinho.removeAll(itensRemover);
		}
	}
	
	public double calcularValorTotal() {
		double total = 0;
		
		if(carrinho.isEmpty()) {
			System.out.println("Carrinho vazio!");
		}
		
		else {
			for(Item i : carrinho) {
				total += i.getPreco(); 
			}
		}
		return total;
	}
	
	public void exibirItens() {
		if(carrinho.isEmpty())
			System.out.println("Carrinho vazio!");
		else
			System.out.println(carrinho);
	}

}