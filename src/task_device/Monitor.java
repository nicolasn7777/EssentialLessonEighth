package task_device;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor (){

    }

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Device: manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber = " +
               getSerialNumber() + ", X = " + resolutionX + ", Y = " + resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (resolutionX != monitor.resolutionX) return false;
        if (resolutionY != monitor.resolutionY) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        return result * 120;
    }
}
