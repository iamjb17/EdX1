public class Motorcycle extends Transportation {

    // Instance Variables
    private int wheelCount = 2;
    private String engineSize = "small";
    private int numDoors = 0;

    // Constructor
    public Motorcycle() {
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wheelCount=" + wheelCount +
                ", engineSize='" + engineSize + '\'' +
                ", numDoors=" + numDoors +
                '}';
    }
}
