public class DataContainer<T> {
    private ArrayList<T> data; // список элементов

    public DataContainer() {
        data = new ArrayList<>(); // создание пустого списка
    }

    public void add(T element) {
        data.add(element); // добавление элемента в список
    }

    public T get(int index) {
        return data.get(index); // получение элемента по индексу
    }

    public void sort(Comparator<T> comparator) {
        Collections.sort(data, comparator); // сортировка списка с помощью переданного компаратора
    }

    public void print() {
        for (T element : data) {
            System.out.println(element); // вывод элементов списка на экран
        }
    }
}

public void sort(Comparator<T> comparator) {
    Collections.sort(data, comparator); // сортировка списка с помощью переданного компаратора
        // Компаратор определяет порядок элементов в списке.
        // Если компаратор возвращает отрицательное число, то первый элемент меньше второго,
        // если положительное - то больше, если ноль - то элементы равны.
}
public void print() {
    for (T element : data) {
        System.out.println(element); // вывод элементов списка на экран
            // Каждый элемент будет выведен на отдельной строке.
            // Если элемент не является строкой, то будет вызван его метод toString().
    }
}
public void add(T element) {
    data.add(element); // добавление элемента в список
        // Элемент будет добавлен в конец списка.
}