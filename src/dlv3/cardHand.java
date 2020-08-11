/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlv3;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author kangp
 */
 
public class cardHand  {

	private final int handSize = 26;
	public ArrayList<Card> cards_1 = new ArrayList<>();
	public ArrayList<Card> cards_2 = new ArrayList<>();

	public void generateHand()
	{
		ArrayList<Card> cards = new ArrayList<>();
		for(Card.Suit s: Card.Suit.values())
		{
			for(Card.Value v: Card.Value.values())
			{
					cards.add(new Card(s,v));
			}
		}//end outter for

		Collections.shuffle(cards);

		for(int i=0;i<this.handSize;i++) {
			this.cards_1.add(cards.get(i));
		}

		for(int i=0;i<this.handSize;i++) {
			this.cards_2.add(cards.get(i));
		}
               
	}//end method
        public boolean run(int x){
         if(cards_1.size() == x && cards_2.size() == x){
                    return true;
                }
         else{
             return false;
         }
        }
}
