package list.operacoesbasicas.tarefas;

public class TesteTarefas {

	public static void main(String[] args) {
		
		ListaTarefas lista = new ListaTarefas();
		
		lista.adicionarTarefa("Comer farofa");
		lista.adicionarTarefa("Comer farofa");
		lista.adicionarTarefa("Comer farinha");
		
		lista.removerTarefa("Comer farofa");
		
		lista.obterDescricaoTarefas();
		
		System.out.println("Elementos da lista: " + lista.totalTarefas());

	}

}