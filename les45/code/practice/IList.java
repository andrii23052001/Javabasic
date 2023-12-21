package practice;

public interface IList<E> extends  Iterable<E>{
    int size(); // узнать размер списка

    default boolean isEmpty() // есть ли что-то в списке или он пустой
    {
        return size() == 0;
    }

    void clean(); // удалить все из списка

    boolean add(E element); // добавить элемент списка

    default boolean contains(Object o) // есть ли элемент в списке
    {
        return indexOf(o)>=0;
    }

    default boolean remove(Object o) // удалить элемент по его индексу, если он есть (а все ли элементы мы удалим?)
    {
        int index=indexOf(o);
        if (index<0){ // когда обьекта нет в нашел списке
            return false;
        }
        remove(index);//удалили индекс и обьект пропал из списка
        return true;
    }

    boolean add(int index, E element); // добавить (вставить) элемент по индексу

    E remove(int index); // удалить элемент из списка по индексу

    E get (int index); // получить элемент по его индексу

    E set (int index, E element); // обновить элемент в списке по его индексу

    int indexOf(Object o); // зная элемент, найти его индекс

    int lastIndexOf(Object o);// ищем индекс элемента с конца списка
}
