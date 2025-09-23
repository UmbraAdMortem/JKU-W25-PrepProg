public class pattern {
    public static void main() {

        triangle(3);
        // parallel(3, 3, 1, -2);
        System.out.println();

        parallel(6, 5, 2, 0);
        System.out.println();

        triangle(4);
        // parallel(4, 4, 1, -3);
        triangleReverse(3);
        // parallel(3, 3, -1, 0);
        System.out.println();

        parallel(4, 4, -1, 4);
        System.out.println();
    }

    public static void triangle(int size) {
        parallel(size, size, 1, 1 - size);

        // for (int i = 0; i < size; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print('#');
        // }
        // System.out.println();
        // }
    }

    public static void triangleReverse(int size) {
        parallel(size, size, -1, 0);

        // for (int i = size; i > 0; i--) {
        // for (int j = i; j > 0; j--) {
        // System.out.print('#');
        // }
        // System.out.println();
        // }
    }

    public static void parallel(int width, int height, int indent, int initIndent) {
        for (int i = 0; i < height; i++) {
            int indentation = initIndent + (i * indent);
            for (int j = 0; j < width + indentation; j++) {
                System.out.print(j < indentation ? ' ' : '#');
            }
            System.out.println();
        }
    }
}
