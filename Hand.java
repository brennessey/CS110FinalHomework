/*
Brendan Hennessey
CS 110
This file contaisn the Deck class which implements CardPile
*/
import javax.swing.*;

/** 
The deck card contains functionality for a deck used to play the game war 
*/
public class Hand extends CardPile
{
   Card[] hand = new Card[26];
   int num;
   /**
   main constructor
   */
   public Hand()
   {
      super();
      pile.shuffle();
      for(i=0;i<(pile.length/2);i++)
      {
         deck[i]=pile[i];
      }
   }
   
   /**
   The dealCard funtion deals a card 
   */      
   public Card dealCard()
   {
      ct--;
      return pile[ct]
   }
   
   public void addToBottom(Card card)
   {
      for(int i=0; i,deck.length;i++)
      {
         deck[i+1]=deck[i];
      }
      deck[0]=card;
   }
}
   
      
      
      
   