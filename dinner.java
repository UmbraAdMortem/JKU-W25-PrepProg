public class dinner {
    public static void main() {
        double persons = 4;

        double pasta = 120.0; // g / persion
        double bacon = 50.0; // g / persion
        double eggs = 1; // g / persion
        double parmesan = 20.0; // g / persion
        double salz = 7.0; // g / persion
        double water = 300.0; // ml / 100g

        pasta = pasta * persons;
        bacon = bacon * persons;
        eggs = eggs * persons;
        parmesan = parmesan * persons;
        salz = salz * persons;
        water = pasta / 100.0 * water;

        System.out.println("For Spaghetti Cabonara for " + persons + " people you need:");
        System.out.println(" * pasta: " + pasta + " g");
        System.out.println(" * bacon: " + bacon + " g");
        System.out.println(" * eggs: " + eggs);
        System.out.println(" * parmesan: " + parmesan + " g");
        System.out.println(" * salz: " + salz + " g");
        System.out.println(" * water: " + water + " ml");

        double p_pasta = 1.98 / 1000.0; // € / g
        double p_bacon = 47.67 / 1000.0; // € / g
        double p_eggs = 0.48; // € / a
        double p_parmesan = 42.25 / 1000.0; // € / g
        double p_salz = 1.38 / 1000.0; // € / g
        double p_water = 0.18 / 1000.0; // € / ml

        p_pasta = p_pasta * pasta;
        p_bacon = p_bacon * bacon;
        p_eggs = p_eggs * eggs;
        p_parmesan = p_parmesan * parmesan;
        p_salz = p_salz * salz;
        p_water = p_water * water;

        double expanse = p_pasta +
                            p_bacon +
                            p_eggs +
                            p_parmesan +
                            p_salz +
                            p_water;

        System.out.println("The meal costs: " + expanse + " € for " + persons + " people");

        // Nudelmenge
        // Wassermenge
        // Parmesanmenge
        // Salz
        // Sugo
        // Basilikum

        // Ausgabe: Die Mengen
        // Preis
    }
}
