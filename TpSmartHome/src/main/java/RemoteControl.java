import java.util.HashMap;

public class RemoteControl {

    Command[] commands;
    HashMap<Integer,Device> map = new HashMap();
    private String result="";

    public RemoteControl(int nbrSlot) {
        commands = new Command[nbrSlot];
    }

    public void init(Device...devices ) {
        int i=0;
        for(Device device:devices){
            map.put(i,device);
            i++;
        }
    }

    public void onButtonPressed(int i) {
        OnCommand onCommand = new OnCommand(map.get(i));
        result+=onCommand.execute()+"-";
    }

    public void offButtonPressed(int i) {
        OffCommand offCommand = new OffCommand(map.get(i));
        result+=offCommand.execute()+"-";
    }

    public String getResult() {
        return result;
    }
}
