import java.lang.reflect.Array;

public class coord {
    public static void main() {
        int[][] points = { { 5, 5, 5 } };

        System.out.println(Array.getLength(points));
        System.out.println(Array.getLength(points[0]));

        print(points);
    }

    public static void print(int[][] points) {
        int x_min = -1;
        int y_min = -1;
        int z_min = -1;
        int x_max = 1;
        int y_max = 1;
        int z_max = 1;

        for (int p = 0; p < Array.getLength(points); ++p) {
            x_min = Math.min(x_min, points[p][0]);
            y_min = Math.min(y_min, points[p][1]);
            z_min = Math.min(z_min, points[p][2]);
            x_max = Math.max(x_max, points[p][0]);
            y_max = Math.max(y_max, points[p][1]);
            z_max = Math.max(z_max, points[p][2]);
        }

        for (int i = Math.max(x_max, z_max) * 2; i > Math.min(x_min, z_min) * 2; --i) {
            for (int j = Math.min(y_min, z_min) * 2; j < Math.max(y_max, z_max) * 2; ++j) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print('-');
                    }
                } else if (j == 0) {
                    System.out.print('|');
                } else if (j == i) {
                    System.out.print('/');
                } else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
