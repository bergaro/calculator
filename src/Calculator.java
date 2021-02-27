import java.util.function.*;

public class Calculator {
    /**
     * Получаем экземпляр класса Calculator.
     */
    static Supplier<Calculator> instance = Calculator::new;
    /**
     * Во избежание инцидентов блокируем доступ к конструктору класса.
     * Создать экземпляр класса возможно только посредством @FunctionalInterface - Supplier
     */
    private Calculator() {    }
    /**
     * Производим бинарные операции над числами:
     * -Сложение
     * -Вычитание
     * -Умножение
     * -Деление
     */
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    /**
     * Производим унарные операции над числами
     * -Возведение в степень
     * -Получение модуля числа
     */
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> Math.abs(x);
    /**
     * Проверяем, является ли чило положительным
     */
    Predicate<Integer> isPositive = x -> x > 0;
    /**
     * Выводим результат в консоль посредством ссылки
     * на статический метод
     */
    Consumer<String> println = System.out::println;


}
