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
   //variables
   private WarGame game;
   private JButton rButton;
   private ImageIcon frontc,frontu, back;
   private JLabel cardback, cardback2;
   private JLabel frontOfCardC, frontOfCardU;
   private JLabel title1, title2, cards1, cards2, message;
   private JPanel computerPanel, userPanel, gamePanelComp, u2,c2, buttonPanel,messagePanel;
   /** main constructor */
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
      cards1 = new JLabel("Computer Deck size: "+game.getHand2().size());
      back = new ImageIcon("back.jpg");
      cardback = new JLabel(back);
      computerPanel.add(cardback,BorderLayout.EAST);
      computerPanel.add(cards1,BorderLayout.CENTER);
      computerPanel.add(title1,BorderLayout.NORTH);
      
      //configure the user's deck panel
      userPanel = new JPanel(new BorderLayout());
      title2 = new JLabel ("User");
      cards2 = new JLabel ("User Deck size: "+game.getHand1().size());
      cardback2 = new JLabel(back);
      userPanel.add(cardback2, BorderLayout.EAST);
      userPanel.add(title2, BorderLayout.NORTH);
      userPanel.add(cards2, BorderLayout.CENTER);
      
      //configure card display panel for comp
      c2 = new JPanel(new BorderLayout());
      frontOfCardC = new JLabel();
      c2.add(frontOfCardC, BorderLayout.EAST);
      
      //configure card display panel for user
      u2 = new JPanel(new BorderLayout());
      frontOfCardU = new JLabel();
      u2.add(frontOfCardU, BorderLayout.EAST);
      
      //configure panel for the button
      buttonPanel = new JPanel();
      rButton = new JButton("Go!");
      rButton.addActionListener(new ButtonListener());
      buttonPanel.add(rButton);
      
      //message frame
      messagePanel = new JPanel(new BorderLayout());
      message=new JLabel();
      messagePanel.add(message);
      
      
          
      //add panels
      add(computerPanel);
      add(userPanel);
      add(c2);
      add(u2);
      add(buttonPanel);
      add(messagePanel);
   }

   
   /** The ButtonListener clas determines what happens when the button is pushed */
   public class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (!game.endGame())
         {
            //set images
            frontc = game.getHand2().topCard().getImage();
            frontOfCardC.setIcon(frontc);
            frontu = game.getHand1().topCard().getImage();
            frontOfCardU.setIcon(frontu);
            //play the round
            game.playRound();
            //update the deck counts
            cards1.setText("Computer Deck size: "+game.getHand2().size());
            cards2.setText("User Deck size: "+game.getHand1().size());
         }
         else
            message.setText("Game Over!");
      }
   }
}



      
      
      
   