package Bank;

import java.util.ArrayList;
import java.util.Random;

public class Account {
    static int client_total_account=0;
    static int total_accounts=0;
    float balance;
    int account_number;
    Client owner;
    ArrayList <Account> ac_list=new ArrayList<>();
    ArrayList<Account> clients_account_details=new ArrayList<>();
    int person_accounts;

    Account(){

    }

    Account(Client owner){
        this.owner=owner;
        Random rand=new Random();
        int ac_no=rand.nextInt(1000)+1;
        this.account_number=ac_no;
        this.client_total_account++;
        total_accounts++;
    }

    public void add_account(Account ac){
        clients_account_details.add(ac);
        System.out.println("Account has been made successfully");
        this.person_accounts=1;
        this.ac_list.add(ac);
    }

    public void show_all_clients_account(){
        for(Account aa:clients_account_details){
            System.out.println(aa);
        }
    }

    public Account search_client_account(int account_number){
        for (Account ac:clients_account_details)
        {
            if (account_number==ac.account_number){
                return (ac);
            }
        }
        return null;
    }

    public void delete_account(Account acc){
        clients_account_details.remove(acc);
        System.out.println("Account has been deleted successfully");
    }


    public String  deposit(int amount){
            this.balance = this.balance + amount;
            return ("Deposited Money!");
    }

    public String withdraw(int amount){
            if (amount > this.balance) {
                return ("Your account balance isn't enough");
            } else {
                this.balance -= amount;
                return ("Withdrawn Money!");
            }
    }

    public float checkBalance(){
            return this.balance;
    }

    public void new_account(Account ac){

        Random rand=new Random();
        int ac_no=rand.nextInt(1000)+1;
        this.account_number=ac_no;
        this.ac_list.add(ac);
        person_accounts++;
        System.out.println("New account has been added successfully!");
        System.out.println(ac);
    }

    public void myaccounts(String cnic,Account ac){
            for (Account acc:ac_list){
                System.out.println(acc);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", account_number=" + account_number +
                ", owner=" + owner +
                ", ac_list=" + ac_list +
                ", Person's accounts=" + person_accounts +
                '}';
    }
}
