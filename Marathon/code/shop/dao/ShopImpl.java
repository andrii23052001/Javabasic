package shop.dao;

import shop.dao.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class ShopImpl implements Shop {

Computer[]computers;
private  int size;

public ShopImpl(int capacity){
    computers=new Computer[capacity];
}

    @Override
    public boolean addDevise(Computer computer) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
        if (computer == null || size == computers.length || findDevice(computer.getId()) != null) {
            return false;
        }

        computers[size++] = computer; // ++ - это постфиксная операция
        return true;
    }

    @Override
    public Computer removeDevice(long id) {

        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {
                Computer victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Computer findDevice(long id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {
                return computers[i];
            }
        }
        return null;

    }

    @Override
    public int pcsDevice() {
        return size;
    }

    @Override
    public void printDevice() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
    }
    @Override
    public List<Computer> findDiscountedDevices() {
        List<Computer> discountedDevices = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (computers[i].isDiscounted()) {
                discountedDevices.add(computers[i]);
            }
        }
        return discountedDevices;
    }


    }
