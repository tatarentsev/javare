public class GetHumanListInfo extends Command {
    public GetHumanListInfo(ConsoleUI consoleUI) {
        super("Получить список людей", consoleUI);
    }

    public void execute() {
        super.getConsoleUI().getFamilyTree();
    }
}
