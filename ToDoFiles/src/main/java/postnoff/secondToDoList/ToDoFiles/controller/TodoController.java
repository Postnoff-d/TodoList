 package postnoff.secondToDoList.ToDoFiles.controller;


import javax.validation.constraints.NotNull;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import postnoff.secondToDoList.ToDoFiles.model.TodoItem;
import postnoff.secondToDoList.ToDoFiles.repo.TodoRepo;
 
@RestController
@RequestMapping(value = "/todo")
public class  TodoController {
	
	@Autowired
	private TodoRepo todoRepo;
	
	@GetMapping
	public List<TodoItem> findAll() {
		return todoRepo.findAll();
	}
	
	@PostMapping
	public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem) {
		return todoRepo.save(todoItem);
	}

	@PutMapping
	public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem) {
		return todoRepo.save(todoItem);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		todoRepo.deleteById(id);
	}

}
 