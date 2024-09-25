package list.ordenacao.numeros;

public class TesteOrdenacaoNumeros {

	public static void main(String[] args) {
		
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		
		numeros.adicionarNumero(7);
		numeros.adicionarNumero(2222);
		numeros.adicionarNumero(-23);
		numeros.adicionarNumero(0);
		
		System.out.println(numeros.ordenarCrescente());
		System.out.println(numeros.ordenarDecrescente());

	}

}