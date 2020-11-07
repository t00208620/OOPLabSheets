package labsheet4.exercise2;

public class Computer {
    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

    public Computer() {
        this("Not available","Not available",0,0,0);
    }

    public Computer(String manufacturer,String type,double speed,int RAM,double price) {
        setManufacturer(manufacturer);
        setType(type);
        setSpeed(speed);
        setRAM(RAM);
        setPrice(price);
    }

    String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0)
            this.speed = speed;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if(RAM > 0)
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0)
        this.price = price;
    }
        public String toString () {
            return "Manufacturer:" + getManufacturer() + " Type:" + getType() + "Speed:" + getSpeed()
                    + " RAM:" + getRAM() + " Price:" + getPrice();

    }

}
