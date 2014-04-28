/*
Brendan Hennessey
CS 110
This program runs a simple game of war
*/

// This program simulates the running of a simple game of war 

public class WarGame
{
   //variables
   private Deck deck;
   private Hand hand1 = new Hand();
   private Hand hand2 = new Hand();
   private ArrayList<Card> won = new ArrayList<Card>();
   
   public static void main(String[] args)
   {
      deck = new Deck();
      //shuffle the deck
      deck.shuffle();
      //split the deck into two hands
      for (int i=0;i<(deck.length/2);i++)
      {
         hand1.add(deck[i]);
      }
      //add the remaining cards to the other hand
      for (int i=(deck.length/2);i<deck.length;i++)
      {
         hand2.add(deck[i]);
      }
      //play the game
      while(hand1.size!=0&&hand2.size!=0&&gameover==false)
      {
         playRound();
      }
      
   }
   //the Round method controls the playing of a single round
   public void playRound()
   {
      Card card1 = hand1.dealCard();
      Card card2 = hand2.dealCard();
      won.add(card1,card2);
      //if player 1 wins, add cards to their hand
      if (card1.getRank>card2.getRank)
      {
         hand1.addToBottom(won);
      }
      //if player 2 wins, add cards to their hand
      if (card2.getRank<card2.getRank)
      {
         hand2.addToBottom(won);
      }
      //if neither card is greater, proceed with a war.
      else
         war();
   }
   //The war method handles the occurence of a war
   {
      
      
   
   
   