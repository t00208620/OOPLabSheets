package labsheet12.exercise1;

//BorderLayoutWindowEvent.java
/*This program uses a BorderLayout layout manager and window-events
to operate. It is based on exercise 1 from lab sheet 12*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayoutWindowEvent extends JFrame {

    private JTextArea textArea;

    public BorderLayoutWindowEvent() {
        super("Text Analyser");

        BorderLayout layout = new BorderLayout(3, 4);
        setLayout(layout);

        JLabel promptLabel = new JLabel("Please enter your text on the text-area below");

        add(promptLabel,BorderLayout.NORTH);

        textArea = new JTextArea();

        textArea.setForeground(Color.BLUE);
        textArea.setLineWrap(true);

        add(textArea,BorderLayout.CENTER);

        addWindowListener(new WindowEventHandler());

        setSize(400, 300);

        setVisible(true);
    }


    public static void main(String args[]) {
        BorderLayoutWindowEvent b = new BorderLayoutWindowEvent();
    }

    private class WindowEventHandler implements WindowListener {

        public void windowOpened(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Welcome to this nifty little GUI Application. It is"+
                                          " designed to take some user-supplied \ntext entered onto a text-area and" +
                                          " when the JFrame window is minimised, it will give\nsome statistical information" +
                                          " about the text entered. Then, when the window is \nunminimised, it will clear the" +
                                          " text-area for new input", "Program Information",
                                            JOptionPane.INFORMATION_MESSAGE);
        }

        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Thanks for using the program!", "Exiting Application",
                                            JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }

        //method only called when dispose() is called on the relevant window from elsewhere
        public void windowClosed(WindowEvent e) {

        }


        public void windowIconified(WindowEvent e) {

            String text = textArea.getText();
            char ch, nextCh=' ';

            int vowels=0, letters=0, digits=0, words=0, sentences=0, endingWithd=0;

            for(int i=0;i<text.length();i++) {
                ch = Character.toLowerCase(text.charAt(i));
                if(i<text.length()-1)
                    nextCh = Character.toLowerCase(text.charAt(i+1));

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    vowels++;

                if(Character.isLetter(ch))
                    letters++;
                else if(Character.isDigit(ch))
                    digits++;

                if(ch==' ')
                    words++;
                else if(ch=='.' || ch=='!' || ch=='?')
                    sentences++;

                if(ch=='d' && (nextCh==' ' || nextCh==',' || nextCh=='.' || nextCh=='!' || nextCh=='?'))
                    endingWithd++;
            }

            JOptionPane.showMessageDialog(null, "Statistical Information for Text Entered\n\n\n" +
                            "Total number of characters: " + text.length() +
                            "\nTotal number of vowels: " + vowels +
                            "\nTotal number of letters: " + letters +
                            "\nTotal number of digits: " + digits +
                            "\nTotal number of words: " + ++words +
                            "\nTotal number of sentences: " + sentences +
                            "\nTotal number of words ending with 'd': " + endingWithd, "Program Data",
                    JOptionPane.INFORMATION_MESSAGE);
        }


        public void windowDeiconified(WindowEvent e) {
            textArea.setText("");
        }


        public void windowActivated(WindowEvent e) {
        }


        public void windowDeactivated(WindowEvent e) {
        }
    }
}
