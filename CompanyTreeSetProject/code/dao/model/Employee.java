package dao.model;
/*
private означает, что член класса виден только внутри этого класса.
protected же позволяет доступ к члену класса из его подклассов.
*/
public abstract class Employee implements Comparable<Employee>{
    // задаем поля класса работникам(ID,имя фамилию, возраст, рабочие часы)
    protected final int id;
   // protected означает,
    // что поле id видимо в подклассах и остается неизменным после инициализации.
   protected String name;
  protected String lastname;
  protected int age;

  protected int hours;

    public Employee(int id, String name, String lastname, int age, int hours) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hours = hours;
    }
//делаем здесь геттеры и будем использовать при написании МЕТОДОВ
    public int getId() {
        return id;
    }

    public int getHours() {
        return hours;
    }
    //Делам toString для вывода информации
    //Делаем через СтрингБилдер так как его можно изменять

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(name).append('\'');
        sb.append(", lastName='").append(lastname).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary());
        return sb.toString();
    }
    public abstract double calcSalary(); // делаем абстрактный метод что бы обьявить в классах с сотрудниками и посчитать их зарплату
    //Делаем Компаробл в главном классе, так как сравнение нам нужно будет для
    // того что бы использовать TreeSet, ибо для ТриСета нужна сортировка,
    //И нас хватит одного Компаробла тут, ибо у нас только по ID - будет сортировка
    //и так же обьявляем класс Employee абстрактным
    // если не предполагается создание объектов этого класса напрямую).

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id,o.id);
    }
}

