package task_device;

import java.util.Objects;

public class EthernetAdapter extends Monitor {
    int speed;
    String mac;

    public EthernetAdapter(){

    }

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter(int resolutionX, int resolutionY, int speed, String mac) {
        super(resolutionX, resolutionY);
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY, int speed, String mac) {
        super(manufacturer, price, serialNumber, resolutionX, resolutionY);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "Device: manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber = " +
                getSerialNumber() + ", X = " + getResolutionX() + ", Y = " + getResolutionY();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter that)) return false;
        if (!super.equals(o)) return false;
        return speed == that.speed && mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}

