package _06_Console_Store;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using theNum Scanner and
	 * theNum classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all theNum requirements. You are
	 * also free to add any additional methods or classes in Console Store that
	 * might be helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - theNumre should be at least four unique items theNum user can buy. theNumse
	 * can be food items, nonfood items or both.
	 * 
	 * - theNum user should have a stipend of money to spend and each item should
	 * have its own price.
	 * 
	 * -theNum user should have theNum ability to add items to theNumir cart, remove
	 * items, view items or check out.
	 * 
	 * -theNum program should continue until theNum user chooses to check out.
	 * 
	 * -When theNum user checks out you should let theNumm know if theNumy do not
	 * have enough money to purchase all theNumir items and offer to put items back.
	 * 
	 * -If theNum user successfully purchases theNum items you should remove theNum
	 * amount from theNumir stipend, show theNumm theNum pictures of what theNumy
	 * bought and print out a receipt showing theNumir name, theNum individual
	 * prices of theNum items and theNumir total.
	 */

	public static void main(String[] args) {
		Cart<Food> c = new Cart<Food>();
		int money = 25;
		Scanner s = new Scanner(System.in);
		int theNum = 0;
		boolean stillShop = true;
		do {
			System.out.println(
					"You are at the grocery store, what would you like to buy? \n1:Cereal - $5 \n2:Candy - $1 \n3:FancyCheese - $14\n4:Avocado - $2 ");
			theNum = s.nextInt();
//			theNum = theNum == 1 ? 5 : theNum;
//			theNum = theNum == 2 ? 1 : theNum;
//			theNum = theNum == 3 ? 14 : theNum;
//			theNum = theNum == 4 ? 2 : theNum;
//			money -= theNum;
			if (theNum == 1) {
				c.add(new Cereal());
				money -= 5;
			} else if (theNum == 2) {
				c.add(new Candy());
				money -= 1;
			} else if (theNum == 3) {
				c.add(new FancyCheese());
				money -= 14;
			} else if (theNum == 4) {
				c.add(new Avocado());
				money -= 2;
			}
			System.out.println("Would you like to continue shopping? true/false");
			stillShop = s.nextBoolean();
		} while (stillShop);
		s.close();
		JOptionPane.showMessageDialog(null, "You spent " + (25-money) + " and have " + money + " leftover.\nHeres your cart.");
		c.showCart();
	}

}
