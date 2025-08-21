package command.simple_remote_command;

public class AdvRemote {
    Command[] onCommands;
    Command[] offCommands;

    public AdvRemote() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        if (slot < onCommands.length) {
            onCommands[slot].execute();
        } else {
            System.out.println("No command assigned to this slot.");
        }
    }

    public void offButtonPressed(int slot) {
        if (slot < offCommands.length) {
            offCommands[slot].execute();
        } else {
            System.out.println("No command assigned to this slot.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Advanced Remote ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " | "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }

}
