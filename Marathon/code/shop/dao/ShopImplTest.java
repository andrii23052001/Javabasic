package shop.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.dao.model.Computer;
import shop.dao.model.Laptop;
import shop.dao.model.Smartphone;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopImplTest {

    Shop shop;
    Computer[]c;

    @BeforeEach
    void setUp() {
        shop=new ShopImpl(5);
        c=new Computer[3];
        c[0]=new Laptop(1,"I5",32,512,"Acer",99,17.5,199.9,true,20);
        c[1]=new Smartphone(2,"A10",3,256,"Apple",599,3213,false,0);
        c[2]=new Smartphone(3,"I7",64,1024,"Samsung",999,4324,true,30);

        for (int i = 0; i < c.length; i++) {
            shop.addDevise(c[i]);
        }

    }

    @Test
    void addDevise() {

        Laptop laptop1=new Laptop(4,"A2",12,124,"Nokia",299,15.5,156,false,0);
        assertTrue(shop.addDevise(laptop1));
        shop.printDevice();

    }


    @Test
    void removeDevice() {
        shop.printDevice();
        assertEquals(c[0],shop.removeDevice(1));
        shop.printDevice();



    }

    @Test
    void findDevice() {
        assertEquals(c[1], shop.findDevice(2));

    }

    @Test
    void pcsDevice() {
            assertEquals(3,shop.pcsDevice());
        }



    @Test
    void printDevice() {
        shop.printDevice();
    }

    @Test
    void findDiscountedDevices() {
        List<Computer> discountedDevices = shop.findDiscountedDevices();

        // Проверяем, что список не пустой
        assertFalse(discountedDevices.isEmpty());

        // Проверяем, что все найденные компьютеры имеют скидку
        for (Computer computer : discountedDevices) {
            assertTrue(computer.getDiscountAmount() > 0);
            System.out.println(computer);

    }
}
}