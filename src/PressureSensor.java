import java.util.Observable;

public class PressureSensor extends Observable {

    private int Pressure;

    public int getPressure() {
        return Pressure;
    }

    public void setPressure(int Pressure) {
        this.Pressure = Pressure;
        this.setChanged(); // it tells about changing
        notifyObservers(new PressureSensorEvent(this, Pressure)); // it tells Observer
    }
}

class PressureSensorEvent extends SensorEvent {
    PressureSensorEvent(Object source, int value) {
        super(source, value);
    }
}

