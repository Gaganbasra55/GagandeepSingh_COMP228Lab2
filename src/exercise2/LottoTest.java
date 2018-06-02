package exercise2;

import javax.swing.*;
import java.security.SecureRandom;

public class LottoTest {
    private static SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {

        //Call lottoGame function
        lottoGame();
    }

    //Generate random number
    private static int generateNumber() {

        return 1 + randomNumbers.nextInt(9);
    }
    private static void lottoGame() {

        int selectedNumber;


        String runReport;
        int times = 0;
        JOptionPane.showMessageDialog(null, "Time to play Lotto", "Lotto Game", 1);

        selectedNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "enter a number between 3 to 27"));

        while (times < 5) {


            //Creating Lotto Object with random numbers
            Lotto l1 = new Lotto(generateNumber(), generateNumber(), generateNumber());
            //auxiliary array to display information
            int[] aux = l1.getArray();
            //Formatting String
            runReport = String.format("\n1st number = %d%n2nd number = %d%n3rd number = %d"
                                    + "\n\nThe number you entered is: %d%n"
                                    + "The sum of the numbers is: %d", aux[0], aux[1], aux[2], selectedNumber, l1.sum());

            //Showing the generated numbers
            JOptionPane.showMessageDialog(null, runReport, "Numbers generated", 1);

            //Win condition
            if (l1.sum() == selectedNumber) {
                JOptionPane.showMessageDialog(null, "You Won", "win", 1);
                break;
            } else
                times++;
        }
        //Lose condition
        if (times == 5)
            JOptionPane.showMessageDialog(null, "Computer Wins", "lose", 0);

    }

}

