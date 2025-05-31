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
        answerField.setPromptText("Enter Answer");
        answerField.setLayoutX(400);
        answerField.setLayoutY(400);
        answerField.setPrefWidth(240);
        answerField.setPrefHeight(30);
        answerField.setStyle( "-fx-background-color: #546b50;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 16px;" );
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #667c17;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {Fhype();});

        Button submitBtn = new Button("Submit");
        submitBtn.setStyle(
                "-fx-background-color: #546b50;" +    // background color
                        "-fx-text-fill: white;" +              // text color (white)
                        "-fx-font-weight: bold;" +             // bold text
                        "-fx-font-size: 16px;"                 // increase font size (16 pixels)
        );
        submitBtn.setLayoutX(470); // adjust based on image
        submitBtn.setLayoutY(520); // adjust based on image
        submitBtn.setPrefSize(100,50);


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

        root.getChildren().addAll(qLabel, answerField, submitBtn,backButton);
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
        answerField.setPromptText("Enter Answer");
        answerField.setLayoutX(410);
        answerField.setLayoutY(340);
          answerField.setPrefWidth(240);
         answerField.setPrefHeight(60);
        answerField.setStyle("-fx-background-color: transparent;");

        Button SubmitBtn = new Button("Submit");
        SubmitBtn.setStyle(
                "-fx-background-color: #676658;" +    // background color
                        "-fx-text-fill: white;" +              // text color (white)
                        "-fx-font-weight: bold;" +             // bold text
                        "-fx-font-size: 16px;"                 // increase font size (16 pixels)
        );
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #4d230a;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
            Shype();
        });
        SubmitBtn.setLayoutX(450); // adjust based on image
        SubmitBtn.setLayoutY(520); // adjust based on image
        SubmitBtn.setPrefSize(100, 50);   //cave location button
        SubmitBtn.setOnAction(e -> {
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

        root.getChildren().addAll(qLabel, answerField, SubmitBtn,backButton);
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
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #577283;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
          Thype();
        });

        Button SubmitBtn = new Button("Submit");
        SubmitBtn.setStyle(
                "-fx-background-color: #82939d;" +    // background color
                        "-fx-text-fill: white;" +              // text color (white)
                        "-fx-font-weight: bold;" +             // bold text
                        "-fx-font-size: 16px;"                 // increase font size (16 pixels)
        );
        SubmitBtn.setLayoutX(450); // adjust based on image
        SubmitBtn.setLayoutY(520); // adjust based on image
        SubmitBtn.setPrefSize(100,50);


        SubmitBtn.setOnAction(e -> {
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

        root.getChildren().addAll(qLabel, answerField, SubmitBtn,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Challenge 3");
        primaryStage.show();
    }
}