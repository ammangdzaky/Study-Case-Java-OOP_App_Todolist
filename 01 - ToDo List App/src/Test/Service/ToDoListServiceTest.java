package Test.Service;

import Entity.ToDoList;
import Repository.ToDoListRepository;
import Repository.ToDoListRepositoryImpl;
import Service.ToDoListService;
import Service.ToDoListServiceImpl;

public class ToDoListServiceTest {

    public static void main(String[] args) {
        testRemove();
    }

    public static void testShow(){
        ToDoListRepositoryImpl toDoListRepository = new ToDoListRepositoryImpl();

        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        toDoListService.addTodoList("belajar bahasa mandarin");
        toDoListService.addTodoList("belajar bahasa jawa");
        toDoListService.addTodoList("belajar bahasa sunda");

        toDoListService.showToDoList();
    }

    public static void testAdd(){
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.showToDoList();

        toDoListService.addTodoList("Belajar bahasa jawa");
        toDoListService.addTodoList("Belajar bahasa cina");
        toDoListService.addTodoList("Belajar bahasa sunda");

        toDoListService.showToDoList();
    }

    public static void testRemove(){
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.addTodoList("Belajar bahasa jawa");
        toDoListService.addTodoList("Belajar bahasa cina");
        toDoListService.addTodoList("Belajar bahasa sunda");

        toDoListService.showToDoList();

        toDoListService.removeYoDoList(2);

        toDoListService.showToDoList();
    }
}
