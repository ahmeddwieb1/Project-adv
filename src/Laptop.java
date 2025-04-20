public class Laptop implements Technology {

    private String brand;
    private String model;
    private String processor;
    private int ramGB;
    private int storageGB;
    private double screenSize;
    private int batteryLife;
    private double weight;
    private double basePrice;
    private boolean isTouchscreen;

    public Laptop() {
    }

    public Laptop(String brand, String model, String processor,
                  int ramGB, int storageGB, double screenSize,
                  int batteryLife, double weight, double basePrice, boolean isTouchscreen) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        this.weight = weight;
        this.basePrice = basePrice;
        this.isTouchscreen = isTouchscreen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isTouchscreen() {
        return isTouchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        isTouchscreen = touchscreen;
    }

    @Override
    public double Price() {
        double total = basePrice;
        if (isTouchscreen) {
            total += 1000;
        }
        if (screenSize > 15.6) {
            total += 600;
        }
        return total;
    }

    @Override
    public String getWarrantyInfo() {
        return "2-year limited warranty with 1-year battery coverage";
    }


    public void enableTouchscreen() {
        isTouchscreen = true;
    }

    public double getPortabilityScore() {
        return (screenSize * weight) / batteryLife;
    }


    @Override
    public void displaySpecs() {
        System.out.println("Laptop Specifications:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("ScreenSize: " + screenSize + " inh");
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("ram: " + ramGB + " GB");
        System.out.println("weight" + weight + " grams");
        System.out.println("price: " + Price() + " $");

    }
}