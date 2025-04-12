package Test.View;

import Repository.ToDoListRepository;
import Repository.ToDoListRepositoryImpl;
import Service.ToDoListService;
import Service.ToDoListServiceImpl;
import View.ToDoListView;

public class ToDoListViewTest {
    public static void main(String[] args) {
        removeToDo();
    }

    public static void showToDo(){
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListView.showToDo();
    }


    public static void addToDo(){
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListView.addToDo();
    }

    public static void removeToDo(){
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListService.addTodoList("belajar budaya jawa");
        toDoListService.addTodoList("belajar budaya sunda");
        toDoListService.addTodoList("belajar budaya madura");

        toDoListView.removeToDo();
    }
}
