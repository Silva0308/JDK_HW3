/**Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.*/
public class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println(pair);  // Вывод: (Hello, 42)

        String str = pair.getFirst();
        Integer num = pair.getSecond();

        System.out.println(str);  // Вывод: Hello
        System.out.println(num);  // Вывод: 42
    }
}

