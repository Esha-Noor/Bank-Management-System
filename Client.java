package Bank;

import java.util.ArrayList;

public class Client {
    String client_ID;
    Person pers;
    Account acc;
    static int id=0;
    ArrayList<Client> clnt=new ArrayList<>();
    private String cnic;

    public Client(){

    }

    public Client(Person pers){
        this.client_ID="Client_"+id;
        this.pers = pers;
        id++;
    }

    public String getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(String client_ID) {
        this.client_ID = client_ID;
    }

    public Person getPers() {
        return pers;
    }

    public void setPers(Person pers) {
        this.pers = pers;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Client.id = id;
    }

    public ArrayList<Client> getClnt() {
        return clnt;
    }

    public void setClnt(ArrayList<Client> clnt) {
        this.clnt = clnt;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void add_client(Client client){
        clnt.add(client);
        System.out.println("Person has been added as a client successfully!");
    }

    public void total_client(){
        System.out.println(id);
    }

    public void showall_client(){
        for(Client cc:clnt){
            System.out.println(cc);
        }
    }

    public Client search_client(String cniic){
        for (Client pe:clnt)
        {
            Person person = pe.pers;
            if (person != null && person.getCNIC().equals(cniic)) {
                return pe;
            }
        }
        return null;
    }

    public void delete_client(Client cc)
    {
        clnt.remove(cc);
        System.out.println("Client Deleted Successfully");
    }
    @Override
    public String toString() {
        return "Client{" +
                "client_ID='" + client_ID + '\'' +
                ", Client=" + pers +
                '}';
    }
}
