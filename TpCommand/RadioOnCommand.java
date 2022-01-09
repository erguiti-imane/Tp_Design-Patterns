package command;

public class RadioOnCommand implements Command{

    Radio radio;
    public RadioOnCommand(Radio radio){
        this.radio = radio;
    }
    @Override
    public void execute() {
        radio.on();
    }

    @Override
    public void unexecute() {
        radio.off();
    }
}
