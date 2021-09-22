package com.thbs.game;

import java.util.Random;

public class Dice {


    public int faceValue;

    public int roll(){
        faceValue = (int) (new Random().nextInt(5)+1);
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }


}

//Player
package com.thbs.game;

public class Player {
    Dice dice1;
    Dice dice2;

    public Player() {
        dice1 = new Dice();
        dice2 = new Dice();

    }

    public int play() {
        return (dice1.roll() + dice2.roll());
    }

    public int getD1Score() {
        return (dice1.getFaceValue());
    }

    public int getD2Score() {
        return (dice2.getFaceValue());
    }


}

//main
package com.thbs;

import com.thbs.game.Player;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Player player1 = new Player();
        Player player2 = new Player();

        player1.play();
        System.out.println("Player 1 scored " + (player1.getD1Score() + player1.getD2Score()));
        System.out.println("D1: " + player1.getD1Score());
        System.out.println("D2: " + player1.getD2Score());

        player2.play();
        System.out.println("Player 2 scored " + (player2.getD1Score() + player2.getD2Score()));
        System.out.println("D1: " + player2.getD1Score());
        System.out.println("D2: " + player2.getD2Score());

        if ((player2.getD1Score() + player2.getD2Score()) > (player1.getD1Score() + player1.getD2Score())) {
            System.out.println("Player 2 won the game");
        } else if ((player2.getD1Score() + player2.getD2Score()) == (player1.getD1Score() + player1.getD2Score())) {
            System.out.println("It was a draw");
        } else {
            System.out.println("Player 1 won the game");

        }

//        Player 1 scored 5
//        D1: 2
//        D2: 3
//        Player 2 scored 5
//        D1: 3
//        D2: 2
//        It was a draw
//
//        Process finished with exit code 0


    }
}

