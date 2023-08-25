import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, Gender gender, LocalDate date_of_birthday, LocalDate date_of_die, String mather, String father) {
        service.addHuman(name, gender, date_of_birthday, date_of_die, null, null);
    }

    public void getFamilyTree() {
        String answer = service.getInfo();
        view.print(answer);
    }

    public void sortByName() {
        service.sortByName();
    }

    public void sortByAge() {
        service.sortByAge();
    }
}
