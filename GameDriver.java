import javax.swing.*;
import java.awt.*; // for layout
import java.awt.event.*;

public class GameDriver
{ 
   public static void main(String[] args)
      {
         JFrame frame = new WarGUI();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.pack();
         frame.setVisible(true);
      }
}