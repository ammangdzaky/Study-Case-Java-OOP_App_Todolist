package Service;

import Entity.ToDoList;
import Repository.ToDoListRepository;

public class ToDoListServiceImpl implements ToDoListService{

    private ToDoListRepository toDoListRepository;

    public ToDoListServiceImpl(ToDoListRepository toDoList) {
        this.toDoListRepository = toDoList;
    }

    @Override
    public void showToDoList() {
        ToDoList[] toDoList = this.toDoListRepository.getAll();
        for(int i = 0; i < toDoList.length ; i++){
            if(toDoList[i] != null){
                var num = i + 1;
                var toDo = toDoList[i];
                System.out.println(num + ". " + toDo.getToDo());
            }

        }
    }

    @Override
    public void addTodoList(String toDo) {
        ToDoList toDoList = new ToDoList(toDo);
        toDoListRepository.add(toDoList);
    }

    @Override
    public void removeYoDoList(Integer number) {
        boolean success = toDoListRepository.remove(number);
        if(success){
            System.out.println("Removed " + number + " from the list");
        } else{
            System.out.println("Failed to remove " + number + " from the list");
        }
    }

    public boolean isEmpty(){
        boolean empty = true;
        for(ToDoList ele : toDoListRepository.getAll()){
            if(ele != null){
                empty = false;
                break;
            }
        }
        return empty;
    }

    public ToDoList[] getToDo(){
        return toDoListRepository.getAll();
    }
}
