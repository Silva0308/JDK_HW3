/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа (но необязательно разного между собой),
 * над которыми должна быть произведена операция.*/
public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }

    public static <T extends Number> T multiply(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }

    public static <T extends Number> T divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() / b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
    }

    public static <T extends Number> T subtract(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
    }

}
