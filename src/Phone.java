public class Phone implements Technology {

    private String brand;
    private String model;
    private String os;
    private double screenSize;
    private int storageGB;
    private int ramGB;
    private int batteryCapacity;
    private int cameraMP;
    private double basePrice;
    private boolean is5GCapable;

    public Phone() {
    }

    public Phone(String brand, String model, String os, double screenSize,
                 int storageGB, int ramGB, int batteryCapacity, int cameraMP,
                 double basePrice, boolean is5GCapable) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.screenSize = screenSize;
        this.storageGB = storageGB;
        this.ramGB = ramGB;
        this.batteryCapacity = batteryCapacity;
        this.cameraMP = cameraMP;
        this.basePrice = basePrice;
        this.is5GCapable = is5GCapable;
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
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public int getStorageGB() {
        return storageGB;
    }
    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }
    public int getRamGB() {
        return ramGB;
    }
    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public int getCameraMP() {
        return cameraMP;
    }
    public void setCameraMP(int cameraMP) {
        this.cameraMP = cameraMP;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public boolean isIs5GCapable() {
        return is5GCapable;
    }
    public void setIs5GCapable(boolean is5GCapable) {
        this.is5GCapable = is5GCapable;
    }

    @Override
    public double Price() {
        double total = basePrice;
        if (is5GCapable) total += 80;
        if (cameraMP > 12) total += 50;
        return total;
    }

    @Override
    public String getWarrantyInfo() {
        return "1-year manufacturer warranty with 90-day phone support";
    }


    public void enable5G() {
        is5GCapable = true;
    }

    public double calculateValueScore() {
        return (screenSize + storageGB + cameraMP) / basePrice;
    }

    //todo
    @Override
    public void displaySpecs() {
        System.out.println("Phone Specifications:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("ScreenSize:" + screenSize + "inh");
        System.out.println("Storage: " + storageGB + "GB");
        System.out.println("Camera: " + cameraMP + "MP");
        System.out.println("ram :" + ramGB+"GB");
        System.out.println("batteryCapacity: "+batteryCapacity);
        System.out.println("final Price: " + Price()+"$");
    }
}