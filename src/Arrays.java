/**Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
 * */
public class Arrays {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println(compareArrays(array1, array2)); // Вывод: true

        String[] array3 = {"Hello", "World"};
        String[] array4 = {"Hello", "World"};
        System.out.println(compareArrays(array3, array4)); // Вывод: true

        Integer[] array5 = {1, 2, 3};
        Integer[] array6 = {1, 2, 4};
        System.out.println(compareArrays(array5, array6)); // Вывод: false
    }
}
