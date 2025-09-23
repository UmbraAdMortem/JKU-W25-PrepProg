public class DigitSum {
    public static int digitSum(int number) {
        if (number <= 0)
            return 0;
        return number % 10 + digitSum(number / 10);
    }

    public static void main() {
        int number = 123;
        int sum = digitSum(number);

        System.out.println("DigitSum(" + number + ") = " + sum);
    }
}
