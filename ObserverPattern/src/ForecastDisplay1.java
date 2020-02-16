import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay1 implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay1(Observable observable) {

    }

}
