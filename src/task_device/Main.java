package task_device;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120f,"AB1234567CD");
        Device device2 = new Device("Samsung", 120f,"AB1234567CD");

        System.out.println("device1.equals(device2) = " + device1.equals(device2));
        System.out.println("device1.hashCode = " + device1.hashCode());
        System.out.println("device2.hashCode = " + device2.hashCode());

        Monitor monitor1 = new Monitor(1280,1024);
        Monitor monitor2 = new Monitor(1280,1024);

        System.out.println("monitor1.equals(monitor2) = " + monitor1.equals(monitor2));
        System.out.println("monitor1.hashCode = " + monitor1.hashCode());
        System.out.println("monitor2.hashCode = " + monitor2.hashCode());

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Samsung",120f,"AB1234567CD",1280,1024,500,"55562245F");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("Samsung",120f,"AB1234567CD",1280,1024,500,"55562245F");

        System.out.println("ethernetAdapter1.equals(ethernetAdapter2) = " + ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println("ethernetAdapter1.hashCode = " + ethernetAdapter1.hashCode());
        System.out.println("ethernetAdapter2.hashCode = " + ethernetAdapter2.hashCode());
    }
}
