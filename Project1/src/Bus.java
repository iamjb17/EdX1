public class Bus extends Transportation {

    // Instance Variables
    private int wheelCount = 6;
    private String engineSize = "large";
    private int numDoors = 3;

    // Constructor
    public Bus() {
    }

    @Override
    public String toString() {
        return "Bus{" +
                "wheelCount=" + wheelCount +
                ", engineSize='" + engineSize + '\'' +
                ", numDoors=" + numDoors +
                '}';
    }
}
