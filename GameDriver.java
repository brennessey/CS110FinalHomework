/* 
Brendan Hennessey
CS 110
This program contains the driver for the WarGame homework
*/
import javax.swing.*;
import java.awt.*; // for layout
import java.awt.event.*;

/** Drives the Game of War */
public class GameDriver
{ 
   public static void main(String[] args)
      {
         JFrame frame = new WarGUI();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.pack();
         frame.setVisible(true);//make visible
      }
}