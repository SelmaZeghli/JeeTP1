import java.util.ArrayList;

public class BiblioList extends Bibliotheque{

    private ArrayList<Object> ouvrages = new ArrayList<>();

    @Override
    boolean add(Object o) {
        return ouvrages.add(o);
    }

    @Override
    boolean remove(Object o) {
        return ouvrages.remove(o);
    }

    @Override
    Object get(int index) {
        return ouvrages.get(index);
    }

    @Override
    int size() {
        return ouvrages.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Nombre d'ouvrage : ").append(size()).append("\n");
        for (Object o : ouvrages){
            result.append(o.toString()).append("\n");
        }
        return result.toString();
    }
}
