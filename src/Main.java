public class Main {
    public static void main(String[] args) {
        Wallet w = new Wallet("Sejal Nandanwar", 7800);



        w.checkBalance();
        w.addMoney(500,"Credited");
        w.addMoney(8000,"Credited");
        w.payMoney(2000,"Debited");
        w.payMoney(100000,"Debited");

        //w.showTransactions();
        // w.checkTransaction();
        w.fetchTransaction(2,10);
        //w.sumOfArray();
        w.increaseSize();
        //w.searchType("Failed");
        //w.searchType("Debit");
        //w.searchType("credit");





    }

}