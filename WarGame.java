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
   private Hand hand1;
   private Hand hand2;
   private ArrayList<Card> won = new ArrayList<Card>();
   boolean gameover = false;
   
   public WarGame()
   {
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
      /** play the game */
    //   while(hand1.isEmpty()==false&&hand2.isEmpty()==false&&gameover==false);
//       {
//          playRound();
//       }
            
   }
   /** the Round method controls the playing of a single round */
   public void playRound()
   {
      Card card1 = hand1.dealCard();
      Card card2 = hand2.dealCard();
      won.add(card1);
      won.add(card2);
      //if player 1 wins, add cards to their hand
      if (card1.getRank()>card2.getRank())
      {
         hand1.addToBottom(won);
      }
      //if player 2 wins, add cards to their hand
      if (card2.getRank()<card2.getRank())
      {
         hand2.addToBottom(won);
      }
      //if neither card is greater, proceed with a war.
      else
         war();
   }
   
   /** The war method handles the occurence of a war */
   public void war()
   {
      /** deal 2 cards from each deck */
      Card cp1 = hand1.dealCard();
      Card cp2 = hand1.dealCard();
      Card cc1 = hand2.dealCard();
      Card cc2 = hand2.dealCard();
      
      won.add(cp1); won.add(cp2); won.add(cc1); won.add(cc2);
      if (cp2.getRank()>cc2.getRank())
      {
         hand2.addToBottom(won);
      }
      
      if (cp2.getRank()<cc2.getRank())
      {
         hand1.addToBottom(won);
      }
      
      else
         war();
   }
   
   public Hand getHand1()
   {
      return hand1;
   }
   
   public Hand getHand2()
   {
      return hand2;
   }
   
}
      
      
   
   
   