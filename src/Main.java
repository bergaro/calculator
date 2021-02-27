public class Main {
    public static void main(String[] args) {

        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(6, 9);
        calculator.println.accept("6 + 7 = " + a);

        int b = calculator.minus.apply(10, 4);
        calculator.println.accept("10 - 4 = " + b);

        int c = calculator.multiply.apply(5, 7);
        calculator.println.accept("5 * 7 = " + c);

        int d = calculator.devide.apply(100, 4);
        calculator.println.accept("100 / 4 = " + d);

        int e = calculator.pow.apply(10);
        calculator.println.accept("10^2 = " + e);

        int f = calculator.abs.apply(-250);
        calculator.println.accept("|-250| = " + f);

        boolean g = calculator.isPositive.test(11);
        calculator.println.accept("11 > 0 ? " + g);

        boolean h = calculator.isPositive.test(-12);
        calculator.println.accept("-12 > 0 ? " + h);
    }
}
