public class DigitSum {
    public static int digitSum(int number) {
        int sum = 0;
        while(number > 0)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;

        // if (number <= 0)
        //     return 0;
        // return number % 10 + digitSum(number / 10);
    }

    public static void main() {
        int number = 123;
        int sum = digitSum(number);
        System.out.print("Test");
        System.out.println("DigitSum(" + number + ") = " + sum);
    }
}
