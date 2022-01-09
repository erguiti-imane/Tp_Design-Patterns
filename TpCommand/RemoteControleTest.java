package command;

public class RemoteControleTest {
    public static void main(String[] args) {
        RemoteControle remote = new RemoteControle();
        Light light = new Light();
        Radio radio = new Radio();
        TV tv = new TV();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        RadioOnCommand radioOnCommand = new RadioOnCommand(radio);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);

        remote.setCommand(tvOnCommand);
        remote.buttonWasPressed();
    }
}
