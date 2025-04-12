package View;

import Repository.ToDoListRepository;
import Repository.ToDoListRepositoryImpl;
import Service.ToDoListService;
import Util.InputUtil;

public class ToDoListView {


    private ToDoListService toDoListService;

    public ToDoListView(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    public void showToDo(){
        while(true){

            // jika kosong tambahkan satu todo
            if(toDoListService.isEmpty()){
                System.out.println("ToDo List Masih Kosong");
                String todo = InputUtil.input("Masukkan ToDo List pertama");
                toDoListService.addTodoList(todo);
            } else {
                System.out.println("\nDAFTAR TODO LIST");

                toDoListService.showToDoList();

                System.out.println("\nMENU:");
                System.out.println("1. Tambah");
                System.out.println("2. Hapus");
                System.out.println("3. Keluar");

                var pick = InputUtil.input("pilih yang mana");
                if(pick.equals("1")){
                    addToDo();
                } else if(pick.equals("2")){
                    removeToDo();
                } else if(pick.equals("3")){
                    break;
                } else{
                    System.out.println("Pilihan tidak ada");
                }
            }

        }
    }

    public void addToDo(){
        var todo = InputUtil.input("Masukkan todo baru");

        while(true){
            System.out.println("yakin ingin menambahkan '" + todo + "'?");
            System.out.println("1. ya");
            System.out.println("2. batal");

            var pilihan = InputUtil.input("pilih");
            if(pilihan.equals("1")){
                toDoListService.addTodoList(todo);
                break;
            } else if(pilihan.equals("2")){
                break;
            } else{
                System.out.println("Pilihan tidak ada");
            }
        }
    }

    public void removeToDo(){
        toDoListService.showToDoList();
        var pilih = InputUtil.input("nomor berapa yang ingin anda hapus?");
        var success = false;
        var itemToDO = toDoListService.getToDo();
        while(true && itemToDO[Integer.valueOf(pilih)] != null){
            System.out.println("yakin ingin menghapus '" + itemToDO[Integer.valueOf(pilih) - 1].getToDo() + "'?");
            System.out.println("1. ya");
            System.out.println("2. batal");
            var keterangan = InputUtil.input("pilih");
            if(keterangan.equals("1")){
                toDoListService.removeYoDoList(Integer.valueOf(pilih));
                success = true;
                break;
            } else if(keterangan.equals("2")){
                break;
            } else{
                System.out.println("Pilihan tidak ada");
            }
        }

    }
}
