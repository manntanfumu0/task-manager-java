package GerenciadorTarefa;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    // Construtor
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Adicionar tarefa
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Listar todas as tarefas
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Tarefa " + (i + 1) + ":\n" + tasks.get(i) + "\n");
            }
        }
    }

    // Editar tarefa
    public void editTask(int index, String newTitle, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setTitle(newTitle);
            task.setDescription(newDescription);
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    // Excluir tarefa
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Tarefa excluída com sucesso.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}
