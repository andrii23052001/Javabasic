package Decanat;

/*Задача 1. По аналогии с классом User создать класс Student1 с полями: id, firstName,
        lastName, birtDay, course, groupNum (номер группы), country, gender(пол).
        В приложении DekanatAppl создать студентов из разных стран, которые учатся на
        разных курсах, в разных группах. Сделать списки студентов по курсам, по группам,
        отсортированные по фамилиям и возрасту. Сколько студентов мужчин? Сколько женщин?
        Какой у них средний возраст по курсу? По всем студентам? Дополнительное задание (**):
        добавить
        у каждого студента поле int[] marks с его оценками и рассчитать средний балл.*/
public class Student {
    private long id;
    private String firstName;
    private String lastname;

    private long birtDay;
    private long course;
    private long groupNum;
    private String country;
    private String gender;

    private int marks[];
    public Student(long id, String firstName, String lastname, long birtDay, long course, long groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.birtDay = birtDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
        this.marks=new  int[5];
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(long birtDay) {
        this.birtDay = birtDay;
    }

    public long getCourse() {
        return course;
    }

    public void setCourse(long course) {
        this.course = course;
    }

    public long getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(long groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birtDay=" + birtDay +
                ", course=" + course +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
