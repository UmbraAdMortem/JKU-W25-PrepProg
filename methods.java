public class methods {
    public static double f(double x) {
        return 2 + g(x);
    }

    public static double g(double x) {
        return 2 * x;
    }

    public static double squared(double number) {
        return number * number;
    }

    public static double abs(double x) {
        return x < 0 ? -x : x;
    }

    public static void main() {
        for (double x = 0.0; x < 10; ++x) {
            System.out.println("f(" + x + ") = " + f(x));
        }
    }
}
