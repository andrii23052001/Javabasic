package practice.bevegage.hm;

public class Cat extends Pet {

       // поля для  кошки
       private String breed;
       private double height;
       private double weight;

        public  Cat (String name, String breed, int height, int weight) {
            super(name, breed, height , weight);
        }

    public void voice() {
        System.out.println("Мяу!");
    }
}