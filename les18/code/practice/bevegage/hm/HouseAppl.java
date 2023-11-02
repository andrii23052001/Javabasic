package practice.bevegage.hm;



public class HouseAppl {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Patrick","Dolmatinec",120,40);
        dog1.display();
        dog1.voice();
        System.out.println("=================================================");

        Dog dog2 = new Dog("Lariska","Street dog",100,25);
        dog2.display();
        dog2.voice();
        System.out.println("==================================================");

        Cat cat1 = new Cat("Matroskin","молочная порода",40,8);
        cat1.display();
        cat1.voice();
        System.out.println("====================================================");

        Cat cat2 = new Cat("Кролиха","порода кроля",20,6);
        cat2.display();
        cat2.voice();
        System.out.println("====================================================");

        Cat cat3 = new Cat("Жируха","гарфиладская порода",30,20);
        cat3.display();
        cat3.voice();



    }
}
