package labsheet2;

import javax.swing.JOptionPane;

public class RollTheDice {
    public static void main(String[] args) {

        int pWins = 0, cWins = 0, draws = 0, gamesPlayed = 0;
        char result;
        String choice;

        choice = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");

        while (choice.equals("no")) {
            JOptionPane.showMessageDialog(null, "Thanks for playing the game!");
            System.exit(0);
        }
         if (choice.equals("yes")) {

            result = rollTheDice();

            gamesPlayed++;

            if (result == 'c')
                cWins++;
            else if (result == 'p')
                pWins++;
            else
                draws++;


            JOptionPane.showMessageDialog(null, "Games Played:" + gamesPlayed + "" +
                    "\nComputer Wins:" + cWins + "" +
                    "\nPlayer Wins:" + pWins + "" +
                    "\nDraws:" + draws, "Game Info", JOptionPane.INFORMATION_MESSAGE);

            choice = JOptionPane.showInputDialog("Would you lie to play another game?(yes or no)");

        }
    }

        public static char rollTheDice()
        {
            int cRoll, pRoll;

            cRoll = (int) (Math.random() * 11) + 2;
            JOptionPane.showMessageDialog(null, "The computer generated the value " + cRoll + " " +
                    "\n....now hit return to see the player roll", "Computer Roll", JOptionPane.INFORMATION_MESSAGE);
            pRoll = (int) (Math.random() * 11) + 2;
            JOptionPane.showMessageDialog(null, "The player roll generated the value " + pRoll,
                    "Player Roll", JOptionPane.INFORMATION_MESSAGE);

            if (cRoll > pRoll)
                return 'c';
            else if (pRoll > cRoll)
                return 'p';
            else
                return 'd';

        }


    }


