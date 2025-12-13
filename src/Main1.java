import java.util.Scanner;

public class Main1
{
    //create function for Bike
    public static void createCar(Scanner sc)
    {
        int speed,door,noOfSeats,noOfWheels;
        String fuelType,engineType,name;
        System.out.println("******************Enter the details of Car******************");
        System.out.print("Enter the name of car:");
        name=sc.nextLine();
        sc.nextLine();

        System.out.print("Enter the fuel type of car:");
        fuelType=sc.nextLine();

        System.out.print("Enter the engine type of car:");
        engineType=sc.nextLine();

        System.out.print("Enter the speed of car:");
        speed=sc.nextInt();

        System.out.print("Enter the number of door in car:");
        door=sc.nextInt();

        System.out.print("Enter the no of wheels car:");
        noOfWheels=sc.nextInt();

        System.out.print("Enter the no of Seats car:");
        noOfSeats=sc.nextInt();

        Car c=new Car( noOfWheels, door, noOfSeats, fuelType, engineType,  speed,  name);
        c.start();

    }

    public static void createBike(Scanner sc)
    {
        System.out.println("please wait");

    }

    //Main Function
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Do You Want to Create Vehicle!!");
        System.out.println("1. Bike");
        System.out.println("2. Car");

        int choice= sc.nextInt();

        switch (choice)
        {
            case 1:
                createBike(sc);
                break;
            case 2:
                createCar(sc);
                break;
            default:
                System.out.println("Invalid choice");



        }

    }




}


