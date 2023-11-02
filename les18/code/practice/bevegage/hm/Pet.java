package practice.bevegage.hm;

//Задача 1. Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями
      //  : порода, рост, вес. Создайте метод voice, который выдает "Мяу!"
      //  для класса Cat и и "Гав-гав!" для класса Dog. Создайте HouseAppl,
   //     в котором есть метод main.
   //     Поселите в доме 2 собаки и 3 кошки.
   //     Смоделируйте жизнь в этом доме в течение дня.
public class Pet {

    private String name; // Имя /id
    private String breed; //порода/ type

    private  int height; // рост / name

    private  int weight; // вес / year

    public Pet(String name, String breed, int height, int weight) {
        this.name = name;
        this.breed = breed;
        this.height = height;
        this.weight = weight;


    }
    public void voice(){

    }
    // метод будет переопределен в дочерних классах


    public void display() {
        System.out.println(" Name " + name + ", breed: " + breed + ", height: " + height + ", weight: " + weight);
    }
}
