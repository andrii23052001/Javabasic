package json_weapper;

// имя Леонид, возраст 59 - это данные в одной программе
// {name : Leonid, age:59} -это Json, который передает другой программе и она его может \прочитать= парсинг
public class Json_wrapper {

    //поле класса

    private  Object value;

    //конструктор


    public Json_wrapper(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }


    @Override
    public String toString() {
        return
                 "{value=" + value + '}' ;
    }
}
