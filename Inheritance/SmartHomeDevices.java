package Inheritance;

// Superclass representing a generic smart device
class Device {
    String deviceId;    // Unique identifier for the device
    String status;      // Device status: ON, OFF, etc.

    // Constructor to initialize device attributes
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display basic device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass representing a Thermostat device
class Thermostat extends Device {
    double temperatureSetting;  // Additional attribute for thermostat

    // Constructor to initialize thermostat-specific and device attributes
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);  // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overridden method to display full thermostat settings
    @Override
    public void displayStatus() {
        super.displayStatus();  // Display basic device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the smart home system
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Creating a Thermostat object
        Thermostat livingRoomThermostat = new Thermostat("TH-001", "ON", 22.5);

        // Display the thermostat status
        System.out.println("=== Smart Thermostat Status ===");
        livingRoomThermostat.displayStatus();
    }
}