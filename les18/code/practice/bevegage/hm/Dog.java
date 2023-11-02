package practice.bevegage.hm;

public class Dog extends Pet {


        public Dog(String name, String breed, int height, int weight) {
            super(name, breed, height, weight);
        }

        @Override
        public void voice() {
            System.out.println("Гав-гав!");
        }

    }

