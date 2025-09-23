public class pattern {
    public static void main() {

        triangle(3);
        System.out.println();

        parallel(6, 5, 2);
        System.out.println();
        
        triangle(4);
        triangleReverse(3);
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

    public static void triangleReverse(int size)
    {
        for (int i = size; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

    public static void parallel(int width, int height, int indent) {
        for (int i = 0; i < height; i++) {
            int indentation = i * indent;
            for (int j = 0; j < width + indentation; j++) {
                System.out.print(j < indentation ? ' ' : '#');
            }
            System.out.println();
        }
    }
}
