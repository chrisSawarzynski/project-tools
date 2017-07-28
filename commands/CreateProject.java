package commands;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class CreateProject implements Command {
  public ListIterator<String> run(ListIterator<String> argsIterator) throws IndexOutOfBoundsException  {
    if (argsIterator.hasNext() == false)
      throw new IndexOutOfBoundsException("You have to specify project category!");
      // TODO: Change Exception class

    final String projectsPath = System.getenv("PROJECTS");
    final String category = argsIterator.next();
    
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
