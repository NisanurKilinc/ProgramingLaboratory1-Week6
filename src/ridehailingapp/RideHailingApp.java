
package ridehailingapp;

import java.util.ArrayList;

public class RideHailingApp {

    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();

        
        rides.add(new Ride("Ahmet Yılmaz", "Kızılay", "Çankaya", 10.0, 15, 5.0));
        rides.add(new EconomyRide("Ayşe Demir", "Tunalı", "Bahçelievler", 8.0, 20, 4.0, 1.5));
        rides.add(new PremiumRide("Mehmet Kaya", "AŞTİ", "Esenboğa Havalimanı", 30.0, 40, 10.0, 100.0, 1.5));
        rides.add(new SharedRide("Zeynep Çelik", "Bilkent", "ODTÜ", 12.0, 25, 4.0, 1.2, 3));

        
        for (Ride ride : rides) {
            System.out.println("--------------------------------------------------");
            System.out.println(ride.toString());
            System.out.println("Yolculuk Ücreti (Fare): " + ride.calculateFare() + " TL");
        }
        System.out.println("--------------------------------------------------");
    }
    
}
