public class MotionSensor extends Sensor{
    boolean motionDetected;
    MotionSensor(String sensorID, String location, boolean motionDetected) {
        super(sensorID, location);
        this.motionDetected = motionDetected;
    }
    @Override
    public boolean isTriggered() {
        return motionDetected;
    }
    public void reset() {
        if(motionDetected) {
            motionDetected = false;
        }
    }
}
