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
        System.out.println(mathOperation.operate(5, 100));

        StringManipulator sm = string -> string.toUpperCase();
        System.out.println(sm.toUpperCase("rere"));



        Function<String, Integer> counter = StringListProcessor :: countUppercase;
        System.out.println(counter.apply("ВасяКукуКККaaaA"));

        Supplier<Integer> supplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);

        System.out.println(supplier.get());

    }
}
