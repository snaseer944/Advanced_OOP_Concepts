import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card c: d) {
            System.out.println(c);
        }

    }

    public static int addCards(ArrayList<Card> hand) {
        int res = 0;
        for (Card card : hand) {
            if (card.getValue() == "King"){
                res += 13;
            }
            else if (card.getValue() == "Queen"){
                res += 12;
            }
            else if (card.getValue() == "Jack"){
                res += 11;
            }
            else if (card.getValue() == "Ace"){
                res += 1;
            }
            else
                res += Integer.parseInt(card.getValue().toString());

        }
        return res;
    }

}