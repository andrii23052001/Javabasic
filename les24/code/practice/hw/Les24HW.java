package practice.hw;
//Задача 4.(*) Напишите приложение, которое выводит минимальные/максимальные числовые значения
  //      примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main.

//        Если в аргументах нет какого-либо типа, приложение должно вывести максимальное
  //      /минимальное значения 7 типов (byte, int, short, long, char, float, double).

    //    Если аргументы содержат неправильный тип
      //  , приложение должно вывести сообщение: Неверный тип.


public class Les24HW {
    public static void main(String[] args) {
        if (args.length == 0) { //
            System.out.println("Byte min : " + Byte.MIN_VALUE );
            System.out.println("Byte max : " + Byte.MAX_VALUE);
            }
            for (int i = 0; i < args.length; i++) {
                double minSize = 0;
                double maxSize = 0;


                switch (args[i]) { // первый байт в программе
                    case "byte": {
                        maxSize = Byte.MAX_VALUE;
                        minSize = Byte.MIN_VALUE;
                        break;
                    }

                    case "short": {
                        maxSize = Short.MAX_VALUE;
                        minSize = Short.MIN_VALUE;
                        break;
                    }
                    case "char": {
                        maxSize = Character.MAX_VALUE;
                        minSize = Character.MIN_VALUE;
                        break;
                    }
                    case "int": {
                        maxSize = Integer.MAX_VALUE;
                        minSize = Integer.MIN_VALUE;
                        break;
                    }
                    case "long": {
                        maxSize = Long.MAX_VALUE;
                        minSize = Long.MIN_VALUE;
                        break;
                    }
                    case "float": {
                        maxSize = Float.MAX_VALUE;
                        minSize = Float.MIN_VALUE;
                        break;
                    }
                    case "double": {
                        maxSize = Double.MAX_VALUE;
                        minSize = Double.MIN_VALUE;
                        break;
                    }
                    case " ": {

                    }
                    break;

                    default:
                        System.out.println("INVAAAAAAAAAAAAAAAAAAAAAAAAAAAAALIIIIIIIIIIIIIDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
                }
                System.out.println(" Type : " + args[i] + ":\t min value = " + minSize + " max value = " + maxSize);

            }
        }

    }

