import java.time.LocalDateTime;
//transaction class--amount, type, balance, note
public class Transaction
{
    private static int counter=0; //Global variable
    private double amount;
    private String type;
    private double balance;
    private String note;
    private LocalDateTime createdAt;
    private int tId=0; //optional for user

    public Transaction(double amount,String type,double balance,String note )
    {
        this.amount=amount;
        this.type=type;
        this.balance=balance;
        this.note=note;
        this.tId=counter++;
        createdAt=LocalDateTime.now();


    }

    public Transaction(double amount,String type,double balance )
    {
        this.amount=amount;
        this.type=type;
        this.balance=balance;
        this.tId=counter++;
        createdAt=LocalDateTime.now();



    }

    //Date and Time createdAt
    // String getRecord()

    String getRecord()
    {

        String record = createdAt + " | " + type + " | Amount: " + amount + " | Balance: " + balance+" | NOTE: "+note;

        return record;


    }


}
