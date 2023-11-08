package shop.dao;

/*
По методам - должны быть CRUD-операции: С -

create R - read, find U - update (не обязательно) D - delete, remove
*/

import shop.dao.model.Computer;

import java.util.List;

public interface Shop {

    boolean addDevise(Computer computer);

    Computer removeDevice(long id);

    Computer findDevice (long id);

    int pcsDevice();

    void printDevice();

    List<Computer> findDiscountedDevices();
}
