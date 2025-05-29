package com.example.demo1.utilities;

import com.example.demo1.challenges.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import com.example.demo1.SceneManager;
import com.example.demo1.SceneManager.*;

import static com.example.demo1.SceneManager.*;

public class ChallengeGUI {


    public static void displayFirstlocation(Challenge challenge, Runnable onComplete) {
        BackgroundImage backgroundImage;
        if(gender){
            Image bgImage = new Image(SceneManager.class.getResource("/images/8.1 Riddle guy.jpg").toExternalForm());
            backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );
        }
        else {
        Image bgImage = new Image(SceneManager.class.getResource("/images/8.2 Riddle girl.jpg").toExternalForm());
            backgroundImage= new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );
        }



        Pane root = new Pane();

        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        Label qLabel = new Label(challenge.question);
        TextField answerField = new TextField();
        answerField.setLayoutX(450);
        answerField.setLayoutY(510);
        answerField.setPromptText("Your answer");
        Button submitBtn = new Button("Submit");
        submitBtn.setLayoutX(575);
        submitBtn.setLayoutY(510);


        submitBtn.setOnAction(e -> {
            int earned = 0;
            if (challenge instanceof RiddleChallenge rc) {
                if (rc.checkAnswer(answerField.getText())) earned = rc.getPoints();
            } else if (challenge instanceof MathChallenge mc) {
                try {
                    int ans = Integer.parseInt(answerField.getText());
                    if (mc.checkAnswer(ans)) earned = mc.getPoints();
                } catch (NumberFormatException ignored) {}
            } else if (challenge instanceof MiniGameChallenge mgc ) {


                return;
            }

            challenge.points = earned;
            onComplete.run();
            startSchallange();
        });

        root.getChildren().addAll(qLabel, answerField, submitBtn);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Challenge 1");
        primaryStage.show();
    }
    public static void displaySecondlocation(Challenge challenge, Runnable onComplete) {
        BackgroundImage backgroundImage;
        if(gender){
            Image bgImage = new Image(SceneManager.class.getResource("/images/cave game male.jpg").toExternalForm());
           backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );
        }
        else {
            Image bgImage = new Image(SceneManager.class.getResource("/images/cave games female.jpg").toExternalForm());
            backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );

        }


        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        Label qLabel = new Label(challenge.question);
        TextField answerField = new TextField();
        answerField.setLayoutX(410);
        answerField.setLayoutY(360);
        answerField.setPrefSize(200,40);
        answerField.setStyle("-fx-background-color: transparent");
        answerField.setPromptText("Your answer");
        Button submitBtn = new Button("Submit");
        submitBtn.setLayoutX(475);
        submitBtn.setLayoutY(425);


        submitBtn.setOnAction(e -> {
            int earned = 0;
            if (challenge instanceof RiddleChallenge rc) {
                if (rc.checkAnswer(answerField.getText())) earned = rc.getPoints();
            } else if (challenge instanceof MathChallenge mc) {

                try {
                    int ans = Integer.parseInt(answerField.getText());
                    if (mc.checkAnswer(ans)) earned = mc.getPoints();
                } catch (NumberFormatException ignored) {}

            } else if (challenge instanceof MiniGameChallenge mgc ) {

                return;
            }

            challenge.points = earned;
            onComplete.run();
            SceneManager.play();
        });

        root.getChildren().addAll(qLabel, answerField, submitBtn);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Challenge 2");
        primaryStage.show();
    }


    public static void displayThirdlocation(Challenge challenge, Runnable onComplete) {
        BackgroundImage backgroundImage;
        if(gender){
            Image bgImage = new Image(SceneManager.class.getResource("/images/castle game male.jpg").toExternalForm());
             backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );
        }
        else{
            Image bgImage = new Image(SceneManager.class.getResource("/images/castle game female.jpg").toExternalForm());
            backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );
        }



        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        Label qLabel = new Label(challenge.question);
        TextField answerField = new TextField();
        answerField.setLayoutX(410);
        answerField.setLayoutY(360);
        answerField.setPrefSize(200,40);
        answerField.setStyle("-fx-background-color: transparent");
        answerField.setPromptText("Your answer");
        Button submitBtn = new Button("Submit");
        submitBtn.setLayoutX(475);
        submitBtn.setLayoutY(425);git


        submitBtn.setOnAction(e -> {
            int earned = 0;
            if (challenge instanceof RiddleChallenge rc) {
                if (rc.checkAnswer(answerField.getText())) earned = rc.getPoints();
            } else if (challenge instanceof MathChallenge mc) {
                try {
                    int ans = Integer.parseInt(answerField.getText());
                    if (mc.checkAnswer(ans)) earned = mc.getPoints();
                } catch (NumberFormatException ignored) {}

            } else if (challenge instanceof MiniGameChallenge mgc ) {
                showGameOver();
                return;
            }

            challenge.points = earned;
            onComplete.run();
        });

        root.getChildren().addAll(qLabel, answerField, submitBtn);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Challenge 3");
        primaryStage.show();
    }
}