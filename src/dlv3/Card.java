/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlv3;

/**
 *
 * @author kangp
 */
// Base Class for Card Creation
public class Card {
	public enum Suit {HEARTS,CLUBS,SPADES,DIAMONDS};
	public enum Value {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, THIRTEEN};
	private final Suit suit;
	private final Value value;
	
	public Card(Suit s, Value gVal)
	{
			suit =s;
			value= gVal;
	}

	public Value getValue() {
		return this.value;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public String toString() {
		return suit.toString() + " " + value.toString();
	}
}
