import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Arrays;

// Wallet Class
public class Wallet {
    private String ownerName;
    private double balance;
    private int transactionSize=100;
    private Transaction[] transactions = new Transaction[transactionSize];
    private int tCount = 0;
    private String note;

    //constructor-- To initialize the class
    public Wallet(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }


    //Add Money
    public void addMoney(double amt,String note) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Amount Added: " + amt);
            addTransaction("Credit", amt,balance,note);
        } else {
            System.out.println("Invalid Amount!");
            addTransaction("Failed", amt,balance,note);
        }
    }
    //Pay money
    public boolean payMoney(double amt,String note) {
        if (balance >= amt && amt > 0) {
            balance -= amt;
            System.out.println("Amount Paid: " + amt);
            addTransaction("Debit", amt,balance, note);
            return true;
        }
        System.out.println("Payment Failed!");
        addTransaction("Failed", amt,balance,note);
        return false;
    }

    //Check Balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    //Add transactions
    private void addTransaction(String type, double amt,double balance,String note)
    {
        if (tCount >= transactions.length)
        {

            increaseSize();
        }


        Transaction t = new Transaction(amt,type,balance,note);
        tCount++;


    }

    //Show transaction history
    public void showTransactions() {
        System.out.println("\nTransaction History ");
        for (int i = 0; i < tCount; i++) {
            System.out.println((i + 1) + ". " + transactions[i]);
        }
    }
    //Show number of transactions
    public void checkTransaction()
    {
        System.out.println("\nNumber of Transactions: "+tCount);
    }

    //Check the transactions
    public void fetchTransaction(int page,int limit) {
        int skip = (page-1)*limit;
        System.out.println("\n----Statement for "+ownerName+"----");

        if(tCount==0){
            System.out.println("No Transaction Found");
        }

        int dataIndex=Math.min((skip+limit),tCount);
        for(int i=skip; i<dataIndex; i++) {
            if(i>transactions.length && i>tCount) {
                System.out.println("No Transactions");
                return;
            }

            System.out.println(transactions[i].getRecord());

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

    public void increaseSize()
    {
        int newTransactionSize =transactionSize+ transactionSize/2;
        Transaction[] temp= new Transaction[newTransactionSize];
        for(int i=0;i<transactionSize;i++)
        {
            temp[i]=transactions[i];
        }
        transactions= Arrays.copyOf(transactions,newTransactionSize); // --direct function provided for increase the size
        transactions = temp;
        System.out.println("Size Increased");
    }



    //Search Transaction type--Adding Filter
    //contains,for loop,if-else

    public void searchType(String type)
    {
        type=type.toLowerCase();

        for(int i=0;i<tCount;i++) {


            if (transactions[i].getRecord().toLowerCase().contains(type)) {
                System.out.println(transactions[i]);

            }
        }



    }



}



