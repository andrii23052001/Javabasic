package repeatHw;
/*
 Задача 2. Сделайте расчет покупки товаров со скидками.
         Товар А стоит X евро и на него скидка D%, а товар B стоит
          Y евро и на него скидка С%. Клиент взял N товаров A и M товаров B.
           Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
         Вычислите итоговую стоимость покупки и величину полученной скидки.
*/

public class HW1 {
    public static void main(String[] args) {

        int a=10;
        double discount=0.9;

        int y = 20;
        double discount1=0.85;

        int A=4;
        int B =6;

        double totalpriceAwithDiscountA= a * discount;
        double totalpriceAwithDiscountY= y * discount1;


        double totalPrice= (totalpriceAwithDiscountA * A ) + (totalpriceAwithDiscountY * B);
        System.out.println(totalPrice);


        if (totalPrice>100 ){
            totalPrice *=0.95;
        }
        System.out.println("Итоговая стоимость : " + totalPrice);
    }
}
