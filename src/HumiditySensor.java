import java.util.Observable;

public class HumiditySensor extends Observable {

    private int humidity;

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.setChanged(); // it tells about changing
        notifyObservers(new HumiditySensorEvent(this, humidity)); // it tells Observer
    }
}

class HumiditySensorEvent extends SensorEvent {
    HumiditySensorEvent(Object source, int value) {
        super(source, value);
    }
}
