import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

        StudentsByCourse(students, 2);
        StudentsByGroup(students, 1);
        StudentsByYearsAndLastName(students);
        pcsOfGender(students, "Male");
        System.out.println(AvgAgeOfStud(students));
        System.out.println(avgAgeByCorse(students, 1));
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

        for (Student s :
                students) {
            System.out.println();
            System.out.println(s.getFirstName() + " " + s.getLastname());
            int[] marks = s.getMarks();
            if (marks != null) {
                for (Integer m :
                        marks) {
                    System.out.print(m + " ");

                }
            }
        }

        calculateAverageMarks(students);
    }

    private static void StudentsByCourse(List<Student> students, long course) {
        List<Student> result = students.stream().filter(student -> student.getCourse() == course)
                .collect(Collectors.toList());
        System.out.println("======================Студенты на :" + course + "курсе========================");
        for (Student s :
                result) {
            System.out.println(s);
        }
    }

    /*В вашем коде вы не можете использовать цикл for-each напрямую в этом месте,
    потому что result - это объект типа List, и for-each используется для итерации по
    элементам массивов или коллекций. Однако вы можете
    использовать цикл for-each для итерации по result в отдельной части кода.*/
    private static void StudentsByGroup(List<Student> students, int group) {
        List<Student> result = students.stream().filter(student -> student.getCourse() == group)
                .collect(Collectors.toList());

        System.out.println("=========================Cтуденты с :" + group + "группы============================");
        result.forEach(System.out::println);
    }

    private static void StudentsByYearsAndLastName(List<Student> students) {
        List<Student> result = students.stream().sorted(Comparator.comparing(student -> student.getLastname()))
                .sorted(Comparator.comparing(student -> student.getBirtDay()))
                .collect(Collectors.toList());
        System.out.println("===================Сортировка по Фамилии и Дате рождения:========================");
        result.forEach(System.out::println);
    }

    private static int pcsOfGender(List<Student> students, String gender) {
        List<Student> result = students.stream()
                .filter(student -> student.getGender().equals(gender))
                .collect(Collectors.toList());
        System.out.println("Количество людей по гендеру " + gender + ": " + result.size());
        return result.size();
    }
    //средний возраст по группе

    private static double AvgAgeOfStud(List<Student> students) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        List<Integer> ages = students.stream()
                .sorted(Comparator.comparing(Student::getBirtDay))
                .map(student -> {
                    LocalDate datanow = LocalDate.now();
                    LocalDate birthdate = LocalDate.parse(String.valueOf(student.getBirtDay()), dateTimeFormatter);
                    return datanow.getYear() - birthdate.getYear();
                })
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Cредний возраст студентов из их возраста: " + ages);
        return ages.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }


    private static double avgAgeByCorse(List<Student> students, long course) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        List<Integer> result = students.stream().filter(student -> student.getCourse() == course)
                .map(student -> {
                    LocalDate datanow = LocalDate.now();
                    LocalDate birthday = LocalDate.parse(String.valueOf(student.getBirtDay()), dateTimeFormatter);
                    return datanow.getYear() - birthday.getYear();
                })
                .collect(Collectors.toList());
        System.out.println("Средний возраст студентов по курсу: " + course);
/*
        result.forEach(System.out::println);// распечатаем возраст людей из группы
*/

        return result.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    private static void calculateAverageMarks(List<Student> students) {
        // Выводим заголовок сообщения о среднем балле для каждого студента
        System.out.println("Средний балл для каждого студента:");

        // Итерируем по списку студентов
        for (Student student : students) {
            // Получаем массив оценок студента
            int[] marks = student.getMarks();

            // Рассчитываем средний балл с использованием Stream API
            // Если массив оценок пуст, используем значение по умолчанию (0.0)
            double averageMark = Arrays.stream(marks).average().orElse(0.0);
            // Выводим информацию о среднем балле студента на консоль
            System.out.println(student.getFirstName() + " " + student.getLastname() + ": " + averageMark);
        }
    }
    }
