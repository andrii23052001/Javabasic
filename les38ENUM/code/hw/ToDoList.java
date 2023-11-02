package hw;

/*
Задача 1. Начать реализацию приложения "Список дел".

        Использовать enum для организации меню (номер пункта, действие) приложения:
        добавить запись
        посмотреть все записи
        удалить запись (по номеру)
        выйти
        Реализовать метод printMenu().
*/



public enum ToDoList {
    ADD(1, "Добавить запись"), CHE(2, "Посмотреть все записи"), DEL(3, "Удалить запись"), EXI(4, "Выход");

    private int nummberOfPoint;

    private String action; // действие

    ToDoList(int nummberOfPoint, String action) {
        this.nummberOfPoint = nummberOfPoint;
        this.action = action;
    }

    public int getNummberOfPoint() {
        return nummberOfPoint;
    }

    public String getAction() {
        return action;
    }
}

