/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
import commands.CreateProject;
import commands.Command;
import java.util.List;
import java.util.ListIterator;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

class Project {
    protected static List<Command> registerCommands() {
        List<Command> commands = new Vector<Command>();
        commands = (new CreateProject()).register(commands);
        return commands;
    }
    public static void main(String[] args) {
        List<String> argsList = Arrays.asList(args);
        ListIterator<String> argsIterator = argsList.listIterator();
        List<Command> commands = registerCommands();
        String arg = "";

        while (argsIterator.hasNext() == true) {
            arg = argsIterator.next();

            for (Command cmd : commands) {
                if (cmd.check(arg) == false)
                    continue;
                try {
                    argsIterator = cmd.run(argsIterator);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }

    }
}
