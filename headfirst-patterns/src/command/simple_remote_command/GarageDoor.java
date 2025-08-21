package command.simple_remote_command;

public class GarageDoor {
    public GarageDoor() {
    }

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println("Garage Door Light is On");
    }

    public void lightOff() {
        System.out.println("Garage Door Light is Off");
    }
}
