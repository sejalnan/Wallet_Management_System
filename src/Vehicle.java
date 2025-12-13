public class Vehicle
{
    int noOfWheels;
    private int speed;
    private String fuelType;
    private String engineType;
    private String colour;
    private String name;

    public Vehicle(int noOfWheels,String name)
    {
        this.noOfWheels=noOfWheels;
        this.name=name;
    }


    public Vehicle(int noOfWheels, int speed, String fuelType, String engineType)
    {
        this.noOfWheels=noOfWheels;
        this.speed=speed;
        this.fuelType=fuelType;
        this.engineType=engineType;


    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfWheels()
    {
        return noOfWheels;
    }

    public void start()
    {
        System.out.println("Vehicle Started!!");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed:" +speed);
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
