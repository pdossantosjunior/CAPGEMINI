package TodoApp;

import controller.ProjectController;
import java.sql.Connection;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class Main {

    public static void main(String[] args) {

    
          //Testando a conexão com o banco de dados  
//        Connection c = ConnectionFactory.getConnection();
//        System.out.println("Conectou ao banco de dados");
//        ConnectionFactory.closeConnection(c);
//        System.out.println("Desconectou do banco de dados");
         
        ProjectController projectController = new ProjectController();
        Project project = new Project();
        
        project.setName("Fim de teste");
        project.setDescription("Aqui deu certo cambada kkkkkk");
        System.out.println(project.getName() + " " + project.getDescription()); //Testando a classe Project
        projectController.save(project);

//        project.setName("Novo nome projeto");
//        projectController.update(project);
//
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());
        

    }

}
