/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author Colin Teasdale, 991681017
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card tenDiamonds = new Card("Dmnds", 10);
        nineClubs.setSuit("Diamonds");
        
        System.out.println(tenDiamonds.getValue());
        System.out.println(tenDiamonds.getSuit());
        
        Card aceSpades = new Card ("Ace", 1);
        aceSpades.setSuit("Spades");
        System.out.println(aceSpades.getValue());
    }
}
