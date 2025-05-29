package com.example.demo1.challenges;

import com.example.demo1.SceneManager;
import com.example.demo1.utilities.Difficulty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Scanner;

import static com.example.demo1.SceneManager.gender;
import static com.example.demo1.SceneManager.primaryStage;

public class MathChallenge extends Challenge {
    private int solution;

    public MathChallenge(String question, int solution, int points, Difficulty difficultyLevel) {
        super(question, points, difficultyLevel);
        this.solution = solution;
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == solution;
    }

    public String getHint() {
        if (getPlayer().hasItem("Calculator")) {
            return "Hint: The answer is close to " + (solution + 2);
        }
        return null;
    }

    @Override
    public void askQuestion(Scanner scanner) {
        System.out.println("Riddle: " + question);
    }

}