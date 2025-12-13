public class Bike extends Vehicle
{
    int noOfBreaks;
    int noOfSeats;
    Boolean helmet;


    public Bike(int noOfWheels,int noOfBreaks,int noOfSeats,Boolean helmet,int speed,String fuelType,String engineType)
    {
        super(noOfWheels,speed, fuelType,engineType);
        this.noOfBreaks=noOfBreaks;
        this.noOfSeats=noOfSeats;
        this.helmet=helmet;

    }


}
