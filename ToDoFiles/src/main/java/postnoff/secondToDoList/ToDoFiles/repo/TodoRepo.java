package postnoff.secondToDoList.ToDoFiles.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import postnoff.secondToDoList.ToDoFiles.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}
