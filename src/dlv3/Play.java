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
public class Play{
	public Player p1,p2;

	Play(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	void play() {
		while(this.p1.cards.size() > 0 && this.p2.cards.size() > 0) {
			Card c1 = this.p1.cards.remove();
			Card c2 = this.p1.cards.remove();
			System.out.println(p1.getName() +" throws : "+ c1);
			System.out.println(p2.getName() + " throw : "+ c2);
			if(c1.getValue().compareTo(c2.getValue()) < 0) {
				this.p2.score+=1;
			}
			if(c1.getValue().compareTo(c2.getValue()) > 0) {
				this.p1.score+=1;
			}
		}
		System.out.println();

		if(p1.score > p2.score) {
			System.out.println(p1.getName()+ " wins with " + (p1.score - p2.score) + " score");
		} else if(p1.score < p2.score) {
			System.out.println(p2.getName() +" wins with " + (p2.score - p1.score) + " score");
		} else {
			System.out.println("Match draw");
		}
	}
}