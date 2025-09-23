public class pattern {
    public static void main() {

        triangle(3);
        System.out.println();
    }

    public static void triangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
