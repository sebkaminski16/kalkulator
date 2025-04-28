public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.printf("2+2=%d\n", Calculator.add(2,2));
        System.out.printf("2-2=%d", Calculator.subtract(2, 2));
    }
}
