/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Paulo César
 */
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    //Método para mostrar os nomes da clounas
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    //Método para deixar a coluna editavel
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){    //Método para retornar qual é o tipo usado na coluna
        if(tasks.isEmpty()){
            return Object.class;            
        }
        return this.getValueAt(0, columnIndex).getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
            //break;        //Por estar retornando "return" não precisa de break
            case 1:
                return tasks.get(rowIndex).getDescription();
            //break;
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //Método para formatar a data
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            //break;
            case 3:
                return tasks.get(rowIndex).isIsComplete();
            //break;
            case 4:
                return "";
            //break;
            case 5:
                return "";
            //break;
            default:
                return "Dados não encontrados!";
        }

    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex ){
        tasks.get(rowIndex).setIsComplete((boolean) aValue);        
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
