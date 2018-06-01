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
    
