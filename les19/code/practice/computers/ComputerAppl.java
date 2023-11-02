package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Laptop;
import practice.computers.model.SmartPhone;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer[] comp = new Computer[4];

         comp [0] = new Computer("i9",16,512,"Asus");
        System.out.println(comp[0]);

        comp[1] = new Laptop("i5",8,256,"Acer","14",1000,2);
        System.out.println(comp[1]);

        comp[2]= new Laptop("M2",16,512,"MacBook","14",5000,1.6);
        System.out.println(comp[2]);


        comp [3] = new SmartPhone("A16 Bionic chip",32,512,"Iphone 15","8",3000,140);
        System.out.println(comp[3]);




        int sumHdd=0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd=sumHdd+ comp[i].getHdd();
        }
        System.out.println(" Total Hdd " + sumHdd );
    }
}
