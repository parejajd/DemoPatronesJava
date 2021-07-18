import java.util.*;

public class CommandsController {
    private List<Command> commands = new ArrayList<Command>();

    public void add(Command c) {
        commands.add(c);
    }

    public List<Command> get() {
        return commands;
    }

    public boolean isEmpty() { return commands.isEmpty(); }
}