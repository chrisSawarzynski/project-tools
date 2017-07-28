package commands;

import java.util.List;
import java.util.ListIterator;

public interface Command {
  public ListIterator<String> run(ListIterator<String> argsIterator);
  public List<Command> register(List<Command> commands);
  public boolean check(String arg);
}
