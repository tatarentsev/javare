import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private boolean flag;
    private MainMenu menu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        flag = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Приветствую!");
        while (flag) {
            System.out.println(menu.menu());
            String choiceString = scanner.nextLine();
            int choice = Integer.parseInt(choiceString);
            menu.execute(choice);
        }
    }

    public void errorInput() {
        System.out.println("Ошибка ввода данных");
    }

    public void finish() {
        System.out.println("Работа завершена.");
        flag = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getFamilyTree() {
        presenter.getFamilyTree();
    }

    // String name, Gender gender, LocalDate BirthDate, LocalDate DeathDate, Human mather, Human father
    public void addHuman() {
        System.out.println("Укажите имя человека:");
        String name = scanner.nextLine();
        System.out.println("Укажите пол человека: ");
        String gender = scanner.nextLine();
        System.out.println("Укажите день рождения человека человека: ");
        LocalDate date_of_birthday = LocalDate.parse(scanner.nextLine());
        System.out.println("Укажите дату смерти человека: ");
        LocalDate date_of_die = LocalDate.parse(scanner.nextLine());
        System.out.println("Укажите мать человека: ");
        String mather = scanner.nextLine();
        System.out.println("Укажите отца человека: ");
        String father = scanner.nextLine();

        presenter.addHuman(name, Gender.valueOf(gender), date_of_birthday, date_of_die, mather, father);
    }

    @Override
    public void print(String answer) {
        System.out.println(answer);
    }
}
