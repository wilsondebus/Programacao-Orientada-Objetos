package exer10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        Tarefa[] tarefas = new Tarefa[3]; 

        for(int i = 0; i < 3; i++){
            System.out.println("Digite a descricao da tarefa "+(i+1)+":");
            String desc = teclado.nextLine();
            tarefas[i] = new Tarefa(desc); 
        }

        System.out.println("Digite qual tarefa quer concluir (1-3): ");
        int concluirTarefa = teclado.nextInt();
        teclado.nextLine(); 

        tarefas[concluirTarefa - 1].concluirTarefa();

        for(int i = 0; i < 3; i++){
            tarefas[i].exibirTarefas();
        }

        teclado.close();
    }
}
