public class BankAccount {
    private long accountNum;
    private double accountbalance;
    
    public BankAccount(long accountNum , double accountbalance ){
        this.accountNum = accountNum;
        this.accountbalance = accountbalance;
    }

    public void deposite(double amount){
        double totalAmount = accountbalance + amount;
        System.out.println("Total amount  is :" + totalAmount);


    }

    public void withdraw(double amount){
        double withdrawMoney = accountbalance - amount;
        System.out.println("After withdrowing total amount is :" + withdrawMoney);


    }

    public double checkBalance (){
        return accountbalance;

    }
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(12345678, 5000);
        System.out.println(bank.accountNum + " " + bank.accountbalance);

        bank.deposite(3000);
        bank.withdraw(200);

    }
}
