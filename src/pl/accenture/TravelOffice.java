package pl.accenture;

import java.util.Arrays;

public class TravelOffice {
    Customer customerList[]=new Customer[2];
    int count=0;

    public String getInfo()
    {
        String s= new String();
        for(Customer customer:customerList)
        {
            if(customer!=null) {
                s = s + customer.toString() + " \n";
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
