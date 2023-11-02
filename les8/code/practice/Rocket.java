package practice;
//Задача 2. Запустить обратный отсчет старта ракеты от 10 до 0.
  //      Последнее сообщение: "Поехали!...".
public class Rocket {
    public static void main(String[] args) {
        int countDown=10;
        System.out.println("До старта осталось" + countDown);

        while (countDown>=0){
            System.out.println("До старта осталось"+countDown);
            countDown--; // изменение параметра цикла

        }
        System.out.println("Поехали!...");
    }
}
