package ProblemSolving.problemsolvingweek2;

//Qe.java
/*This program allows the user to play "Rock,paper,scissors" against the computer*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Qe{
    int count = 1;
	JLabel displayLabel;
	JButton rockButton,paperButton,scissorsButton;

	public Qe() {
			 JFrame jFrameWindow = new JFrame("Rock, paper, scissors");			 			 
			 FlowLayout flowLayout = new FlowLayout();
		     jFrameWindow.setLayout(flowLayout);		     	     		 
			 jFrameWindow.setSize(300,100);
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
     		 displayLabel = new JLabel("Game " + count + " - the computer has made its choice");	 
 			 jFrameWindow.add(displayLabel);			 
 			 		 	 
 			 rockButton = new JButton("Rock");
 			 jFrameWindow.add(rockButton);
 			 
 			 paperButton = new JButton("Paper");
 			 jFrameWindow.add(paperButton);
 			 
 			 scissorsButton = new JButton("Scissors");
 			 jFrameWindow.add(scissorsButton);
 			 
			 ButtonEventHandler handler = new ButtonEventHandler();			 
 			 rockButton.addActionListener(handler);
 			 paperButton.addActionListener(handler);
 			 scissorsButton.addActionListener(handler);
 			 	 
			 jFrameWindow.setVisible(true);
	}
	
	public static void main(String args[]) {
			 Qe guiApp = new Qe();
	}
			 		
	private class ButtonEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
				int computerChoice = (int)(Math.random()*3 + 1);
				int userChoice;
				String winner;
				
				if(e.getSource()==rockButton)
					userChoice = 1;
				else if(e.getSource()==paperButton)
					userChoice = 2;
				else
					userChoice = 3;
					
				if(computerChoice==1 && userChoice==3 || computerChoice==2 && userChoice==1 || computerChoice==3 && userChoice==2)
					winner = "computer";
				else if(computerChoice==3 && userChoice==1 || computerChoice==1 && userChoice==2 || computerChoice==2 && userChoice==3)
					winner = "you";
				else
					winner = "neither player";
					
	            JOptionPane.showMessageDialog(null,winner + " won!","Result",JOptionPane.INFORMATION_MESSAGE);
	            
				count++;
		
				displayLabel.setText("Game " + count + " - the computer has made its choice");	
		}
	}
}






