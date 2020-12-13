package labsheet13.sampleprogram2;

//RadioButtonAndCheckBoxesExample.java
/*This program illustrates the use of radiobuttons
and checkboxes for use in a GUI. It also makes use of panels*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonAndCheckBoxes extends JFrame {
  
  private JTextField text1,text2;
  private JRadioButton plainrb, boldrb, italicrb, boldItalicrb;
  private JCheckBox boldcb, italiccb;

 	public RadioButtonAndCheckBoxes() {
		super("Demonstrating JRadioButtons and JCheckBoxes");

		JPanel radioButtonPanel = new JPanel();
		JPanel checkBoxPanel = new JPanel();

		text1 = new JTextField("The font style will change here with your selections");
		text2 = new JTextField("The font style will change here with your selections",30);

		text1.setEditable(false);
		text2.setEditable(false);

		plainrb = new JRadioButton("Plain",true);
		boldrb = new JRadioButton("Bold",false);
		italicrb = new JRadioButton("Italic",false);
		boldItalicrb = new JRadioButton("Bold/Italic",false);

		radioButtonPanel.add(plainrb);
		radioButtonPanel.add(boldrb);
		radioButtonPanel.add(italicrb);
		radioButtonPanel.add(boldItalicrb);

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());

		topPanel.add(text1,BorderLayout.NORTH);
		topPanel.add(radioButtonPanel,BorderLayout.SOUTH);

		ChoiceHandler handler = new ChoiceHandler();

		plainrb.addItemListener(handler);
		boldrb.addItemListener(handler);
		italicrb.addItemListener(handler);
		boldItalicrb.addItemListener(handler);

		ButtonGroup rbGroup = new ButtonGroup();

		rbGroup.add(plainrb);
		rbGroup.add(boldrb);
		rbGroup.add(italicrb);
		rbGroup.add(boldItalicrb);

		italiccb = new JCheckBox("Italic");
		boldcb = new JCheckBox("Bold");

		checkBoxPanel.add(text2);
		checkBoxPanel.add(italiccb);
		checkBoxPanel.add(boldcb);

		boldcb.addItemListener(handler);
		italiccb.addItemListener(handler);

		add(topPanel,BorderLayout.NORTH);
		add(checkBoxPanel,BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,200);
		setVisible(true);
	}


	public static void main(String args[]) {
		RadioButtonAndCheckBoxes b = new RadioButtonAndCheckBoxes();
	}

	private class ChoiceHandler implements ItemListener {
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;

		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == boldcb)
				if(e.getStateChange() == ItemEvent.SELECTED)
					valBold = Font.BOLD;
				else
					valBold = Font.PLAIN;

			if(e.getSource() == italiccb)
				if(e.getStateChange() == ItemEvent.SELECTED)
					valItalic = Font.ITALIC;
				else
					valItalic = Font.PLAIN;

			text2.setFont(new Font("TimesRoman",valBold + valItalic,14));

			if(e.getSource() == plainrb)
				text1.setFont(new Font("TimesRoman",Font.PLAIN,14));
			else if(e.getSource() == boldrb)
				text1.setFont(new Font("TimesRoman",Font.BOLD,14));
			else if(e.getSource() == italicrb)
				text1.setFont(new Font("TimesRoman",Font.ITALIC,14));
			else if(e.getSource() == boldItalicrb)
				text1.setFont(new Font("TimesRoman",Font.BOLD + Font.ITALIC,14));

			validate();
		}
	}
}
  
  								
