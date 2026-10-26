
package ridehailingapp;

public class SharedRide extends EconomyRide{
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMinute);
        
        if (passengerCount >= 1 && passengerCount <= 4) {
            this.passengerCount = passengerCount;
        } else {
            System.out.println("Uyarı: passengerCount 1 ile 4 arasında olmalıdır! 1 olarak ayarlandı.");
            this.passengerCount = 1;
        }
    }

    public int getPassengerCount() { 
        return passengerCount; 
    }

    
    @Override
    public double calculateFare() {
        double totalEconomyFare = super.calculateFare();
        double farePerPassenger = (totalEconomyFare / passengerCount) * 1.10;
        return farePerPassenger;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Paylaşımlı Yolcu Sayısı: " + passengerCount;
    }
}
