  // ParkingSpot.java
public class ParkingSpot {
    private int spotNumber;
    private boolean available;
    
    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.available = true;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

// ParkingLot.java
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;
    
    public ParkingLot(int capacity) {
        spots = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            spots.add(new ParkingSpot(i));
        }
    }
    public void parkVehicle(Vehicle vehicle) {
        // Logic to find an available spot and park the vehicle
    }
    
    public void retrieveVehicle(String licensePlate) {
        // Logic to retrieve a vehicle based on its license plate
    }
}

// Vehicle.java
public class Vehicle {
    private String licensePlate;
    private String type;
    
    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.t
    
}
}
