package main;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

public class Main {

    public static void main(String[] args) throws ParseException {

    
          //Testando a conexão com o banco de dados  
//        Connection c = ConnectionFactory.getConnection();
//        System.out.println("Conectou ao banco de dados");
//        ConnectionFactory.closeConnection(c);
//        System.out.println("Desconectou do banco de dados");
         
//        ProjectController projectController = new ProjectController();
//        Project project = new Project();
//        
//        project.setName("Fim de teste");
//        project.setDescription("Aqui deu certo cambada kkkkkk");
//        System.out.println(project.getName() + " " + project.getDescription()); //Testando a classe Project
//        projectController.save(project);
        
        
        TaskController taskController = new TaskController();
        Task task = new Task();
        
        try {
            task.setIdProject(7);
            task.setName("Teste de tarefa");
            task.setDescription("Teste de descrição da tarefa");
            task.setNotes("Qualquer nota");
            task.setIsComplete(false);
        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
            Date data = formato.parse("20/05/2023");
            task.setDeadline(data);
        
         
            //System.out.println(project.getName() + " " + project.getDescription()); //Testando a classe Project
            taskController.save(task);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
        
        
        
        

//        project.setName("Novo nome projeto");
//        projectController.update(project);
//
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());
        

    }

}
