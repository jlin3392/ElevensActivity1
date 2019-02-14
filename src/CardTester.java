/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String args[]){
        Card card1 = new Card("King", "spade", 13);
        Card card2 = new Card("Seven", "heart", 7);
        Card card3 = new Card("Four","club", 4);

        System.out.println("Does card 1 match card 2? " + card1.matches(card2));
        System.out.println(card1.rank());
        System.out.println(card1.suit());
        System.out.println(card1.pointValue());
    }
}
