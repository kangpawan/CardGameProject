/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlv3;
import java.util.Scanner;
/**
 *
 * @author kangp
 */
public class printCard {
   // Main Class For Program Execution
	public static void main(String[] args) {
		cardHand ch = new cardHand();
		ch.generateHand();
                Scanner input = new Scanner(System.in);
                System.out.println("Welcome to WAR card game!");
                System.out.println("Enter The Name Of First Player :");
                String n1 = input.next();
                System.out.println("Enter The Name Of Second Player:");
                String n2 = input.next();


		Player p1 = new Player(ch.cards_1,n1);
		Player p2 = new Player(ch.cards_2,n2);
	
		Play playground = new Play(p1,p2);
		playground.play();
	}
        public boolean chechName1(String n1){
            if (n1.length()>10) {
                return true;
            } 
            return false;
        }
         public boolean chechName2(String n2){
            if (n2.length()>10) {
                return true;
            } 
            return false;
        }
}
