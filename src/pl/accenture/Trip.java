package pl.accenture;

public class Trip {
    private Date start;
    private Date end;
    private String description;
    double prince;

    public Trip(Date start,Date end,String description)
    {
        this.start=start;
        this.end=end;
        this.description=description;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String toString(){

    return " Start: "+this.start.toString()+" Koniec: "+this.end.toString()+" Cena: "+getPrince();
    }
}
