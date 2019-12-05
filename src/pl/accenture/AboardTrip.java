package pl.accenture;

public class AboardTrip extends Trip {
    double insurance;

    public double getInsurance() {
        return insurance;
    }

    public AboardTrip(Date start, Date end, String description, double insurance) {
        super(start, end, description);
        this.insurance = insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public AboardTrip(Date start, Date end, String description) {
        super(start, end, description);
    }

    @Override
    public double getPrince() {
        return super.getPrince()+insurance;
    }

    @Override
    public void setPrince(double prince) {
        super.setPrince(prince);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
