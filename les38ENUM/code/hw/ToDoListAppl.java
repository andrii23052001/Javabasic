package hw;

public class ToDoListAppl {
    public static void main(String[] args) {
   printMenu();


    }
    public static void printMenu(){
        System.out.println("Меню");
        for (ToDoList arr : ToDoList.values()) {
            System.out.println(arr.getNummberOfPoint() + "." + arr.getAction());

        }
        }
    }

