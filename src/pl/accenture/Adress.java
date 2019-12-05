package pl.accenture;

public class Adress {
    private String street;
    private String city;
    private int zip;
    public Adress(String street,String city,int zip)
    {
        this.city=city;
        this.street=street;
        this.zip=zip;
    }


    public String toString()
    {
    return " Ulica: "+this.street+" miasto: "+this.city+" kod pocztowy: "+this.zip;
    }

}
