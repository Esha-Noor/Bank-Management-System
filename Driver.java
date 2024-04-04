package Bank;

import java.util.Scanner;

public class Driver {
    static Person global_p=new Person();
    static Client global_c=new Client();
    static Account global_a=new Account();
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String Magenta= "\u001B[35m";
        String Cyan= "\u001B[36m";
        String White= "\u001B[37m";
        String reset = "\u001B[0m";
        String spaces="                                                                 ";
        System.out.println(Cyan+spaces+"Welcome to AquaHorizon Bank"+reset);
        int check=1;
        while(check!=0){
        System.out.println("1.Person\n2.Client\n3.Your Account\n4.Exit\n--->");
        int choice=sc.nextInt();
        if (choice==1){
            System.out.println(Magenta + "You are a person!" + reset);
            int inner_person=1;
            while (inner_person!=0) {
                System.out.println("""
                        1.Add Person
                        2.Show All Persons
                        3.Search Person
                        4.Delete Person
                        5.Total Person
                        6.Return Back""");
                int ch_percon=sc.nextInt();
                if (ch_percon==1) {
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    System.out.print("Enter your CNIC:");
                    String cnic = sc.next();
                    System.out.print("Enter your phone number: ");
                    int ph = sc.nextInt();

                    Person pers = new Person(name, cnic, ph);
                    global_p.add_person(pers);
                }
                else if(ch_percon==2){
                    global_p.showall_person();
                }
                else if (ch_percon==3){
                    System.out.print("Enter CNIC of the person:");
                    String nic=sc.next();
                    System.out.println(global_p.search_person(nic));
                }
                else if (ch_percon==4)
                {
                    System.out.print("Enter the CNIC: ");
                    String ID=sc.next();
                    Person p1=new Person();
                    p1=global_p.search_person(ID);
                    if(p1!=null)
                    {
                        global_p.delete_person(p1);
                    }
                    else
                    {
                        System.out.println("No person Found");
                    }
                }
                else if (ch_percon==5) {
                    global_p.total_person();
                }else if (ch_percon==6) {
                    inner_person=0;
                }
                else {
                    System.out.println(red+"INVALID INPUT"+reset);
                }

            }
        }
            if (choice==2){
                System.out.println(Magenta + "You are in Client class!" + reset);
                int inner_client=1;
                while (inner_client!=0){
                    System.out.println("""
                        1.Add Client
                        2.Show All Clients
                        3.Search Client
                        4.Delete Client
                        5.Total Clients
                        6.Return Back
                        --->""");
                    int ch_client=sc.nextInt();
                    if (ch_client==1){
                        System.out.print("Enter CNIC of Person: ");
                        String CN=sc.next();
                        Person pp=new Person();
                        pp=global_p.search_person(CN);
                        if(pp!=null)
                        {
                            Client st=new Client(pp);
                            global_c.add_client(st);
                        }
                        else
                        {
                            System.out.println("Person not Exist");
                        }
                    }
                    else if (ch_client==2){
                        global_c.showall_client();
                    }
                    else if (ch_client==3) {
                        System.out.print("Enter CNIC of the person:");
                        String nic=sc.next();
                        System.out.println(global_c.search_client(nic));
                    } else if (ch_client==4) {
                        System.out.print("Enter the CNIC: ");
                        String ID=sc.next();
                        Client c1=new Client();
                        c1=global_c.search_client(ID);
                        if(c1!=null)
                        {
                            global_c.delete_client(c1);
                        }
                        else
                        {
                            System.out.println("No client Found");
                        }
                    } else if (ch_client==5) {
                        global_c.total_client();
                    } else if (ch_client==6) {
                        inner_client=0;
                    }
                    else {
                        System.out.println(red+"INVALID INPUT"+reset);
                    }
                }
            }
            if (choice==3){
                System.out.println(Magenta + "You are in Account class!" + reset);

                int inner_account=1;
                while(inner_account!=0){
                    System.out.println("""
                        1.Make Account
                        2.Show All Clients Account
                        3.Search Client's Account
                        4.Delete Account
                        5.Deposit money
                        6.Withdraw money
                        7.Check Balance
                        8.Add Account
                        9.My all accounts
                        10.Return back
                        """);
                    System.out.print("Enter you choice:");
                    int acc_choice=sc.nextInt();
                    if (acc_choice==1){
                        System.out.print("Enter CNIC of Client: ");
                        String CN=sc.next();
                        Client cc=new Client();
                        cc=global_c.search_client(CN);
                        if(cc!=null)
                        {
                            Account st=new Account(cc);
                            global_a.add_account(st);
                        }
                        else
                        {
                            System.out.println("Client not Exist");
                        }
                    }
                    else if (acc_choice==2){
                        global_a.show_all_clients_account();
                    }
                    else if (acc_choice==3){
                        System.out.print("Enter account number of the client:");
                        int ac_no=sc.nextInt();
                        System.out.println(global_a.search_client_account(ac_no));
                    } else if (acc_choice==4) {
                        System.out.print("Enter the account number: ");
                        int ac_no=sc.nextInt();
                        Account account=new Account();
                        account=global_a.search_client_account(ac_no);
                        if(account!=null)
                        {
                            global_a.delete_account(account);
                        }
                        else
                        {
                            System.out.println("No client Found");
                        }
                    } else if (acc_choice==5) {
                        System.out.print("Enter the account number: ");
                        int ac_no=sc.nextInt();
                        Account account=new Account();
                        account=global_a.search_client_account(ac_no);
                        if(account!=null)
                        {
                            System.out.print("How much do you want to deposit? -->");
                             int amount=sc.nextInt();
                            System.out.println(global_a.deposit(amount));
                        }
                        else
                        {
                            System.out.println("No client Found");
                        }
                    } else if (acc_choice==6) {
                        System.out.print("Enter the account number: ");
                        int ac_no=sc.nextInt();
                        Account account=new Account();
                        account=global_a.search_client_account(ac_no);
                        if(account!=null)
                        {
                            System.out.print("How much do you want to withdraw? -->");
                            int amount=sc.nextInt();
                            System.out.println(global_a.withdraw(amount));
                        }
                        else
                        {
                            System.out.println("No client Found");
                        }
                    } else if (acc_choice==7) {
                        System.out.print("Enter the account number: ");
                        int ac_no=sc.nextInt();
                        Account account=new Account();
                        account=global_a.search_client_account(ac_no);
                        if(account!=null)
                        {
                            System.out.print("Your current account balance is:");
                            System.out.println(global_a.checkBalance());
                        }
                        else
                        {
                            System.out.println("No client Found");
                        }
                    } else if (acc_choice==8) {
                        System.out.print("Enter the account number: ");
                        int ac_no=sc.nextInt();
                        Account account=new Account();
                        account=global_a.search_client_account(ac_no);
                        if(account!=null)
                        {
                            global_a.add_account(account);
                        }
                        else
                        {
                            System.out.println("No client Found");
                        }


                    } else if (acc_choice==9) {
                        System.out.print("Enter your account number:");
                        int acno=sc.nextInt();
                        Account acc=new Account();


                    } else if (acc_choice==10) {
                        inner_account=0;
                        break;
                    }
                }
            }
            if (choice==4){
                check=0;
                break;
            }
        }
    }
}
