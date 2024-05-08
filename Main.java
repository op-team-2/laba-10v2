import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення списку об'єктів
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 21));
        people.add(new Student("Alice", 17, "12"));
        people.add(new Person("Mike", 30));
        people.add(new Student("Bob", 18, "15"));

        // Виведення списку об'єктів на консоль за допомогою лямбда-виразу
        iterateOverList(people);
    }

    public static <T> void iterateOverList(Iterable<T> iterable) {
        Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            System.out.println(element);
        }
    }
}