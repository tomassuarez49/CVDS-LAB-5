package controller;
import model.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TodoController {

    public Todo fetchTodoFromAPI(int todoId) {
        Todo todo = null;
        try {
            // Establecer la URL de la API
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/" + todoId);
            
            // Abrir conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Leer la respuesta de la API
            ObjectMapper objectMapper = new ObjectMapper();
            todo = objectMapper.readValue(connection.getInputStream(), Todo.class);
            
            // Cerrar la conexión
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return todo;
    }

    public static void main(String[] args) {
        TodoController todoController = new TodoController();
        Todo todo = todoController.fetchTodoFromAPI(1);
        if (todo != null) {
            System.out.println("Todo Details:");
            System.out.println("User ID: " + todo.getUserId());
            System.out.println("ID: " + todo.getId());
            System.out.println("Title: " + todo.getTitle());
            System.out.println("Completed: " + todo.isCompleted());
        } else {
            System.out.println("Failed to fetch todo from API.");
        }
    }
}
