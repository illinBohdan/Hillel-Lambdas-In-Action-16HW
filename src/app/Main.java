package app;

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

    }
}
