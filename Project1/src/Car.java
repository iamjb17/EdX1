public class Car extends Transportation {


    // Instance Variables
    private int wheelCount;
    private String engineSize;
    private int numDoors;

    // Constructor(s)
    public Car(){
        this.wheelCount = 4;
        this.engineSize = "medium";
        this.numDoors = 4;
    }

   public Car(int numDoors) {
        if (numDoors == 2) {
            this.wheelCount = 4;
            this.engineSize = "large";
            this.numDoors = 2;
        } else {
            //System.out.println("Only 2 doors allowed");
            throw new IllegalArgumentException("Only 2 doors allowed");
        }
   }

    @Override
    public String toString() {
        return "Car{" +
                "wheelCount=" + wheelCount +
                ", engineSize='" + engineSize + '\'' +
                ", numDoors=" + numDoors +
                '}';
    }
}
