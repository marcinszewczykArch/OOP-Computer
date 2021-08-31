package computer.usbDevice;

public interface USBDevice {
    boolean connected();
    boolean disconnected();
    String getName();


}
