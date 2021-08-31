package computer;

import computer.drive.Drive;
import computer.usbDevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;


    List<USBDevice> usbDevices = new ArrayList<>();


    //Konstruktor computer.Computer
    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    //Gettery i Settery
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUsbDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connected();

        if (isConnected == true) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUsbDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnected();

        if (!isDisconnected) {              //"!isDisconnected" to jak "isDisconnected==false"
            System.out.println("forcibly removed USD device");
        }
        usbDevices.remove(usbDevice);
    }

}
