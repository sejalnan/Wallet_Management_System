public class Main {
    public static void main(String[] args) {
        Wallet w = new Wallet("Sejal Nandanwar", 7800);

        w.checkBalance();
        w.addMoney(500);
        w.addMoney(8000);
        w.payMoney(2000);
        w.payMoney(100000);

        w.showTransactions();
        w.checkTransaction();
        w.fetchTransaction(2,10);
        w.sumOfArray();
        w.increaseSize();
        w.searchType("Failed");


    }

}