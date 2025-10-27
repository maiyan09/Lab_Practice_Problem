public abstract class Sensor {
    String sensorID;
    String location;
    Sensor(String sensorID, String location) {
        this.sensorID = sensorID;
        this.location = location;
    } 
    public void displayStatus() {
        System.out.println("Sensor ID; "+ sensorID);
        System.out.println("Location: "+ location);
    }
    public abstract boolean isTriggered();
}
