package GerenciadorTarefa;

// A classe Task representa uma tarefa com um título e uma descrição.
public class Task {
    private String title; // Título da tarefa
    private String description; // Descrição detalhada da tarefa

    // Construtor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getter para o título da tarefa
    public String getTitle() {
        return title;
    }
    // Setter para o título da tarefa
    public void setTitle(String title) {
        this.title = title;
    }
     // Getter para a descrição da tarefa
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    // Método para exibir a tarefa de forma legível
    @Override
    public String toString() {
        return "Título: " + title + "\nDescrição: " + description;
    }
}
