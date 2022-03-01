import java.util.Iterator;

public class DeckIterator<E> implements Iterator<E>{
    Deck d;
    public DeckIterator(Deck d){
      this.d = d;
    }

    @Override
    public boolean hasNext() {
       return this.d.size() > 0;
    }

    @Override
    public E next() {
        return (E)this.d.dealCard();
    }
}
