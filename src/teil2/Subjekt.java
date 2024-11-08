package teil2;

import java.util.Observable;

public class Subjekt extends Observable {
    public void benachrichtige() {
        setChanged();
        notifyObservers();
    }
}
