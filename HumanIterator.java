import java.util.Iterator;
import java.util.List;

public class HumanIterator<T> implements Iterator<T> {
    private int index;
    private List<T> family;

    public HumanIterator(List<T> family) {
        this.family = family;
    }

    @Override
    public boolean hasNext() {
        return family.size() > index;
    }

    @Override
    public T next() {
        return family.get(index++);
    }
}
