public class Account {
    private String account_number;
    private int balance;

    public Account(String account_number) {
        this.account_number = account_number;
        this.balance = 0;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addBalance(int amount){
        this.balance = this.balance + amount;
    }
}
