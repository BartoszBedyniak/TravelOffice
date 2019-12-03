package pl.accenture;

public class Trip {
    Date start;
    Date end;
    String description;

    public Trip(Date start,Date end,String description)
    {
        this.start=start;
        this.end=end;
        this.description=description;
    }
    String getInfo(){

    return " Start: "+this.start.getInfo()+" Koniec: "+this.end.getInfo();
    }
}
