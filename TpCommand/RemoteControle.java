package command;

public class RemoteControle {
    Command slot;
    public RemoteControle(){

    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
