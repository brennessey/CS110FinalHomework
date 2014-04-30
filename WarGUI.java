/*
Brendan Hennessey
CS 110
This containts the MyFrame class, a GUI for War
*/
import javax.swing.*;
import java.awt.*; // for layout
import java.awt.event.*; // for event handling

/** The WarGUI class creates a GUI to play the game war */
public class WarGUI extends JFrame 
{
   private WarGame game;
   private JButton rButton;
   private ImageIcon front,back;
   private JLabel cardback, cardback2;
   private JLabel winner;
   private JLabel title1, title2, cards1, cards2;
   private JPanel computerPanel, userPanel, gamePanelComp, u2,c2;
   
   public WarGUI()
   {
      game = new WarGame();
      //set layout
      setLayout(new GridLayout(3,3));
      //fill top panel text
      setTitle("The Game of WAR!");
      // title=new JLabel("Brendan's game of WAR!");
      computerPanel=new JPanel(new BorderLayout());
      title1 = new JLabel("Computer");
      cards1 = new JLabel("Computer Deck size: "+game.getHand1().size());
      back = new ImageIcon("back.jpg");
      cardback = new JLabel(back);
      computerPanel.add(cardback,BorderLayout.EAST);

      computerPanel.add(cards1,BorderLayout.CENTER);
      computerPanel.add(title1,BorderLayout.NORTH);
      
      //configure the user's deck panel
      userPanel = new JPanel(new BorderLayout());
      title2 = new JLabel ("User");
      cards2 = new JLabel ("User Deck size: "+game.getHand2().size());
      cardback2 = new JLabel(back);
      userPanel.add(cardback2, BorderLayout.EAST);
      userPanel.add(title2, BorderLayout.NORTH);
      userPanel.add(cards2, BorderLayout.CENTER);
      
          
      
      add(computerPanel);
      add(userPanel);
   }

   


  }



      
      
      
   