public class SortByAge extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super("отсортировать по возрасту", consoleUI);
    }

    public void execute() {
        super.getConsoleUI().sortByAge();
    }
}
