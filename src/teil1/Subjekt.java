package teil1;

import java.util.ArrayList;
import java.util.List;

public class Subjekt {
    private static List<Beobachter> beobachterListe = new ArrayList<>();

    public static void registriereBeobachter(Beobachter beobachter) {
        beobachterListe.add(beobachter);
    }

    public void entferneBeobachter(Beobachter beobachter) {
        beobachterListe.remove(beobachter);
    }

    public static void benachrichtige() {
        for (Beobachter beobachter : beobachterListe) {
            beobachter.aktualisieren();
        }
    }
}
