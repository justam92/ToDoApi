package pl.common.todo.api.ToDoApi.service;

import java.util.List;

import pl.common.todo.api.ToDoApi.model.Task;

public interface TaskService {
	
	List<Task> selectAll();
	
	void deleteById(Long id);
	
	void create(Task task);
	
	void updateById(Task task);
}
