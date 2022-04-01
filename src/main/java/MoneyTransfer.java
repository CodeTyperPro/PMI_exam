public class MoneyTransfer extends Bank{
    public void transfer(String account_number, Integer ammount){
        if(super.existsAccount(account_number)){
            int index = super.getIndexOfAccount(account_number);
            super.getAccountArrayList().get(index).addBalance(ammount);
        }
    }
}
