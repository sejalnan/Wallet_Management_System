import org.w3c.dom.ls.LSOutput;

public class Train extends AbstractVehicle implements Payment
{
    @Override
    void start()
    {
        System.out.println("This is the child class i.e Train Class...");

    }


    @Override
    public void pay() {

    }
}
