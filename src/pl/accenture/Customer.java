package pl.accenture;

public class Customer {
    String name;
    Adress adress;
    Trip trip;


    public Customer(String name)
    {
        this.name=name;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(Adress adress) {
        this.adress=adress;
    }
    public void assignTrip(Trip trip)
    {
        this.trip=trip;
    }
    public String getInfo()
    {
        return this.name+" "+this.adress+" "+this.adress.getInfo()+" "+this.trip.getInfo();
    }


}
