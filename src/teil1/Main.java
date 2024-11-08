package teil1;

public class Main {
    public static void main(String[] args) {
        HundBeobachter hund = new HundBeobachter();
        MausBeobachter maus = new MausBeobachter();
        EnteBeobachter ente = new EnteBeobachter();

        Subjekt.registriereBeobachter(hund);
        Subjekt.registriereBeobachter(maus);
        Subjekt.registriereBeobachter(ente);

        Subjekt.benachrichtige();
    }
}
