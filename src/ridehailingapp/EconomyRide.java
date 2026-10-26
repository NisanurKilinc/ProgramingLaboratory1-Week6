
package ridehailingapp;

public class EconomyRide extends Ride{
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }

    public double getPricePerMinute() { 
        return pricePerMinute; 
    }

    
    @Override
    public double calculateFare() {
        double baseFare = super.calculateFare() + (getDurationMin() * pricePerMinute);
        if (baseFare < 50.0) {
            return 50.0;
        }
        return baseFare;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Economy Ücreti/Dk: " + pricePerMinute;
    }
}
