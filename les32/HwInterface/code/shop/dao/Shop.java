package shop.dao;


import shop.dao.model.Computer;
// создаем интерфейс Shop с методами:
////        добавить устройство ;
////        удалить устройство ;
////        найти устойство ;
////        кол-во утройств;
////        напечатать список устройств.
public interface Shop {

    boolean addDevice (Computer computer);

    Computer removeDevice(int id);

    Computer findDevice(int id);

    int quantityDevice();

    void printBooks();

    int totalSsd();

    Computer[] findSsdMoreThen(int ssd);
}
