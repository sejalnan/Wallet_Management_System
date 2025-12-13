import java.io.StringReader;

public class Car extends Vehicle
{
    int door;
    int noOfSeat;


    public Car(int noOfWheels, int door, int noOfSeat, String fuelType, String engineType, int speed, String name)
    {
        super(noOfWheels,speed, fuelType,engineType);
        this.door=door;
        this.noOfSeat=noOfSeat;
        super.setName("Car");

    }


}
