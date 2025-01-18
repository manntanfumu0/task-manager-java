package GerenciadorTarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Editar Tarefa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Sair");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpa a linha após a opção

            switch (option) {
                case 1:
                    System.out.print("Título da tarefa: ");
                    String title = scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(new Task(title, description));
                    break;

                case 2:
                    taskManager.listTasks();
                    break;

                case 3:
                    System.out.print("Número da tarefa para editar: ");
                    int taskNumberToEdit = scanner.nextInt() - 1; // Índices começam em 0
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Novo título: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Nova descrição: ");
                    String newDescription = scanner.nextLine();
                    taskManager.editTask(taskNumberToEdit, newTitle, newDescription);
                    break;

                case 4:
                    System.out.print("Número da tarefa para excluir: ");
                    int taskNumberToDelete = scanner.nextInt() - 1;
                    taskManager.deleteTask(taskNumberToDelete);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
