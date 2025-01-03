package com.app.TodoXP.repository;

import com.app.TodoXP.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
