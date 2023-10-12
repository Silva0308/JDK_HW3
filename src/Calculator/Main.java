public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 2.5;

        int sumResult = Calculator.sum(a, (int) b);
        System.out.println("Сумма: " + sumResult);

        Number multiplyResult = Calculator.multiply(a, b);
        System.out.println("Умножение: " + multiplyResult);

        Number divideResult = Calculator.divide(a, b);
        System.out.println("Деление: " + divideResult);

        double subtractResult = Calculator.subtract(a, (int) b);
        System.out.println("Вычитание: " + subtractResult);
    }
}