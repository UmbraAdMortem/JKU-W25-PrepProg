public class Seals {
    public static int sealsAYear(int seals, double increment, int kills) {
        return (int) (seals * increment - kills);

    }

    public static void main() {
        int seals = 2600;
        double increment = 1.075;
        int duration = 10;
        int yearlyKills = 195;

        System.out.println((int)(seals * (increment - 1.0)));

        for (int y = 1; y <= duration; ++y) {
            seals = sealsAYear(seals, increment, yearlyKills);
            System.out.println(String.format("After %d years, %d seals are alive", y, seals));
        }

    }
}
