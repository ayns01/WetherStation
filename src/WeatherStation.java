import java.util.Observable;
import java.util.Observer;

public class WeatherStation extends Observable implements Observer {

    private double averageTemperature = 0.0;
    private double averageHumidity = 0.0;
    private double averagePressure = 0.0;

    @Override
    public void update(Observable o, Object arg) {
        if (!(arg instanceof SensorEvent)) return;

        SensorEvent event = (SensorEvent) arg;
        if(event.getSource() instanceof TemperatureSensor) {
            averageTemperature = (averageTemperature + event.getValue()) / 2;
        }else if(event.getSource() instanceof HumiditySensor) {
            averageHumidity = (averageHumidity + event.getValue()) / 2;
        }else if (event.getSource() instanceof PressureSensor) {
            averagePressure = (averagePressure + event.getValue()) / 2;
        }

        this.setChanged();
        String message = "average Temperature: " + averageTemperature +
                "\naverage Humidity: " + averageHumidity +
                "\naverage Pressure: " + averagePressure;
        notifyObservers(new Report(message));
    }
}
