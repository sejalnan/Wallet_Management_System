import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Arrays;


// Wallet Class

public class Wallet {
    private String ownerName;
    private double balance;
    private String[] transactions = new String[100];
    private int transactionSize =100;
    private int tCount = 0;

    public Wallet(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }


    public void addMoney(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Amount Added: " + amt);
            addTransaction("Credit", amt);
        } else {
            System.out.println("Invalid Amount!");
            addTransaction("Failed", amt);
        }
    }

    public boolean payMoney(double amt) {
        if (balance >= amt && amt > 0) {
            balance -= amt;
            System.out.println("Amount Paid: " + amt);
            addTransaction("Debit", amt);
            return true;
        }
        System.out.println("Payment Failed!");
        addTransaction("Failed", amt);
        return false;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    private void addTransaction(String type, double amt)
    {
        if (tCount >= transactions.length)
        {
            System.out.println("Transaction Limit Reached!");
            return;
        }

        String record = LocalDateTime.now() + " | " +
                type + " | Amount: " + amt +
                " | Balance: " + balance;

        transactions[tCount++] = record;
    }


    public void showTransactions() {
        System.out.println("\nTransaction History ");
        for (int i = 0; i < tCount; i++) {
            System.out.println((i + 1) + ". " + transactions[i]);
        }
    }

    public void checkTransaction()
    {
        System.out.println("\nNumber of Transactions: "+tCount);
    }

    //Check the transactions
    public void fetchTransaction(int page,int limit)
    {
        int skip = (page-1)*limit;
        System.out.println("\n----Statement for "+ownerName+"----");

        if(tCount==0){
            System.out.println("No Transaction Found");
        }

        int dataIndex=Math.min((skip+limit),tCount);
        for(int i=skip; i<dataIndex; i++)
        {
            if(i>transactions.length && i>tCount)
            {
                System.out.println("No Transactions");
                return;
            }

            System.out.println(transactions[i]);

        }
        return;

    }

    //SUM OF ARRAY
    void sumOfArray() {
        int[] arr ={1,2,3,4,5};
        int sum=0;
        for(int i=0 ;i<arr.length;i++)
        {
            sum= sum + arr[i];
        }
        System.out.println("The sum of Array is : "+sum);

    }

    //increase the size of memory
    public void increaseSize(){

        int newTransactionSize =transactionSize+ transactionSize/2;
        String[] temp= new String[newTransactionSize];
        for (int i=0;i<transactionSize;i++)
        {
            temp[i]=transactions[i];
        }
        transactions= Arrays.copyOf(transactions,newTransactionSize);
        transactions = temp;
        System.out.println("Size Increased");
    }

    //Search Transaction type--Adding Filter
    //contains,for loop,if-else
    public void searchType(String type)
    {
        type=type.toLowerCase();

        for(int i=0;i<tCount;i++) {


            if (transactions[i].toLowerCase().contains(type)) {
                System.out.println(transactions[i]);

            }
        }



    }


}



