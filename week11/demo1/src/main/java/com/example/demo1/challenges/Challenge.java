package com.example.demo1.challenges;


import com.example.demo1.game.Player;
import com.example.demo1.utilities.*;

import java.util.Scanner;

public abstract class Challenge {
    public String question;
    public int points;
    protected Difficulty difficultyLevel;
    protected Player player;  // Add the Player reference

    public Challenge(String question, int points, Difficulty difficultyLevel) {
        this.question = question;
        this.points = points;
        this.difficultyLevel = difficultyLevel;
    }

    public abstract void askQuestion(Scanner scanner);

    public void setPlayer(Player player) {
        this.player = player;  // Set the current player for this challenge
    }

    public Player getPlayer() {
        return this.player;  // Get the current player
    }

    public int getPoints() {
        return points;
    }
}
