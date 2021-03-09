package org.ToDoApp.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> tasks;
    private String title;
    private LocalDate date;
    private ArrayList<String> collaborators;

    public ToDoList(ArrayList<String> tasks, String title, ArrayList<String> collaborators) {
        this.tasks = tasks;
        this.title = title;
        this.date = java.time.LocalDate.now();
        this.collaborators = collaborators;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<String> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(ArrayList<String> collaborators) {
        this.collaborators = collaborators;
    }
}
