package teil2;

public class Main {
    public static void main(String[] args) {
        Subjekt subject = new Subjekt();

        HundBeobachter hund = new HundBeobachter();
        MausBeobachter maus = new MausBeobachter();
        EnteBeobachter ente = new EnteBeobachter();

        subject.addObserver(hund);
        subject.addObserver(maus);
        subject.addObserver(ente);

        subject.benachrichtige();
    }

}
