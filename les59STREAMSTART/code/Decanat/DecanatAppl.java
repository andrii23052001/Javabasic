package Decanat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/*Задача 1. По аналогии с классом User создать класс Student1 с полями: id, firstName,
        lastName, birtDay, course, groupNum (номер группы), country, gender(пол).
        В приложении DekanatAppl создать студентов из разных стран, которые учатся на
        разных курсах, в разных группах. Сделать списки студентов по курсам, по группам,
        отсортированные по фамилиям и возрасту. Сколько студентов мужчин? Сколько женщин?
        Какой у них средний возраст по курсу? По всем студентам? Дополнительное задание (**):
        добавить
        у каждого студента поле int[] marks с его оценками и рассчитать средний балл.*/
public class DecanatAppl {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>(List.of(
                new Student(1, "Andrii", "Koval", 19950315, 3, 123, "Ukraine", "Male"),
                new Student(2, "Maria", "Ivanova", 19920120, 2, 456, "Russia", "Female"),
                new Student(3, "John", "Smith", 19901005, 4, 789, "USA", "Male"),
                new Student(4, "Elena", "Garcia", 19940812, 2, 123, "Spain", "Female"),
                new Student(5, "Alex", "Wang", 19970628, 1, 456, "China", "Male"),
                new Student(6, "Anna", "Müller", 19931203, 3, 789, "Germany", "Female"),
                new Student(7, "Ivan", "Petrov", 19981120, 4, 123, "Russia", "Male"),
                new Student(8, "Sophia", "Kim", 19951018, 2, 456, "South Korea", "Female"),
                new Student(9, "Dmitry", "Ivanov", 19921207, 1, 789, "Russia", "Male"),
                new Student(10, "Olga", "Chen", 19970615, 3, 123, "China", "Female")
        ));
        System.out.println("======================Cортировка по студентов по курсу======================");
        listByCourse(students);
        normalListByCourse(students, 2);
        System.out.println("__________________Сортировка студентов по группе ______________________________");
        System.out.println();
        ListByGroup(students, 123);
        System.out.println("------------------------Сортировка по Фамилии и группе--------------------------------");
        SortedLastNameAndAgeListFromGroup(students, 789);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Cортировка по полу и курсу: ");
        PcsOfGender(students, "Male", 3);
        System.out.println("Средний возраст людей из первой группы: " + getAverageAgeByCourse(students, 1));
        students.get(0).setMarks(new int[]{5, 4, 3, 2, 1});
        students.get(1).setMarks(new int[]{5, 5, 4, 1, 2});
        students.get(2).setMarks(new int[]{5, 4, 4, 1, 2});
        students.get(3).setMarks(new int[]{1, 5, 4, 1, 2});
        students.get(4).setMarks(new int[]{3, 3, 4, 1, 2});
        students.get(5).setMarks(new int[]{3, 3, 3, 3, 3});
        students.get(6).setMarks(new int[]{5, 5, 4, 5, 2});
        students.get(7).setMarks(new int[]{5, 5, 4, 3, 2});
        students.get(8).setMarks(new int[]{5, 5, 4, 2, 1});
        students.get(9).setMarks(new int[]{5, 5, 5, 5, 5});

        for (Student student : students) {
            System.out.println("Оценки для студента " + student.getFirstName() + " " + student.getLastname() + ": ");
            int[] marks = student.getMarks();
            if (marks != null) {
                for (int mark : marks) {
                    System.out.print(mark + " ");
                }
                System.out.println(); // Переход на новую строку после печати оценок
            } else {
                System.out.println("Оценок нет.");
            }
        }
        Map<Long, Map<Student, Double>> avgMarksByGroup = avgStudentMarks(students);

        avgMarksByGroup.forEach((group, studentMarks) -> {
            System.out.println("Средний балл для группы " + group + ":");
            studentMarks.forEach((student, avg) -> {
                System.out.println(student.getFirstName() + " " + student.getLastname() + ": " + avg);
            });
            System.out.println();
        });
    }

    private static void listByCourse(List<Student> students) {
        long listByCours = students.stream().map(Student::getCourse).distinct().count();
        System.out.println("Countries : " + listByCours);
        //тут мы узнаем кол-во стран из которых студенты
    }
    private static void PcsOfGender(List<Student> students, String gender, int course) {
        List<Student> result = students.stream()
                .filter(student -> student.getGender().equals(gender))  // Use equals() for string comparison
                .filter(student -> student.getCourse() == course)  // Check for equality with '=='
                .collect(Collectors.toList());
        System.out.println("Кол-во людей :" + result.size());
        for (Student s :
                result) {
            System.out.println(s);
        }
    }

    private static void normalListByCourse(List<Student> students, int course) {
        List<Student> result = students.stream().
                filter(student -> student.getCourse() == course)
                .collect(Collectors.toList());
        for (Student s :
                result) {
            System.out.println(s);
        }
    }

    private static void ListByGroup(List<Student> students, long group) {
        List<Student> result = students.stream().filter(student -> student.getGroupNum() == group)
                .collect(Collectors.toList());
        for (Student s :
                result) {
            System.out.println(s);
        }
    }

    private static void SortedLastNameAndAgeListFromGroup(List<Student> students, long group) {
        List<Student> result = students.stream()
                .filter(student -> student.getGroupNum() == group)
                .sorted(Comparator.comparing(Student::getLastname).thenComparing(Student::getBirtDay))
                .collect(Collectors.toList());
        for (Student s :
                result) {
            System.out.println(s);
        }
    }

    private static double getAverageAgeByCourse(List<Student> students, long course) {
        // Форматтер для парсинга строки даты рождения
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // Получаем список возрастов студентов по указанному курсу
        List<Integer> ages = students.stream()
                .filter(student -> student.getCourse() == course)
                .map(student -> {
                    // Получаем текущую дату
                    LocalDate currentDate = LocalDate.now();
                    // Парсим строку даты рождения студента в объект LocalDate
                    LocalDate birthDate = LocalDate.parse(String.valueOf(student.getBirtDay()), formatter);
                    // Вычисляем возраст
                    return currentDate.getYear() - birthDate.getYear();
                })
                .collect(Collectors.toList());

        // Рассчитываем средний возраст
        return ages.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    private static double avgAge(List<Student> students, long course) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        //получаем список студентов по указаному курсу
        List<Integer> ages = students.stream().filter(student -> student.getBirtDay() == course)
                //делаем преобразование в года с помощью map
                .map(student -> {
                    LocalDate dataNow = LocalDate.now();
                    //парсим даті из строки в нормальный вид
                    LocalDate birthDate = LocalDate.parse(String.valueOf(student.getBirtDay()), dateTimeFormatter);
                    return dataNow.getYear() - birthDate.getYear();
                })
                .collect(Collectors.toList());
        return ages.stream().mapToInt(Integer::intValue).average().orElse(0.0);
      /*  orElse(0.0) используется, чтобы указать значение по умолчанию (в данном случае, 0.0),
        которое будет возвращено, если стрим пустой и невозможно вычислить среднее значение.
        */
    }

    private static Map<Long, Map<Student, Double>> avgStudentMarks(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGroupNum,
                        Collectors.toMap(
                                student -> student,
                                student -> Arrays.stream(student.getMarks()).average().orElse(0.0)
                        )
                ));

    }
}