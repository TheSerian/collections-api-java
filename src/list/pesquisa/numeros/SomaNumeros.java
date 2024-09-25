package list.pesquisa.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	//atributo
	private List<Integer> numeros;
	
	//construtor personalizado
	public SomaNumeros() {
		this.numeros = new ArrayList<>(); 
	}
	
	//métodos
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		
		if(numeros.isEmpty())
			System.out.println("Lista vazia!");
		else {
			for(int i : numeros) {
				soma += i;
			}
		}
		return soma;
	}
	
	public int maiorNumero() {
		int maior = numeros.getFirst();
		
		if(numeros.isEmpty())
			System.out.println("Lista vazia!");
		else {
			for(int i : numeros) {
				if(i > maior)
					maior = i;
			}
		}
		return maior;
	}
	
	public int menorNumero() {
		int menor = numeros.getFirst();
		
		if(numeros.isEmpty())
			System.out.println("Lista vazia!");
		else {
			for(int i : numeros) {
				if(i < menor)
					menor = i;
			}
		}
		return menor;
	}
	
	public void exibirNumeros(){
		if(numeros.isEmpty())
			System.out.println("Lista vazia!");
		else
			System.out.println(numeros);
	}

}