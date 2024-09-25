package list.operacoesbasicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	//atributo
	private List<Tarefa> tarefasLista;
	
	//construtor personalizado
	public ListaTarefas() {
		this.tarefasLista = new ArrayList<>();
	}
	
	//métodos
	public void adicionarTarefa(String descricao) {
		tarefasLista.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasRemover = new ArrayList<>();
		
		if(tarefasLista.isEmpty())
			System.out.println("Lista vazia!");
		else {
			for(Tarefa t : tarefasLista) {
				if(t.getDescricao().equalsIgnoreCase(descricao))
					tarefasRemover.add(t);
			}
			tarefasLista.removeAll(tarefasRemover);
		}
	}
	
	public int totalTarefas() {
		return tarefasLista.size();
	}
	
	public void obterDescricaoTarefas() {
		if(tarefasLista.isEmpty())
			System.out.println("Sem tarefas!");
		else
			System.out.println(tarefasLista);
	}

}