package computer.model;

public class CastingAppl {
    public static void main(String[] args) {
        Computer lap1= new Laptop("i7",16,512,"Dell",5,0.3);
        System.out.println(lap1);
        Laptop laptop1 = (Laptop) lap1; // down casting from Computer to Laptop
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(lap1);

        Computer smart1= new Smartphone("Snapdragon",8,128,"Samsung",24,0.15);
        System.out.println(smart1);
        Smartphone smartphone1 = (Smartphone) smart1;



    }
}
