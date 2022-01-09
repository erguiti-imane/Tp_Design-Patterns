public class OffCommand implements Command{
    Device device;
    public OffCommand(Device device){
        this.device = device;
    }
    @Override
    public String execute() {
        return device.off();
    }

    @Override
    public String unexecute() {
        return device.on();
    }
}
