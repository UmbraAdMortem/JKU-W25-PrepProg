import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Nudelmenge
// Wassermenge
// Parmesanmenge
// Salz
// Sugo
// Basilikum

// Ausgabe: Die Mengen
// Preis

public class dinner {
    public static void main() {
        Double persons = 4.0;
        Double pasta = 120.0; // g / person

        HashMap<String, Double[]> ingredient = new HashMap<String, Double[]>();

        ingredient.put("Pasta", new Double[] { 120.0, 1.98 / 1000.0 }); // g / person | € / g
        ingredient.put("Bacon", new Double[] { 50.0, 47.67 / 1000.0 }); // g / person | € / g
        ingredient.put("Eggs", new Double[] { 1.0, 0.48 }); // g / person | € / g
        ingredient.put("Parmesan", new Double[] { 20.0, 42.25 / 1000.0 }); // g / person | € / g
        ingredient.put("Salt", new Double[] { 7.0, 1.38 / 1000.0 }); // g / person | € / g
        ingredient.put("Water", new Double[] { 300.0 * pasta / 100.0, 0.18 / 1000.0 }); // ml / 100g | € / ml

        System.out.println("For Spaghetti Cabonara for " + persons + " people you need:");

        Double prize = 0.0;
        Iterator<HashMap.Entry<String, Double[]>> it = ingredient.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double[]> entry = it.next();
            Double amount = entry.getValue()[0] * persons;
            prize += amount * entry.getValue()[1];

            System.out.println(String.format(" * %-10s: %10.2f g", entry.getKey(), amount));
        }

        System.out.println(String.format("The meal costs: %.2f € for %.0f people", prize, persons));
    }
}
