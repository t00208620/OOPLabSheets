package labsheet13Solutions.exercise3;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class FloristGUI extends JFrame {

  JPanel panel;

  JLabel nameLabel = new JLabel("Name:"), phoneLabel = new JLabel("Phone:"),
         addressLabel = new JLabel("Address:");

  JTextField nameField = new JTextField(20), phoneField = new JTextField(10),
             addressField = new JTextField(20);

  JRadioButton small = new JRadioButton("Small"), medium = new JRadioButton("Medium"),
               large = new JRadioButton("Large"), romantic = new JRadioButton("Romantic"),
               funeral = new JRadioButton("Funeral"), birthday = new JRadioButton("Birthday");

  JCheckBox roses = new JCheckBox("Roses"), carnations = new JCheckBox("Carnations"),
            lilies = new JCheckBox("Lilies"), tulips = new JCheckBox("Tulips"),
            peonies = new JCheckBox("Peonies");

  JButton orderButton = new JButton("Order"), cancelButton = new JButton("Cancel");

  public FloristGUI() {
    super("Florist Application");

    panel = new JPanel();
    panel.setLayout(new GridBagLayout());

    addCustomerDetails();

    addSizeDetails();

    addOccasionDetails();

    addFlowerDetails();

    addButtonDetails();

    addMessageDetails();

    addItem(panel, (JComponent) Box.createVerticalStrut(20), 1, 7, 1, 1, GridBagConstraints.SOUTH);

    add(panel);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setVisible(true);
  }

  public static void main(String[] args) {
    new FloristGUI();
  }

  private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
    GridBagConstraints gc = new GridBagConstraints(x,y,width,height,0,0,align,GridBagConstraints.NONE,
            new Insets(5, 5, 5, 5),0,0);

    p.add(c, gc);
  }

  private void addCustomerDetails(){
    addItem(panel, nameLabel, 0, 0, 1, 1, GridBagConstraints.EAST);
    addItem(panel, phoneLabel, 0, 1, 1, 1, GridBagConstraints.EAST);
    addItem(panel, addressLabel, 0, 2, 1, 1, GridBagConstraints.EAST);
    addItem(panel, nameField, 1, 0, 2, 1, GridBagConstraints.WEST);
    addItem(panel, phoneField, 1, 1, 1, 1, GridBagConstraints.WEST);
    addItem(panel, addressField, 1, 2, 2, 1, GridBagConstraints.WEST);
  }

  private void addSizeDetails(){
    Box sizeBox = Box.createVerticalBox();

    ButtonGroup sizeGroup = new ButtonGroup();

    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    sizeBox.add(small);
    sizeBox.add(medium);
    sizeBox.add(large);
    sizeBox.setBorder(BorderFactory.createTitledBorder("Size"));

    addItem(panel, sizeBox, 0, 3, 1, 1, GridBagConstraints.NORTH);
  }

  private void addOccasionDetails(){
    Box occasionBox = Box.createVerticalBox();

    ButtonGroup occasionGroup = new ButtonGroup();

    occasionGroup.add(romantic);
    occasionGroup.add(birthday);
    occasionGroup.add(funeral);
    occasionBox.add(romantic);
    occasionBox.add(birthday);
    occasionBox.add(funeral);

    occasionBox.setBorder(BorderFactory.createTitledBorder("Occasion"));

    addItem(panel, occasionBox, 1, 3, 1, 1, GridBagConstraints.NORTH);

  }

  private void addFlowerDetails(){
    Box flowersBox = Box.createVerticalBox();

    flowersBox.add(roses);
    flowersBox.add(carnations);
    flowersBox.add(lilies);
    flowersBox.add(tulips);
    flowersBox.add(peonies);

    flowersBox.setBorder(BorderFactory.createTitledBorder("Flowers"));

    addItem(panel, flowersBox, 2, 3, 1, 1, GridBagConstraints.NORTH);
  }

  private void addButtonDetails(){
    Box buttonBox = Box.createHorizontalBox();

    buttonBox.add(orderButton);
    buttonBox.add(Box.createHorizontalStrut(20));
    buttonBox.add(cancelButton);

    addItem(panel, buttonBox, 1, 6, 1, 1, GridBagConstraints.SOUTH);
  }

  private void addMessageDetails(){
    Box messageBox = Box.createHorizontalBox();

    JTextArea message = new JTextArea(5,20);
    messageBox.add(message);

    Border messageBorder = null;

    //put the title of the border here "ABOVE_TOP" as it messed it up a little by leaving it at "TOP" (the default)
    //I believe the problem can be solved by using a "compound border" but I was too lazy to investigate :-)

    messageBorder=BorderFactory.createTitledBorder(messageBorder, "Message",TitledBorder.LEADING,
            TitledBorder.ABOVE_TOP);

    messageBox.setBorder(messageBorder);

    addItem(panel, messageBox, 1, 4, 1, 1, GridBagConstraints.NORTH);
  }
}