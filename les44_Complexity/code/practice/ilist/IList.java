package practice.ilist;

//зададим абстрактные методы для работы со структурой данных "лист/List(список чего то ),
// для любых типов данных int, boolean,Integer,String,StringBuider,Employee,Cat,Photo,Book

public interface IList <E> {

   int size(); // узнать размер списка


    boolean isEmpty();// есть ли что-то в списке или он пустой

     // добавить элемент списка
 void clean();  // удалить все из списка


   boolean add(E element); // добавить (вставить) элемент по индексу
   boolean contains(Object o);  // есть ли элемент в списке

    // удалить элемент, если он есть (а все ли элементы мы удалим?)

    // удалить элемент из списка по индексу
    // обновить элемент в списке по его индексу
    // найти элемент по его индексу
    // зная элемент, найти его индекс
    // ищем индекс элемента с конца списка
}
