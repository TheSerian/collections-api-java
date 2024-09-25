package list.pesquisa.numeros;

public class TesteSomaNumeros {

	public static void main(String[] args) {
		
		SomaNumeros numeros = new SomaNumeros();
		
		numeros.adicionarNumero(15);
		numeros.adicionarNumero(192);
		numeros.adicionarNumero(57);
		numeros.adicionarNumero(-25);
		numeros.adicionarNumero(-13);
		
		System.out.println(numeros.calcularSoma());
		
		System.out.println(numeros.maiorNumero());
		System.out.println(numeros.menorNumero());
		
		numeros.exibirNumeros();

	}

}