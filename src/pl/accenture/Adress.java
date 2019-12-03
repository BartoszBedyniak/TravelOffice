package pl.accenture;

public class Adress {
    String street;
    String city;
    int zip;
    public Adress(String street,String city,int zip)
    {
        this.city=city;
        this.street=street;
        this.zip=zip;
    }


    public String getInfo()
    {
    return " Ulica: "+this.street+" miasto: "+this.city+" kod pocztowy: "+this.zip+"/n";
    }

}
