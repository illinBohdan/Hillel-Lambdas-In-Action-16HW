package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Результат використання анонімного класу");
        System.out.println(mathOperation.operate(5, 100)+"\n");

        System.out.println("Результат використання лямбда виразу");
        StringManipulator sm = string -> string.toUpperCase();
        System.out.println(sm.capitalize("rere")+"\n");

        System.out.println("Результат використання посилання на метод");
        Function<String, Integer> counter = StringListProcessor :: countUppercase;
        System.out.println(counter.apply("ВасяКукуTTsPaQaA")+"\n");

        System.out.println("Результат використання інтерфейсу Supplier<T>");
        Supplier<Integer> supplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println(supplier.get());

    }
}
