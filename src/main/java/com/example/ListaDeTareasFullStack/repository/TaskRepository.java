package com.example.ListaDeTareasFullStack.repository;

import com.example.ListaDeTareasFullStack.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository  extends JpaRepository<TaskEntity,Long> {
}
