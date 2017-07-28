package commands;

import java.util.List;
import java.util.ListIterator;

public class CreateProject implements Command {
  public ListIterator<String> run(ListIterator<String> argsIterator) {
    System.out.println("create called!");
    return argsIterator;
  };
  public List<Command> register(List<Command> commands) {
    commands.add(this);
    return commands;
  };

  public boolean check(String arg) {
    return arg.equals("create");
  };
}
