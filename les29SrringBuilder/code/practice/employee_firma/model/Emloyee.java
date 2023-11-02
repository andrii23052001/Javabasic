package practice.employee_firma.model;

public abstract class Emloyee {
    //поля класса
    protected final int id ;

    protected String firstname;

    protected String lastname;

    protected int age;

    protected double hours;

    // конструктор


    public Emloyee(int id, String firstname, String lastname, int age, double hours) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Emloyee emloyee = (Emloyee) object;

        return id == emloyee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id= ").append(id);
        sb.append(", firstName='").append(firstname).append('\'');
        sb.append(", lastName='").append(lastname).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary());
        return sb.toString();
    }
    public abstract double calcSalary();
}
