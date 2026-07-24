// project 
package project;

public class Accessory {
     private String type;
    private double price;

    public Accessory(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type ;
    }

    public void setType(String type) {
        this.type = type;
    }
                              
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

