package behaviour.command;
/**
 * Интерфейс команды
 */
 public interface Command {
    void execute();
    void undo();
}
