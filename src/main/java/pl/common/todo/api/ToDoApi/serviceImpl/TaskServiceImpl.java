package pl.common.todo.api.ToDoApi.serviceImpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.common.todo.api.ToDoApi.model.Task;
import pl.common.todo.api.ToDoApi.repository.TaskRepository;
import pl.common.todo.api.ToDoApi.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Task> selectAll() {

		List<Task> tasks = taskRepository.findAll();

		Collections.sort(tasks, new Comparator<Task>() {
			@Override
			public int compare(Task task1, Task task2) {
				return task2.getDeadline().compareTo(task1.getDeadline());
			}
		});

		return tasks;
	}

	@Override
	public void deleteById(Long id) {
		taskRepository.deleteById(id);
	}

	@Override
	public void create(Task task) {
		task.setInsertionDate(new Date());
		taskRepository.save(task);
	}
}