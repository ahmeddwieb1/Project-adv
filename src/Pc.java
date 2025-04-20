public class Pc implements Technology {

    private String brand;
    private String processor;
    private int ramGB;
    private int storageGB;
    private String gpu;
    private String formFactor;
    private double basePrice;
    private boolean hasOSPreinstalled;

    public Pc(String brand, String processor, int ramGB,
              int storageGB, String gpu, String formFactor,
              double basePrice, boolean hasOSPreinstalled) {
        this.brand = brand;
        this.processor = processor;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
        this.gpu = gpu;
        this.formFactor = formFactor;
        this.basePrice = basePrice;
        this.hasOSPreinstalled = hasOSPreinstalled;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
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
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public String getFormFactor() {
        return formFactor;
    }
    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public boolean isHasOSPreinstalled() {
        return hasOSPreinstalled;
    }
    public void setHasOSPreinstalled(boolean hasOSPreinstalled) {
        this.hasOSPreinstalled = hasOSPreinstalled;
    }

    @Override
    public void displaySpecs() {
        System.out.println("PC Specifications:");
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM GB: " + ramGB);
        System.out.println("Storage GB: " + storageGB);
        System.out.println("GPU: " + gpu);
        System.out.println("price" + Price()+"$");


    }

    @Override
    public double Price() {
        double total = basePrice;
        if (hasOSPreinstalled) total += 100;
        if (ramGB > 16) total += 50 * (ramGB - 16);
        return total;
    }

    @Override
    public String getWarrantyInfo() {
        return "1-year limited warranty on parts and labor";
    }

    // Additional PC-specific methods
    public void upgradeRAM(int additionalGB) {
        ramGB += additionalGB;
    }

    public void installOS() {
        hasOSPreinstalled = true;
    }

}
