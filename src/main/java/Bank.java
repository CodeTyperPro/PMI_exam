import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accountArrayList;

    public Bank(){
        accountArrayList = new ArrayList<>();
    }

    public void openNewAccount(String account_number){
        if(!existsAccount(account_number)){
            Account account = new Account(account_number);
            accountArrayList.add(account);
        }
    }

    public void closeAccount(String account_number){
        if(existsAccount(account_number)){
            int index = getIndexOfAccount(account_number);
            accountArrayList.remove(index);
        }
    }

    public String getBalances(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<accountArrayList.size(); i++){
            Account account = accountArrayList.get(i);
            stringBuilder.append(account.getAccount_number()).append(" ").append(account.getBalance());

            if(i < accountArrayList.size() - 1){
                stringBuilder.append("\r\n");
            }
        }

        return stringBuilder.toString();
    }

    public int getIndexOfAccount(String account_number){
        for (int i = 0; i<accountArrayList.size(); i++){
            if(accountArrayList.get(i).getAccount_number().equals(account_number)){
                return i;
            }
        }
        return -1;
    }

    public boolean existsAccount(String account_number){
        for (Account u : accountArrayList){
            if(u.getAccount_number().equals(account_number)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }

    public void setAccountArrayList(ArrayList<Account> accountArrayList) {
        this.accountArrayList = accountArrayList;
    }
}
