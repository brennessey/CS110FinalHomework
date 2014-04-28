/**
Brendan Hennessey
CS 110
This is a class that represents a single playing card from a standard deck of 52 cards.
*/
import java.awt.*;
import javax.swing.*;

public class Card
{
   /** class constants */
   public final static int SPADES=1;
   public final static int CLUBS=2;
   public final static int HEARTS=3;
   public final static int DIAMONDS=4;
   public final static int ACE=1;
   public final static int KING=13;
   public final static int QUEEN=12;
   public final static int JACK=11;
   private int rank;
   private int suit;
   private ImageIcon image;
   private ImageIcon back;
   /** 
   The constructor takes a suit and a rank to make a card.
   */
   public Card(int suit, int rank, ImageIcon image)
   {
      this.suit = suit;//assign the suit given to the class suit variable
      this.rank = rank;//assign the rank given to the class rank variable
      this.image = image;//assign the image to the given image
      back = new ImageIcon("back.jpg");
   }
   /** 
   the getSuit method returns the suit of the card as it's integer form
   */
   public int getSuit()
   {
      return suit;
   }
   /** 
   the getRank function returns the rank of the card
   */
   public int getRank()
   {
      return rank;
   }
   /**
   The getImage function returns the image of the card
   */
   public ImageIcon getImage()
   {
      return image;
   }
   /** 
   the toString function returns a description of the card as a string 
   */
   public String toString()
   {
      String suitName;
      String rankName;
      switch (suit) //to change suit to a string
      {
         case 1: 
            suitName = "Spades";
            break;
         case 2:
            suitName = "Clubs";
            break;
         case 3:
            suitName = "Hearts";
            break;
         case 4:
            suitName = "Diamonds";
            break;
         default:
            suitName = " ";
      }
      switch (rank) //to change rank to a string
      {
         case 1:
            rankName = "Ace";
            break;
         case 11:
            rankName = "Jack";
            break;
         case 12:
            rankName = "Queen";
            break;
         case 13:
            rankName = "King";
            break;
         case 2:
            rankName = "2";
            break;
         case 3:
            rankName = "3";
            break;
         case 4:
            rankName = "4";
            break;
         case 5:
            rankName = "5";
            break;
         case 6:
            rankName = "6";
            break;
         case 7:
            rankName = "7";
            break;
         case 8:
            rankName = "8";
            break;
         case 9:
            rankName = "9";
            break;
         case 10:
            rankName = "10";
            break;
         default:
            rankName = " ";
            
      }
      String str = rankName+" of "+suitName;
      return str; //return
   }
   /** 
   the equals method determines whether the ranks are equal between 2 Card objects.
   */
   public boolean equals(Card card)
   {
      if (this.rank == card.getRank())
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
}
