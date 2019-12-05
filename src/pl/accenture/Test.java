package pl.accenture;

public class Test {

    public static void main(String[] args) {
        TravelOffice office = new TravelOffice();

        office.addCustomer("bborys2", new DomesticTrip(new Date(2000, 12, 12), new Date(2000, 12, 12), "opis1"), new Adress("fajna", "lodz", 92515));
        office.addCustomer("bborys2", new AboardTrip(new Date(2000, 12, 12), new Date(2000, 12, 12), "opis1"), new Adress("fajna", "lodz", 92515));
        office.customerList[0].getTrip().setPrince(1000);
        office.customerList[1].getTrip().setPrince(2000);
        for (Customer c :office.customerList) {

            if(c.getTrip() instanceof AboardTrip)
            {
              ((AboardTrip) c.getTrip()).setInsurance(100);
            }
            if(c.getTrip() instanceof DomesticTrip)
            {
                ((DomesticTrip) c.getTrip()).setOwnArrivalDiscount(10);
            }
        }

        System.out.println(office.getInfo());

        System.out.println("liczba osob " + office.getCustomerCount());


        Adress adress = new Adress("fajna", "lodz", 92515);
        Customer customer = new Customer("Bartek");
        Trip trip = new Trip(new Date(2000, 12, 12), new Date(2000, 12, 12), "opis");
        customer.assignTrip(trip);
        customer.setAdress(adress);
        System.out.println(customer.toString());
    }
}
