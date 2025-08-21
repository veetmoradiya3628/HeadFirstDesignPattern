package command.simple_remote_command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command assigned.");
    }
}
