import java.util.HashMap;
import java.util.Set;

public class Counter<E> {
    private HashMap<E, Integer> counts = new HashMap<>();

    public Counter(E[] things) {
        for (E element : things) {
            if (!counts.containsKey(element)) {
                counts.put(element, 1);
            } else
                counts.put(element, counts.get(element) + 1);

        }
    }

    public Integer getCount(E element){
        return counts.get(element);
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){
        Integer max = 0;
        E maxKey = null;

        for (E key : counts.keySet() ) {
            if (counts.get(key) > max) {
                max = counts.get(key);
                maxKey = key;
            }
        }

        return maxKey;
    }
}
