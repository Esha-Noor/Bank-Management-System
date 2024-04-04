package Bank;

import java.util.ArrayList;

public class Person {

    String name;
    String cnic;
    int ph;
    static int id=0;
    ArrayList <Person> p_list=new ArrayList<>();

    public Person(){

    }

    public Person(String name,String cnic,int ph){
        this.name=name;
        this.cnic=cnic;
        this.ph=ph;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Person.id = id;
    }

    public ArrayList<Person> getP_list() {
        return p_list;
    }

    public void setP_list(ArrayList<Person> p_list) {
        this.p_list = p_list;
    }

    public void add_person(Person per){
        p_list.add(per);
        System.out.println("Person has been added successfully!");
    }

    public void showall_person(){
        for(Person pp:p_list){
            System.out.println(pp);
        }
    }

    public Person search_person(String cniic){
        for (Person pe:p_list)
        {
            if(pe.cnic.equals(cniic))
            {
                return pe;
            }
        }
        return null;
    }

    public void delete_person(Person pp)
    {
        p_list.remove(pp);
        System.out.println("Person Deleted Successfully");
    }

    public void total_person(){
        System.out.println(id);
    }

    public Object getCNIC() {
        return cnic;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", CNIC='" + cnic + '\'' +
                ", ph no.=" + ph +
                '}';
    }
}
