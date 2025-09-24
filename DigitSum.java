public class DigitSum {
    public static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;

        // if (number <= 0)
        // return 0;
        // return number % 10 + digitSum(number / 10);
    }

    public static void main() {

        while (true) {
            System.out.print("Please enter number greater than 0: ");
            int number = In.readInt();
            System.out.println();
            if (number <= 0)
                return;

            int sum = digitSum(number);
            System.out.println("DigitSum(" + number + ") = " + sum);
        }
    }
}
