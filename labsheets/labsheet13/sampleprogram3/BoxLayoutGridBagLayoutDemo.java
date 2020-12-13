package labsheet13.sampleprogram3;

//BoxLayoutGridBagLayoutDemo.java
/*This program uses box-layout and gridbag-layout managers in combination with a
number of panels to create a GUI designed to take in some employee details*/

import javax.swing.*;
import java.awt.*;

public class BoxLayoutGridBagLayoutDemo extends JFrame {

    private Insets normalInsets = new Insets(10, 10, 0, 10);
    private Insets topInsets = new Insets(30, 10, 0, 10);

    public BoxLayoutGridBagLayoutDemo()  {

        super("BoxLayoutGridBagLayout Demo");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(createTitlePanel());
        panel.add(createDetailsPanel());
        panel.add(Box.createVerticalStrut(40));
        panel.add(createSubmitPanel());
        panel.add(Box.createVerticalStrut(20));

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[]){
        BoxLayoutGridBagLayoutDemo  gui = new BoxLayoutGridBagLayoutDemo();
    }

    private JPanel createTitlePanel() {

        JPanel panel = new JPanel();

        JLabel titleLabel = new JLabel("Employee Details");
        titleLabel.setFont(new Font("serif",Font.PLAIN,20));

        panel.add(titleLabel);

        return panel;
    }

    private JPanel createDetailsPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        int gridy = 0;

        JLabel nameLabel = new JLabel("Name");
        addComponent(panel, nameLabel, 0, gridy, 1, 1, topInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JTextField nameField = new JTextField(25);
        addComponent(panel, nameField, 1, gridy++, 1, 1, topInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JLabel addressLabel = new JLabel("Address");
        addComponent(panel, addressLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JTextField addressField = new JTextField(25);
        addComponent(panel, addressField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JLabel dateOfBirthLabel = new JLabel("Date of Birth");
        addComponent(panel, dateOfBirthLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JTextField dateOfBirthField = new JTextField(25);
        addComponent(panel, dateOfBirthField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JLabel PPSNLabel = new JLabel("PPSN");
        addComponent(panel, PPSNLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JTextField PPSNField = new JTextField(25);
        addComponent(panel, PPSNField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        return panel;
    }

    private void addComponent(Container container, Component component,
                              int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
                              int anchor, int fill) {

        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy,
                gridwidth, gridheight, 0.0, 0.0, anchor, fill, insets, 0, 0);

        container.add(component, gbc);
    }

    private JPanel createSubmitPanel() {

        JPanel panel = new JPanel();

        JButton submitButton = new JButton("Add Employee");

        panel.add(submitButton);

        return panel;
    }
}
