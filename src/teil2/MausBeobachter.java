package teil2;

import java.util.Observable;
import java.util.Observer;

public class MausBeobachter implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Maus wurde benachrichtigt!");
    }
}
