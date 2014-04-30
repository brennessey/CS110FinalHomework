/*
Brendan Hennessey
CS 110
This file contaisn the Deck class which implements CardPile
*/
import javax.swing.*;
import java.util.ArrayList;

/** 
The deck card contains functionality for a deck used to play the game war 
*/
public class Hand 
{
   ArrayList<Card> hand;
   /**
   main constructor
   */
   public Hand(Card[] cards)
   {
      hand = new ArrayList<Card>();
      for(int i=0; i<cards.length;i++)
      {
         hand.add(cards[i]);
      }
   }
   /**
   The dealCard funtion deals a card 
   */      
   public Card dealCard()
   {
      Card c = hand.remove(0);  //  remove it (returns removed object)
         return c;
   }
   /** the isEmpty function lets determines if the hand is empty
   */
   public boolean isEmpty()
   {
      return (hand.size() == 0);
   }
   /**
   The addToBottom method adds the ArrayList of won cards to the end of the hand ArrayList
   */
   public void addToBottom(Card won)
   {
      hand.add(won);
   }
   /** the topCard method returns the Card that is at element 0 */
   public Card topCard()
   {
      return hand.get(0);
   }
   /** returns the number of elements */
   public int size()
   {
      return hand.size();
   }
         
   
}
   
      
      
      
   