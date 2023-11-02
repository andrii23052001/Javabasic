package task1;

public class Main {

    public static void main(String[] args) {


        Box1<Integer>integerBox1=new Box1<>(1256);
        Box1<String>stringBox1=new Box1<>("Bla bla bla");

        Integer resInt=integerBox1.getContent();
        System.out.println(resInt);
        String strRes=stringBox1.getContent();
        System.out.println(strRes);


        Box1<Car> boxCar=new Box1<>(new Car("Audi"));
        Car carRes= boxCar.getContent();

    }
}
