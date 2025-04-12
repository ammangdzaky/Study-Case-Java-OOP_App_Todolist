package Service;

import Entity.ToDoList;

public interface ToDoListService {

    void showToDoList();

    void addTodoList(String toDo);

    void removeYoDoList(Integer number);

    boolean isEmpty();

    ToDoList[] getToDo();
}
