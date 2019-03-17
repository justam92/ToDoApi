package pl.common.todo.api.ToDoApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.common.todo.api.ToDoApi.model.Task;
import pl.common.todo.api.ToDoApi.service.TaskService;

@RestController
@RequestMapping("tasks")
public class TaskController {
	
	@Autowired
	private TaskService taskService;

	@GetMapping
	public List<Task> getAll() {
		return taskService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		taskService.deleteById(id);
	}
	
	@PostMapping
	public void create(@RequestBody Task task) {
		taskService.create(task);
	}
	
	@PutMapping
	public void update(@RequestBody Task task) {
		taskService.update(task);
	}
}
