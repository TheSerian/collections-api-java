package list.ordenacao.pessoas;

public class TestePessoas {
	
	public static void main(String[] args) {
		OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
		
		listaPessoas.adicionarPessoa("Farao", 21, 1.47);
		listaPessoas.adicionarPessoa("Nico", 18, 1.64);
		listaPessoas.adicionarPessoa("LuuL", 19, 1.79);
		
		System.out.println(listaPessoas.ordenarPorIdade());
		System.out.println(listaPessoas.ordenarPorAltura());
	}

}