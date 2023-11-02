package shop.dao;

import shop.dao.model.Computer;

public class ShopImpl implements Shop {

    private Computer[] computers;

    public int size;

    public ShopImpl(int capacity) {
        computers = new Computer[capacity]; // capacity - максимальное количество вместительности нашего склада с техникой

    }

    @Override
    public boolean addDevice(Computer computer) {
        if (computer == null || size == computers.length || findDevice(computer.getId()) != null) {
            return false;
        }

        computers[size] = computer;
        size++;
        return true;
    }

    @Override
    public Computer removeDevice(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {
                Computer victim = computers[i]; //убрали найденный элемент в переменную
                computers[i] = computers[size - 1]; // на место найденного поставили последнее  // из существ в массиве
                computers[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Computer findDevice(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {    // нашелся элемент массива у которого совпал id
                return computers[i];   // вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantityDevice() {
        return size;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);

        }

    }

    public int totalSsd() {
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (computers[i] instanceof Computer) {
                Computer devises = computers[i];
                res += devises.getSsd();

            }

        }
     return res;
    }

    @Override
    public Computer[] findSsdMoreThen(int ssd) {
        int count = 0;
        //сколько будет элементов массива удолетворяющих условию
        for (int i = 0; i < size; i++) {
            if (computers[i].getSsd() > ssd) {
                count++;
            }
        }
        Computer[] res = new Computer[count]; // создаем массив размеров count
        //заполняем массив res
        for (int i = 0, j = 0; j < res.length ;i++){
            if (computers[i].getSsd() >ssd){
                res[j++]=computers[i];
            }
        }
        return res;
    }

    }




