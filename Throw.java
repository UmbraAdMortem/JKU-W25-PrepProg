public class Throw {
    public static double queryDouble(String output) {
        System.out.print(output);
        return In.readDouble();
    }

    public static int queryInt(String output) {
        System.out.print(output);
        return In.readInt();
    }

    public static void main(String[] args) {
        double pos_x = 0.0;
        double pos_y = 0.0;
        double velocity_x = 1.0;
        double velocity_y = 1.0;
        double gravity_x = 0.0;
        double gravity_y = -0.1;
        int time_max = 120;

        // double pos_x = queryDouble("Provide initial position in x: ");
        // double pos_y = queryDouble("Provide initial position in y: ");
        // double velocity_x = queryDouble("Provide initial velovity in x: ");
        // double velocity_y = queryDouble("Provide initial velovity in y: ");
        // double gravity_x = 0.0;
        // double gravity_y = queryDouble("Provide initial gravity in y: ");
        // int time_max = queryInt("Provide maximum abount of simulation time: ");
        // System.out.println();


        System.out.println(
                "--------------------------------------------------------------------------------------------> Y");

        int time = 0;
        for (; time <= time_max; ++time) {
            System.out.format("Time %4ds: P(%5.2f|%5.2f) |", time, pos_x, pos_y);
            for (int y = 0; y < (int) (pos_y * 10); ++y)
                System.out.print(" ");

            System.out.print("*");
            // System.out.print(pos_y);
            System.out.println();

            pos_x += velocity_x;
            pos_y += velocity_y;

            if (pos_y <= 0.1)
                velocity_y = -velocity_y;

            velocity_x += gravity_x;
            velocity_y += gravity_y;
        }
        System.out.format("Time %4ds: P(%5.2f|%5.2f) V X%n", time, pos_x, pos_y);
    }
}
