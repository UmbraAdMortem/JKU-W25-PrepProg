public class Throw {
    public static double queryDouble(String output) {
        System.out.print(output);
        double input = In.readDouble();
        System.out.println();
        return input;
    }

    public static void main(String[] args) {
        double pos_x = 0.0;
        double pos_y = 0.0;
        double velocity_x = 1.0;
        double velocity_y = 1.0;
        double gravity_x = 0.0;
        double gravity_y = -0.1;

        // double pos_x = queryDouble("Provide initial position in x: ");
        // double pos_y = queryDouble("Provide initial position in y: ");
        // double velocity_x = queryDouble("Provide initial velovity in x: ");
        // double velocity_y = queryDouble("Provide initial velovity in y: ");
        // double gravity_x = 0.0;
        // // double gravity_x = queryDouble("Provide initial gravity in x: ");
        // double gravity_y = queryDouble("Provide initial gravity in y: ");

        for (int time = 0; pos_y >= 0.0; ++time) {
            pos_x += velocity_x;
            pos_y += velocity_y;
            velocity_x += gravity_x;
            velocity_y += gravity_y;

            System.out.println(String.format("Time %4ds: P(%5.2f|%5.2f)", time, pos_x, pos_y));
        }
    }
}
