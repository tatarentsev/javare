public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super("закончить работу", consoleUI);
    }

    public void execute() {
        super.getConsoleUI().finish();
    }
}