package list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	//atributo
	List<Integer> numeros;
	
	//construtor personalizado
	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	//métodos
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public List<Integer> ordenarCrescente(){
		List<Integer> ordemCrescente = new ArrayList<>(this.numeros);
		
		if(numeros.isEmpty())
			System.out.println("Lista vazia, nada para ordenar!");
		else
			Collections.sort(ordemCrescente);
		
		return ordemCrescente;
	}
	
	public List<Integer> ordenarDecrescente(){
		List<Integer> ordemDecrescente = new ArrayList<>(this.numeros);
		
		if(numeros.isEmpty())
			System.out.println("Lista vazia, nada para ordenar!");
		else
			ordemDecrescente.sort(Collections.reverseOrder());
		
		return ordemDecrescente;
	}

}