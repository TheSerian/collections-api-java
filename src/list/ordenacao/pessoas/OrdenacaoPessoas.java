package list.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	//atributo
	private List<Pessoa> pessoas;
	
	//construtor personalizado
	public OrdenacaoPessoas() {
		this.pessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> ordemIdade = new ArrayList<>(pessoas);
		
		Collections.sort(ordemIdade);
		return ordemIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> ordemAltura = new ArrayList<>(pessoas);
		
		Collections.sort(ordemAltura, new ComparatorAltura());
		return ordemAltura;
	}

}