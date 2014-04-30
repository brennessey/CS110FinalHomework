/*
Brendan Hennessey
CS 110
This program runs a simple game of war
*/

/** This program simulates the running of a simple game of war */ 
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class WarGame
{
   /**variables*/
   private Deck deck;
   private Card[] holder1 = new Card[26];
   private Card[] holder2 = new Card[26];
   private ArrayList<Card> warCards = new ArrayList<Card>();
   private Hand hand1;
   private Hand hand2;
   
   boolean gameover;
   /** main constructor */
   public WarGame()
   {
      gameover = false;
      deck = new Deck();
      /** shuffle the deck */
      deck.shuffle();
      /** split the deck into two hands */
      for (int i=0;i<(deck.SIZE/2);i++)
      {
         holder1[i]=deck.pile[i];
      }
      /** create hand */
      hand1 = new Hand(holder1);
      /** add the remaining cards to the other hand */
      for (int i=(deck.SIZE/2);i<deck.SIZE;i++)
      {
         int c = 0;
         holder2[c]=deck.pile[i];
         c++;
      }
      /** create other hand */
      hand2 = new Hand(holder2);
            
   }
   /** the Round method controls the playing of a single round */
   public void playRound()
   {
      if (hand1.size()==0||hand2.size()==0)
      {
         gameover = true;
      }
      Card card1 = hand1.dealCard();
      Card card2 = hand2.dealCard();
      //if player 1 wins, add cards to their hand
      if (card1.getRank()>card2.getRank())
      {
         hand1.addToBottom(card1);
         hand1.addToBottom(card2);
      }
      //if player 2 wins, add cards to their hand
      if (card2.getRank()<card2.getRank())
      {
         hand2.addToBottom(card1);
         hand2.addToBottom(card2);
      }
      //if neither card is greater, proceed with a war.
      else
         if (hand1.size()>2 && hand2.size()>2)
         {
            war();
         }
         else
            gameover=true;
   }
   
   /** The war method handles the occurence of a war */
   public void war()
   {
      /** deal 2 cards from each deck */
      Card cp1 = hand1.dealCard();
      Card cp2 = hand1.dealCard();
      Card cc1 = hand2.dealCard();
      Card cc2 = hand2.dealCard();
      
      // if the player wins, add the cards to the first deck.
      if (cp2.getRank()>cc2.getRank())
      {
         hand1.addToBottom(cp1);
         hand1.addToBottom(cp2);
         hand1.addToBottom(cc1);
         hand1.addToBottom(cc2);
         for (int i=0;i<warCards.size();i++)
         {
            hand1.addToBottom(warCards.get(i));
         }
         warCards.clear();//clear the holder 
      }
      //if the computer wins, add the cards to the second deck.
      if (cp2.getRank()<cc2.getRank())
      {
         //add all the cards to the bottom
         hand2.addToBottom(cp1);
         hand2.addToBottom(cp2);
         hand2.addToBottom(cc1);
         hand2.addToBottom(cc2);
         for (int i=0;i<warCards.size();i++)
         {
            hand2.addToBottom(warCards.get(i));
         }
         warCards.clear();//clear the holder

      }
      
      else
      {
         warCards.add(cp1);
         warCards.add(cp2);
         warCards.add(cc1);
         warCards.add(cc2);
         war();
      }
   }
   /** the getHand1 method returns the first hand */
   public Hand getHand1()
   {
      return hand1;
   }
   /** the getHand2 method returns the 2nd hand */
   public Hand getHand2()
   {
      return hand2;
   }
   /** the endGame method returns the value of the boolean gameover */
   public boolean endGame()
   {
      return gameover;
   }
   
   
   
}
      
      
   
   
   