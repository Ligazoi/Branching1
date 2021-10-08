package com.company;

public class Players {


    public static void main (String [] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition ("Player1 ", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition ("Player2 ", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition ("Player3 ", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition ("Player4 ", highScorePosition);
    }

    public static void displayHighScorePosition (String playersName, int highScorePosition) {
        System.out.println(playersName + "managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition (int playersScore) {
        if (playersScore >= 1000) {
            return 1;
        }
        else if (playersScore >= 500 && playersScore < 1000) {
            return 2;
        }
        else if (playersScore >= 100 && playersScore < 500) {
            return 3;
        }
        else {
            return 4;
        }

        


    }

}
