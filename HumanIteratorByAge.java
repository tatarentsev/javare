import java.util.Comparator;

public class HumanIteratorByAge<T extends FamilyTreeItem> implements Comparator<T> {

    @Override
    public int compare(T h1, T h2) {
        return Integer.compare(h1.getAge(), h2.getAge());
    }
}
