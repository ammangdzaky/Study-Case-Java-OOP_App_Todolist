package Repository;

import Entity.ToDoList;

public class ToDoListRepositoryImpl implements ToDoListRepository{

    private ToDoList[] data = new ToDoList[10];

    //cek apakah full
    public boolean isFull(){
        var isFull = true;
        for(int i = 0; i < data.length; i++){
            if(data[i] == null){
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    // resize array jika full
    public void resizeIfFull(){
        if(isFull()){
            var temp = data;
            data = new ToDoList[data.length * 2];
            for(int i = 0; i < temp.length; i++){
                data[i] = temp[i];
        }
    }}



    @Override
    public ToDoList[] getAll() {
        return data;
    }

    @Override
    public void add(ToDoList toDo) {
        resizeIfFull();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = toDo;
                break;
            }
        }
    }

    @Override
    public boolean remove (Integer number){
        if((number - 1 ) >= data.length){
            return false;
        } else if(data[number - 1] == null){
            return false;
        } else{
            for(int i = (number - 1); i < data.length ; i ++){
                if(i == (data.length - 1)){
                    data[i] = null;
                } else{
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}