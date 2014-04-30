/* 
Brendan Hennessey
CS 110
This program contains the CardPile class
*/
import javax.swing.*;
import java.util.Random;

/** 
The CardPile defines functionality of a card pile for playing a game such as war 
*/

public class Deck
{
   final int SIZE = 52;
   public Card[] pile = new Card[SIZE];
   int ct;
   private final static String[] images = {"acec.jpg","2c.jpg","3c.jpg", "4c.jpg", "5c.jpg", "6c.jpg", "7c.jpg",
                                        "8c.jpg","9c.jpg", "10c.jpg","jackc.jpg","queenc.jpg","kingc.jpg","aced.jpg",
                                        "2d.jpg","3d.jpg","4d.jpg","5d.jpg","6d.jpg","7d.jpg","8d.jpg","9d.jpg",
                                        "10d.jpg","jackd.jpg","queend.jpg","kingd.jpg","aceh.jpg","2h.jpg","3h.jpg",
                                        "4h.jpg","5h.jpg","6h.jpg","7h.jpg","8h.jpg","9h.jpg","10h.jpg","jackh.jpg",
                                        "queenh.jpg","kingh.jpg","aces.jpg","2s.jpg","3s.jpg","4s.jpg","5s.jpg","6s.jpg",
                                        "7s.jpg","8s.jpg","9s.jpg","10s.jpg","jacks.jpg","queens.jpg","kings.jpg"};
   
   public Deck()
   {
      //counters for the ranks
      int num1=1;
      int num2=1;
      int num3=1;
      int num4=1;
      //add all of the clubs to the card array.
      for (int i=0; i<=12;i++)
      {
         ImageIcon im = new ImageIcon(images[i]);
         Card newClub = new Card(2,num1,im);
         pile[i] = newClub;
         num1++;
         ct++;
      }
      //add all of the diamonds to the card array
      for (int i=13; i<=25;i++)
      {
         ImageIcon im = new ImageIcon(images[i]);
         Card newDiamond = new Card(4,num2,im);
         pile[i] = newDiamond;
         num2++;
         ct++;
      }
      //add all of the hearts to the card array
      for (int i=26;i<=38;i++)
      {
         ImageIcon im = new ImageIcon(images[i]);
         Card newHeart = new Card(3,num3,im);
         pile[i] = newHeart;
         num3++;
         ct++;
      }
      //add all of the spades to the card array
      for (int i=39;i<=51;i++)
      {
         ImageIcon im = new ImageIcon(images[i]);
         Card newSpade = new Card(1,num4,im);
         pile[i] = newSpade;
         num4++;
         ct++;
      }
   }
   /** 
   The shuffle method shuffles the pile of cards
   */
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < ct; i++)
      {
         randNum = r.nextInt(ct);
         temp = pile[i];
         pile[i]=pile[randNum];
         pile[randNum]=temp;
      }
   }

}
      
      
      