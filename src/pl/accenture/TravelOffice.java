package pl.accenture;

import java.util.Arrays;

public class TravelOffice {
    Customer customerList[]=new Customer[2];
    int count=0;
    public static void main(String[] args) {
        TravelOffice list=new TravelOffice();
        list.addCustomer("bborys1",new Trip(new Date(2000,12,12),new Date(2000,12,12),"opis1"),new Adress("fajna","lodz",92515));
        list.addCustomer("bborys2",new Trip(new Date(2000,12,12),new Date(2000,12,12),"opis1"),new Adress("fajna","lodz",92515));


        list.addCustomer("bborys3",new Trip(new Date(2000,12,12),new Date(2000,12,12),"opis1"),new Adress("fajna","lodz",92515));
        list.addCustomer("bborys4",new Trip(new Date(2000,12,12),new Date(2000,12,12),"opis1"),new Adress("fajna","lodz",92515));
        list.addCustomer("bborys5",new Trip(new Date(2000,12,12),new Date(2000,12,12),"opis1"),new Adress("fajna","lodz",92515));
        System.out.println(list.getInfo());

        System.out.println("liczba osob "+list.getCustomerCount());



    Adress adress=new Adress("fajna","lodz",92515);
    Customer customer = new Customer("Bartek");
    Trip trip =new Trip(new Date(2000,12,12),new Date(2000,12,12),"opis");
    customer.assignTrip(trip);
    customer.setAdress(adress);
        System.out.println(customer.getInfo());
    }
    public String getInfo()
    {
        String s= new String();
        for(Customer customer:customerList)
        {
            if(customer!=null) {
                s = s + customer.getInfo() + " \n";
            }
        }
        System.out.println("Klienci:\n");
        return s;

}
    public void  addCustomer(String name,Trip trip,Adress adress) {
        count++;
        if(customerList.length<count)
        {
            customerList= Arrays.copyOf(customerList, customerList.length+1);
        }
        customerList[count-1]=new Customer(name);
        customerList[count-1].assignTrip(trip);
        customerList[count-1].setAdress(adress);

    }
    public int getCustomerCount()
    {
        return count;
    }

}
