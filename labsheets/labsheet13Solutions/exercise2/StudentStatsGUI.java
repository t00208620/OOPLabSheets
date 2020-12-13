package labsheet13Solutions.exercise2;

//StudentStatsGUI.java
/*This program uses radio-buttons and check-boxes to process the selections
of an arbitrary number of students and displays a number of facts based on 
the selections made*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class StudentStatsGUI extends JFrame {

	JRadioButton under18 = new JRadioButton("Under 18",true);
	JRadioButton _18to21 = new JRadioButton("18 - 21",false);
	JRadioButton over21 = new JRadioButton("Over 21",false);

	JCheckBox web = new JCheckBox("Web");
	JCheckBox programming = new JCheckBox("Programming");
	JCheckBox networks = new JCheckBox("Networks");
	JCheckBox databases = new JCheckBox("Databases");


	JLabel mostCommonAgeGroupLabel = new JLabel();

	JLabel likesProgrammingAndWebLabel = new JLabel();
	JLabel likesDatabasesAndNetworksLabel = new JLabel();
	JButton processResultsButton,submitButton;

	int under18Count=1, _18to21Count=0, over21Count=0, totalProcessed=0;
	int webCount=0,programmingCount=0,networksCount=0,databasesCount=0;
	int totalUnder18Count=0, total18to21Count=0, totalOver21Count=0;
	int totalProgrammingCount=0, totalWebCount=0, totalNetworksCount=0, totalDatabasesCount=0;


	public StudentStatsGUI() {
		super("The Student Statistics Application");

		setLayout(new GridLayout(5,1));

		JLabel question1Label = new JLabel("Select the age-group that you belong to: ");

		JLabel question2Label = new JLabel("Select any of the subjects you enjoy: ");
		JLabel resultsLabel = new JLabel("The results are as follows: ");

		submitButton = new JButton("Submit");
		processResultsButton = new JButton("Process Results");

		JPanel question1RadioButtonPanel = new JPanel(new GridLayout(4,1));

		JPanel question2CheckBoxPanel = new JPanel(new GridLayout(5,1));
		JPanel buttonPanel = new JPanel(new FlowLayout());
		JPanel resultsPanel = new JPanel(new GridLayout(4,1));

		question1RadioButtonPanel.add(question1Label);
		question1RadioButtonPanel.add(under18);
		question1RadioButtonPanel.add(_18to21);
		question1RadioButtonPanel.add(over21);


		buttonPanel.add(new JLabel());
		buttonPanel.add(submitButton);
		buttonPanel.add(processResultsButton);
		buttonPanel.add(new JLabel());

		ChoiceHandler handler = new ChoiceHandler();

		under18.addItemListener(handler);
		_18to21.addItemListener(handler);
		over21.addItemListener(handler);

		web.addItemListener(handler);
		programming.addItemListener(handler);
		networks.addItemListener(handler);
		databases.addItemListener(handler);

		ButtonGroup rbGroup1 = new ButtonGroup();

		rbGroup1.add(under18);
		rbGroup1.add(_18to21);
		rbGroup1.add(over21);


		question2CheckBoxPanel.add(question2Label);
		question2CheckBoxPanel.add(web);
		question2CheckBoxPanel.add(programming);
		question2CheckBoxPanel.add(networks);
		question2CheckBoxPanel.add(databases);

		resultsPanel.add(resultsLabel);
		resultsPanel.add(mostCommonAgeGroupLabel);
		resultsPanel.add(likesProgrammingAndWebLabel);
		resultsPanel.add(likesDatabasesAndNetworksLabel);

		add(question1RadioButtonPanel);

		add(question2CheckBoxPanel);
		add(buttonPanel);
		add(resultsPanel);

		setSize(500,500);

		submitButton.addActionListener(new ButtonListener());
		processResultsButton.addActionListener(new ButtonListener());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	public static void main(String args[])
	{
		StudentStatsGUI s = new StudentStatsGUI();
	}

	private class ChoiceHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e)
		{


			if(e.getSource()==under18)
				if(e.getStateChange() == ItemEvent.SELECTED)
					under18Count++;
				else
					under18Count--;
			else if(e.getSource()==_18to21)
				if(e.getStateChange() == ItemEvent.SELECTED)
					_18to21Count++;
				else
					_18to21Count--;
			else if(e.getSource()==over21)
				if(e.getStateChange() == ItemEvent.SELECTED)
					over21Count++;
				else
					over21Count--;


			if(e.getSource()==web)
				if(e.getStateChange() == ItemEvent.SELECTED)
					webCount++;
				else
					webCount--;

			if(e.getSource()==networks)
				if(e.getStateChange() == ItemEvent.SELECTED)
					networksCount++;
				else
					networksCount--;

			if(e.getSource()==databases)
				if(e.getStateChange() == ItemEvent.SELECTED)
					databasesCount++;
				else
					databasesCount--;

			if(e.getSource()==programming)
				if(e.getStateChange() == ItemEvent.SELECTED)
					programmingCount++;
				else
					programmingCount--;


            //some test code
			//System.out.println("<18: " + under18Count + "  18-21: " + _18to21Count + " >21: " + over21Count);
			//System.out.println("Prog: " + programmingCount + "  Web: " + webCount + " Database: " + databasesCount + "  Net: " + networksCount);

		}
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String mostCommonAgeGroup="";

			if(e.getSource()==submitButton)
			{

				totalUnder18Count+= under18Count;
				total18to21Count+=_18to21Count;
				totalOver21Count+=over21Count;

				totalProgrammingCount+=programmingCount;
				totalWebCount+=webCount;
				totalNetworksCount+=networksCount;
				totalDatabasesCount+=databasesCount;

				under18.setSelected(true);

				web.setSelected(false);
				networks.setSelected(false);
				programming.setSelected(false);
				databases.setSelected(false);

				totalProcessed++;
				JOptionPane.showMessageDialog(null,"Data submitted!","Data submitted",JOptionPane.INFORMATION_MESSAGE);
			}

			else if(e.getSource()==processResultsButton)
			{
				if(totalUnder18Count>=total18to21Count && totalUnder18Count>=totalOver21Count)
					mostCommonAgeGroup = " under 18";
				else if(total18to21Count>=totalUnder18Count && total18to21Count >=totalOver21Count)
					mostCommonAgeGroup = " 18 to 21";
				else
					mostCommonAgeGroup = " over 21";


				mostCommonAgeGroupLabel.setText("The most common age group was " + mostCommonAgeGroup);

				likesProgrammingAndWebLabel.setText("The % liking programming was " + ((float)totalProgrammingCount/totalProcessed)*100 + "     The % liking web was " + ((float)totalWebCount/totalProcessed*100));

				likesDatabasesAndNetworksLabel.setText("The % liking databases was " + ((float)totalDatabasesCount/totalProcessed)*100 + "      The % liking networks was " + ((float)totalNetworksCount/totalProcessed*100));

				under18Count=1; _18to21Count=0; over21Count=0; totalProcessed=0;
				totalUnder18Count=0; total18to21Count=0; totalOver21Count=0;
				totalProgrammingCount=0;totalWebCount=0;totalDatabasesCount=0;totalNetworksCount=0;

			}
		}
	}
}
  
  								
