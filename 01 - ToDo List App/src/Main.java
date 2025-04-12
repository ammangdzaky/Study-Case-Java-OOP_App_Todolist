import Repository.ToDoListRepository;
import Repository.ToDoListRepositoryImpl;
import Service.ToDoListService;
import Service.ToDoListServiceImpl;
import View.ToDoListView;

public class Main {
    public static void main(String[] args) {

        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListView.showToDo();
    }
}