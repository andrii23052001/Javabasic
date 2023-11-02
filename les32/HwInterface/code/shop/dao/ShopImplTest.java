package shop.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.dao.model.Computer;
import shop.dao.model.Laptop;
import shop.dao.model.Smartphone;
import static org.junit.jupiter.api.Assertions.*;


class ShopImplTest {

    Shop shops;

    Computer [] c;



    @BeforeEach
    void setUp() {
        shops=new ShopImpl(5);
        c=new Computer[5];
        c[0]= new Computer(1,"i7",32,520,"Asus");
        c[1]=new Smartphone(2,"M10",4,256,"Iphone 10",5,175.5);
        c[2]=new Laptop(3,"i7",16,256,"Acer",13.5,250.7);
        c[3]=new Smartphone(4,"i9",6,1000,"Samsung",17,75.5);

        for (int i = 0; i < c.length; i++) {
            shops.addDevice(c[i]);
        }

    }




    @Test
    void addDevice() {

        Computer newdevice= new Laptop(5,"i5",16,128,"Dell",10,99.5);
        assertTrue(shops.addDevice(newdevice));

        shops.printBooks();
        System.out.println("------------------------------------------------------------------");
        System.out.println("==========================Добавили Dell============================");
        assertEquals(5,shops.quantityDevice());// теперь в компании 5 сотрудников
    }

    @Test
    void removeDevice() {
        assertEquals(c[0],shops.removeDevice(1));
        shops.printBooks(); // удаляем обьект
        assertEquals(3,shops.quantityDevice());// ожидаем 3 обьекта сейчас
        assertNull(shops.removeDevice(1)); // проверка на то что мы не можем удалить дважды
    }

    @Test
    void findDevice() {
        assertEquals(c[0],shops.findDevice(1));
        shops.printBooks();
        assertNull(shops.findDevice(10)); // не можем найти обьект которого нету
    }

    @Test
    void quantityDevice() {
        assertEquals(4,shops.quantityDevice());
    }

    @Test
    void printBooks() {
        shops.printBooks();
    }
    @Test
    void totalssd(){
        assertEquals(2032,shops.totalSsd());

    }
    @Test
    void findSsdMoreThen(){
        Computer[]actual= shops.findSsdMoreThen(500);
        Computer[]exp ={c[0],c[3]};
        assertArrayEquals(exp,actual);
        shops.printBooks();

    }

}