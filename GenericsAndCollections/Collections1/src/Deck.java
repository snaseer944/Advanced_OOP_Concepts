import java.util.*;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {

        this.deck = new LinkedList<>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 2; j <= 10; j++) {
                deck.add(new Card<Integer, String>(j, suits[i]));
            }
            deck.add(new Card<String, String>("Ace", suits[i]));
            deck.add(new Card<String, String>("Jack", suits[i]));
            deck.add(new Card<String, String>("Queen", suits[i]));
            deck.add(new Card<String, String>("King", suits[i]));
            }

    }

    public Card dealCard(){
        int index = (int)(Math.random() * this.deck.size());
        Card c = this.deck.get(index);
        this.deck.remove(index);
        return c;
    }

    public int size(){

        return this.deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
       return new DeckIterator<>(this);
    }
}
