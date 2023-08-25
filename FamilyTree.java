import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FamilyTree<E extends FamilyTreeItem> implements Iterable<E> {
    private ArrayList<E> family;
    private LocalDate birthDate;

    public FamilyTree() {
        this.family = new ArrayList<>();
    }

    public String getTree() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список семьи: \n");
        for (int i = 0; i < family.size(); i++) {
            stringBuilder.append(family.get(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void addHuman(E e) {
        family.add(e);
        if (e.getMather() != null) {
            e.getMather().addChild((Human) e);
        }
        if (e.getFather() != null) {
            e.getFather().addChild((Human) e);
        }
    }

    public void sortByName() {
        Collections.sort(family, new HumanIteratorByName<>());
    }

    public void sortByAge() {
        Collections.sort(family, new HumanIteratorByAge<>());
    }


    @Override
    public Iterator<E> iterator() {
        return new HumanIterator(family);
    }

    @Override
    public String toString() {
        return getTree();
    }

}
