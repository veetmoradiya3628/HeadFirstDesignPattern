package command.simple_remote_command;

public class App {
    public static void main(String[] args) {
        // Simple Remote Control Example

        // SimpleRemoteControl sr = new SimpleRemoteControl();

        // Light l = new Light();
        // GarageDoor garageDoor = new GarageDoor();

        // LightOnCommand lightOn = new LightOnCommand(l);
        // GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        // sr.setCommand(lightOn);
        // sr.buttonWarPressed();

        // sr.setCommand(garageDoorOpen);
        // sr.buttonWarPressed();

        // Advanced Remote Control Example
        AdvRemote advRemote = new AdvRemote();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        advRemote.setCommand(0, lightOn, lightOff);
        advRemote.setCommand(1, garageDoorOpen, garageDoorClose);

        System.out.println(advRemote);

        advRemote.onButtonPressed(0); // Light On
        advRemote.offButtonPressed(0); // Light Off
        advRemote.onButtonPressed(1); // Garage Door Open
        advRemote.offButtonPressed(1); // Garage Door Close
    }
}
