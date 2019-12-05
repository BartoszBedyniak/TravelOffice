package pl.accenture;

public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;
    public DomesticTrip(Date start, Date end, String description) {
        super(start, end, description);
    }

    public DomesticTrip(Date start, Date end, String description, double ownArrivalDiscount) {
        super(start, end, description);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrince() {
        return super.getPrince()+ownArrivalDiscount;
    }

    @Override
    public void setPrince(double price) {
        super.setPrince(price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }
}
