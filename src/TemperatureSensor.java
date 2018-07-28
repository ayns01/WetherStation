import java.util.Observable;

public class TemperatureSensor extends Observable {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.setChanged(); // this tells Observer that this tempereture changed.
        notifyObservers(new TemperatureSensorEvent(this, temperature)); // it tells Observer context of changing
    }
}

class TemperatureSensorEvent extends SensorEvent {
    TemperatureSensorEvent(Object source, int value) {
        super(source, value);
    }
}
