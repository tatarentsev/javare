public class SortByName extends Command {
    public SortByName(ConsoleUI consoleUI) {
        super("отсортировать по имени", consoleUI);
    }

    public void execute() {
        super.getConsoleUI().sortByName();
    }
}
