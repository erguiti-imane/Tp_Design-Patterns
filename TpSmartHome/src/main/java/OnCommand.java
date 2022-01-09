public class OnCommand implements Command {
    Device device;
    public OnCommand(Device device){
        this.device = device;
    }
    @Override
    public String execute() {
        return device.on();
    }

    @Override
    public String unexecute() {
        return device.off();
    }
}
