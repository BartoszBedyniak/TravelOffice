package pl.accenture;

public class Customer {
    private String name;
    private Adress adress;
    private Trip trip;

    public Trip getTrip() {
        return trip;
    }

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
    public String toString()
    {
        return this.name+" "+this.adress+" "+this.adress.toString()+" "+this.trip.toString();
    }


}
