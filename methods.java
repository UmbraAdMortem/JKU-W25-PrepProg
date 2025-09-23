import java.util.concurrent.Flow.Subscriber;

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

    public static double quadGl1(double a, double b, double c) {
        // ax^2 + bx + c = 0
        double nominator = -b + Math.sqrt(b * b - 4 * a * c);
        double denominator = 2 * a;
        return nominator / denominator;
    }

    public static double quadGl2(double a, double b, double c) {
        // ax^2 + bx + c = 0
        double nominator = -b - Math.sqrt(b * b - 4 * a * c);
        double denominator = 2 * a;
        return nominator / denominator;
    }

    public static void main() {
        for (double x = 0.0; x < 10; ++x) {
            System.out.println("f(" + x + ") = " + f(x));
        }

        System.out.println("2^2= " + squared(2));

        System.out.println("|-5|= " + abs(-5));
        System.out.println("|5|= " + abs(5));

        System.out.println("2*x^2 + 6x + 4 = 0 x1 = " + quadGl1(1, 6, 4));
        System.out.println("2*x^2 + 6x + 4 = 0 x2 = " + quadGl2(1, 6, 4));
    }
}
