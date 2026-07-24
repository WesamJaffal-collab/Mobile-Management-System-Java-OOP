// project 
package project;

public class Smartphone extends Phone {
     private int battery;
    private String operatingSystem;

    public Smartphone(String brand, String model, double price, int battery, String operatingSystem) {
        super(brand, model, price);
        this.battery = battery;
        this.operatingSystem = operatingSystem;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

     public double getTotalPrice() {
        return super.getPrice() + (battery * 0.02) + 50; 
    } 
}
    