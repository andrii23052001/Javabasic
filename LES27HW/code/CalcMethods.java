public class CalcMethods {
    public int add(int a, int b) {
        return a + b;

    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Ошибка: деление на ноль");   /// "throw" - это слово, которое говорит компьютеру: "
                                                                        // У меня есть проблема, и я хочу, чтобы ты это знал."
        }                                                               // "new ArithmeticException("Ошибка: деление на ноль")" - это способ сказать компьютеру, какая именно проблема у нас есть. Здесь мы говорим,
                                                                        // что у нас проблема связана с арифметикой (такие как математические операции),
    }
       public double multiplication (double a , double b){
        return a * b ;
       }
       public int wholePartOfDivision (int a , int b){
        return a /b ;
       }


}