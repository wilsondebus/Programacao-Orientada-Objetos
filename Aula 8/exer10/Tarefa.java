package exer10;

public class Tarefa {
    
    public String descricao;
    public boolean concluida; 

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluirTarefa(){
        this.concluida = true;
    }

    public void exibirTarefas(){
        System.out.println("Descrição da Tarefa:\n"+descricao);
        System.out.println("Concluida: "+concluida);
        System.out.println();
    }
}
