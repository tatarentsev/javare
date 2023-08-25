public class addHuman extends Command{
    private String description;
    private ConsoleUI consoleUI;

    public addHuman(ConsoleUI consoleUI) {
        super("Добавить человека", consoleUI);
    }

    public void execute() {
        super.getConsoleUI().addHuman();
    }
}
