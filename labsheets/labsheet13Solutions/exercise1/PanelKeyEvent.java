package labsheet13Solutions.exercise1;

//PanelKeyEvent.java
/*This program shows how panels can be used with various layout managers to create
* a customised calculator GUI. It also handles some keyboard events. There are
* modifications to this version based on lab sheet 13 exercise 1*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PanelKeyEvent extends JFrame {

    private ArrayList<JButton> jbuttons;
    private String buttonNames[] = {"2ndF","DRG","FSE","TAB","OFF","ON","hyp","sin","cos","tan","nCr","CE"};
    JTextField textField;
    JPanel midPanel;

    public PanelKeyEvent() {
        super("Demonstrating JPanel");

        BorderLayout layout = new BorderLayout(2, 2);

        setLayout(layout);

        JPanel topPanel = new JPanel(new BorderLayout(2, 2));

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        topPanel.add(textField,BorderLayout.NORTH);

        midPanel = new JPanel(); //this will use a FlowLayout manager by default

        JButton leftButton = new JButton("Scientific");
        JButton middleButton = new JButton("Financial");
        JButton rightButton = new JButton("Standard");

        midPanel.add(leftButton);
        midPanel.add(middleButton);
        midPanel.add(rightButton);

        topPanel.add(midPanel,BorderLayout.SOUTH);

        JPanel bottomPanel = new JPanel(new GridLayout(6,6));

        jbuttons = new ArrayList<JButton>();


        for (int i = 0; i < 36; i++) {

            JButton jButton;

            if(i<12)
                jButton = new JButton(buttonNames[i]);
            else
                jButton = new JButton("?"); //got lazy entering button names :-)

            jbuttons.add(jButton);

            jButton.addActionListener(new ButtonEventHandler());

            bottomPanel.add(jButton);
        }

        add(topPanel,BorderLayout.NORTH);
        add(bottomPanel,BorderLayout.CENTER);


        textField.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode()==KeyEvent.VK_X) {
                    System.out.println("Exiting calculator application immediately ....");
                    System.exit(0);
                }
                else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    System.out.println("Moving JFrame window 20 pixels to the right ....");
                    Point currentLocation = PanelKeyEvent.this.getLocation();
                    PanelKeyEvent.this.setLocation((int)currentLocation.getX()+20,(int)currentLocation.getY());
                }
                else if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    System.out.println("Moving JFrame window 20 pixels to the left ....");
                    Point currentLocation = PanelKeyEvent.this.getLocation();
                    PanelKeyEvent.this.setLocation((int)currentLocation.getX()-20,(int)currentLocation.getY());
                }
            }

            public void keyReleased(KeyEvent e){

                if(e.getKeyChar()=='b') {
                    textField.setForeground(Color.BLUE);
                    textField.setFont(new Font("courier", Font.BOLD, 14));
                }
            }

            public void keyTyped(KeyEvent e){
                if(e.getKeyChar()=='F') {
                    for(JButton jbutton : jbuttons){
                        if(jbutton.getText().equals("TAB")){
                            jbutton.setForeground(Color.GREEN);
                            break;
                        }

                    }

                }
            }

        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }


    public static void main(String args[]) {
        PanelKeyEvent b = new PanelKeyEvent();
    }

    private class ButtonEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("OFF")) {
                textField.setText("");
            }
            else if (e.getActionCommand().equals("ON")){
                textField.requestFocus();
            }
            else if(e.getActionCommand().equals("sin"))
                System.out.println("Sin of " + textField.getText() + " degrees is " +
                                    Math.sin(Double.parseDouble(textField.getText())*2*Math.PI/360));
            else if(e.getActionCommand().equals("cos"))
                System.out.println("Cos of " + textField.getText() + " degrees is " +
                        Math.cos(Double.parseDouble(textField.getText())*2*Math.PI/360));
            else if(e.getActionCommand().equals("tan"))
                System.out.println("Tan of " + textField.getText() + " degrees is " +
                        Math.tan(Double.parseDouble(textField.getText())*2*Math.PI/360));
            else if(e.getActionCommand().equals("CE")){
                textField.setText("");
                textField.requestFocus();
            }
            else if(e.getActionCommand().equals("FSE")) {
                midPanel.removeAll();
                validate();
            }
        }
    }
}
