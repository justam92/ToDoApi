package pl.common.todo.api.ToDoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.common.todo.api.ToDoApi.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
