public class SmokeSensor extends Sensor{
    double smokeLevel;
    SmokeSensor(String sensorID, String location, double smokeLevel) {
        super(sensorID, location);
        this.smokeLevel = smokeLevel;
    }
    @Override
    public boolean isTriggered() {
        if (smokeLevel > 5.0) {
            return true;
        }
        return false;
    }
}
