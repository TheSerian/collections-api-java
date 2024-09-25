package list.operacoesbasicas.carrinho;

public class TesteCarrinho {

	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Sonic Frontiers", 100.99, 1);
		carrinho.adicionarItem("Kid Icarus Uprising", 70.37, 1);
		carrinho.adicionarItem("Dragon Ball Budokai", 80.75, 1);
		
		carrinho.removerItem("Dragon Ball Budokai");
		
		carrinho.exibirItens();
		
		System.out.println(carrinho.calcularValorTotal());

	}

}