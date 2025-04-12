package Repository;

import Entity.ToDoList;

public interface ToDoListRepository {

    ToDoList[] getAll();

    void add(ToDoList toDo);

    boolean remove(Integer number);
}
