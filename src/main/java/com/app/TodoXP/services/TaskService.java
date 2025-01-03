package com.app.TodoXP.services;

import com.app.TodoXP.models.Task;
import com.app.TodoXP.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getALLTasks() {
        return taskRepository.findAll();


    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRepository.getOne(id);

        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);


    }
}
