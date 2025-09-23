public class pattern {
    public static void main() {
        int size = 3;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
