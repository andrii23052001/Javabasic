package practice;
//Задача 1. Имеются оценки абитуриента из его аттестата,
  //      всего 20 оценок. Найдите средний балл абитуриента.
public class Abiturient {
    public static void main(String[] args) {
        // обьявили массив и заполнили его
        int[] marks={2,3,3,1,4,1,3,2,1,1,3,2};
        int sumOfMarks=0;
        for (int i = 0; i < marks.length; i++) {
           // sumOfMarks=sumOfMarks + marks[i];//длинная запись
            sumOfMarks+=marks[i]; //короткая запись
        }
        double avergeMark=(double) sumOfMarks/marks.length;
        System.out.println("Average mark " + avergeMark);

    }
}
