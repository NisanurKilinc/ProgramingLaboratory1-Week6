
package ridehailingapp;

public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        
        if (distanceKm > 0) {
            this.distanceKm = distanceKm;
        } else {
            System.out.println("Uyarı: distanceKm pozitif olmalıdır! 1 olarak ayarlandı.");
            this.distanceKm = 1;
        }

        if (durationMin > 0) {
            this.durationMin = durationMin;
        } else {
            System.out.println("Uyarı: durationMin pozitif olmalıdır! 1 olarak ayarlandı.");
            this.durationMin = 1;
        }

        if (pricePerKm > 0) {
            this.pricePerKm = pricePerKm;
        } else {
            System.out.println("Uyarı: pricePerKm pozitif olmalıdır! 1 olarak ayarlandı.");
            this.pricePerKm = 1;
        }
    }

    // 2) Getter Metotları
    public String getPassengerName() { 
        return passengerName; 
    }
    public String getPickup() { 
        return pickup; 
    }
    public String getDestination() { 
        return destination; 
    }
    public double getDistanceKm() { 
        return distanceKm; 
    }
    public int getDurationMin() { 
        return durationMin; 
    }
    public double getPricePerKm() { 
        return pricePerKm; 
    }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }


    @Override
    public String toString() {
        return "Yolcu: " + passengerName + ", Kalkış: " + pickup + ", Varış: " + destination +
               ", Mesafe: " + distanceKm + " km, Süre: " + durationMin + " dk";
    }
}
