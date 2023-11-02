package practice.pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet dog = new Pet(250,"Dog",2015,"Patrick");

        dog.displayPet();

        Pet dog1 =new Pet(100,"Dolmatinec",2018,"Josh");

        dog1.displayPet();

        dog1.sleepPet();
    }
}
