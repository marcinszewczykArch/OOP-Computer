package computer.usbDevice;

public class MemoryStick implements USBDevice {

    private String name;
    private boolean ejected = false;

   public void ejected(){
       System.out.println("memory stick ejected");
       ejected = true;
   }


    public MemoryStick (String name){
        this.name = name;
    }

    @Override
    public boolean connected() {
        System.out.println("memory stick connected");
        return true;
    }

    @Override
    public boolean disconnected() {
        if (!ejected) {
            System.out.println("Please eject memory stick first!");
            return false;
        }else{
            System.out.println("memory stick disconnected");
            }
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
