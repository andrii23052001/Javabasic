package practice;

//Задача 2. Создайте массив, который содержит возраст студентов группы.

  //      какой возраст максимальный?
    //    какой возраст минимальный?
      //  есть ли однокурсники с одинаковым возрастом? Если да, то сколько студентов, у которых одинаковый возраст?
public class AgeofStudents {
      public static void main(String[] args) {
          int[] ageOfStudent = {30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34, 29, 22, 18};
          // ищем максимальный элемент массива
          int max = ageOfStudent[0];// это первый кандидат на maximum
          int index = 0;
          for (int i = 0; i < ageOfStudent.length; i++) {
              if (ageOfStudent[i] > max) {                        // когда текущий элемент массива будет больше чем max
                  max = ageOfStudent[i];              // взяли максимальный элемент
                  index = i;                      // взяли его индекс

              }
          }
          System.out.println(" Max age" +max);
          System.out.println("Index of max element : " + index);
              int min = ageOfStudent[0];// это первый кандидат на minimum
              int indexMin = 0;
              for (int i = 0; i < ageOfStudent.length; i++) {
                  if (ageOfStudent[i] < min) {                        // когда текущий элемент массива будет меньше чем max
                      min = ageOfStudent[i];              // взяли максимальный элемент
                      indexMin = i;                      // взяли его индекс
                  }
              }
          System.out.println(" Min age" + min);
          System.out.println("index of min element " + indexMin);

          // ищем дубликаты
          //идем по всем элементам массива . начиная с 8-го и для него ищем совпадения
          // ответ выглядит так , есть дубликат его индекс, всего таких дубликатов-...


          }
          }


