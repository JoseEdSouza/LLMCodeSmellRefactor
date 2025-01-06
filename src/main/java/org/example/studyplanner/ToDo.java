package org.example.studyplanner;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ToDo implements PlannerMaterial, Comparable<ToDo>{
    private Integer id;
    private String title;
    private String description;
    private int priority;
    public ToDo(Integer id, String title, String description, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[(Priority:{3}) ToDo {0}: {1}, {2}]", id, title, description, priority);
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(ToDo other) {
        return Integer.compare(this.priority, other.priority);
    }
    public boolean containsSearchTerm(String searchTerm) {
        searchTerm = searchTerm.toLowerCase();
        return getTitle().toLowerCase().contains(searchTerm) ||
                getDescription().toLowerCase().contains(searchTerm);
    }

    public static List<String> searchInTodos(List<ToDo> toDos, String search) {
        List<String> matchingTodos = new ArrayList<>();
        for (ToDo toDo : toDos) {
            if (toDo.containsSearchTerm(search)) {
                matchingTodos.add(toDo.toString());
            }
        }
        return matchingTodos;
    }

}
