package com.example.demo1;


import com.example.demo1.game.Location;
import com.example.demo1.utilities.ChallengeGUI;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import com.example.demo1.utilities.Difficulty;
import com.example.demo1.game.*;
import com.example.demo1.challenges.*;

import java.util.Objects;

import static com.example.demo1.utilities.ChallengeGUI.displayFirstlocation;
import static com.example.demo1.utilities.ChallengeGUI.displayThirdlocation;
import static javax.swing.text.html.HTML.Tag.U;

public class SceneManager {
    public static Stage primaryStage;
    private static Player player;
    private static Map gameMap;
    private static Location currentLocation;
    public static Difficulty difficulty;
    private static int count=0;
    private static final DropShadow glowEffect = new DropShadow(20, Color.CYAN);
    public static boolean gender;
    private int points;

    public static void init(Stage stage) {
        SoundPlayer.play("/music/music.wav",true);
        primaryStage = stage;
    }
    public static void play() {
        BackgroundImage backgroundImage;
        if (gender){
            Image bgImage = new Image(SceneManager.class.getResource("/images/save princess.jpg").toExternalForm());
            backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );

        }
        else {
            Image bgImage = new Image(SceneManager.class.getResource("/images/save prince.jpg").toExternalForm());
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


        Button doneBtn = new Button("");
        doneBtn.setLayoutX(250);
        doneBtn.setLayoutY(250);
        doneBtn.setPrefSize(300,400);
        doneBtn.setStyle("-fx-background-color: transparent;");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #577283;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
            ChallengeGUI.displaySecondlocation(currentLocation.getChallenge(), () -> {
                player.increaseScore(currentLocation.getChallenge().getPoints());});
        });

        doneBtn.setOnAction(e -> {
            startTchallange();
        });

        root.getChildren().addAll(doneBtn,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    public static void showMainMenu() {
        // Load the background image from resources
        Image bgImage = new Image(SceneManager.class.getResource("/images/start page.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );


        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Transparent button over "START" area in the image (adjust position as needed)
        Button startButton = new Button();
        startButton.setLayoutX(330); // X-position of "START" button in the image
        startButton.setLayoutY(480); // Y-position of "START" button in the image
        startButton.setPrefSize(160, 50); // Width and height matching image "START" button
        startButton.setStyle("-fx-background-color: transparent");

        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {primaryStage.close();});

        startButton.setOnAction(e -> showCharacterAndDifficultyScene());

        // Add the invisible button to the Pane
        root.getChildren().addAll(backButton,startButton);

        // Create scene and show
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Adventure Game - Main Menu");
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    private static void showCharacterAndDifficultyScene() {
        // Load background image for character/difficulty screen
        Image bgImage = new Image(SceneManager.class.getResource("/images/fchoice.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );

        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button continueBtn = new Button();
        continueBtn.setLayoutX(305); // adjust based on image
        continueBtn.setLayoutY(340); // adjust based on image
        continueBtn.setPrefSize(200, 50);
        continueBtn.setStyle("-fx-background-color: transparent;");

        Button DifficultBtn = new Button();
        DifficultBtn.setLayoutX(305); // adjust based on image
        DifficultBtn.setLayoutY(240); // adjust based on image
        DifficultBtn.setPrefSize(200, 50);
        DifficultBtn.setStyle("-fx-background-color: transparent;");

        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {showMainMenu();});

        DifficultBtn.setOnAction(e -> {      //lemda equation
            showDifficultyfirst();
        });
        continueBtn.setOnAction(e -> {      //lemda equation
            showCharacterfirst();
        });


        // Add all components
        root.getChildren().addAll(DifficultBtn,  continueBtn,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    private static void setupGame() {
        player.addItem("Calculator");
        player.addItem("Lucky Coin");
        RiddleChallenge riddle;
        MathChallenge math;
        MiniGameChallenge miniGame;

        if(difficulty==difficulty.EASY){
            riddle = new RiddleChallenge("What has head , tail but no body?", "coin", 10, difficulty);
        }
        else if (difficulty==difficulty.MEDIUM) {
            riddle = new RiddleChallenge("The more you take, the more you leave behind. What am I?", "footsteps", 10, difficulty);
        }
        else {
            riddle = new RiddleChallenge("I have cities, but no houses.\n" +
                    "I have mountains, but no trees.\n" +
                    "I have water, but no fish.\n" +
                    "what am I?", "map", 10, difficulty);
        }
        if(difficulty==difficulty.EASY){
            math = new MathChallenge("5 + 3 * 2", 11, 15, difficulty);
        } else if (difficulty==difficulty.MEDIUM) {
            math = new MathChallenge("(18 ÷ 3) + 5 × 2", 16, 15, difficulty);
        }
        else {
            math = new MathChallenge("36 ÷ (3 × 2) + 5 - 4", 7, 15, difficulty);
        }
        if(difficulty==difficulty.EASY){
            miniGame = new MiniGameChallenge("Guess Number", 20, difficulty);

        } else if (difficulty==difficulty.MEDIUM) {
            miniGame = new MiniGameChallenge("Guess Number", 20, difficulty);

        }
        else {
            miniGame = new MiniGameChallenge("Guess Number", 20, difficulty);

        }


        riddle.setPlayer(player);
        math.setPlayer(player);
        miniGame.setPlayer(player);

        Location loc1 = new Location("Forest", "A dark and spooky forest.", riddle);
        Location loc2 = new Location("Cave", "A hidden cave with mysterious symbols.", math);
        Location loc3 = new Location("Castle", "An ancient castle with secrets.", miniGame);

        gameMap = new Map();
        gameMap.addLocation(loc1);
        gameMap.addLocation(loc2);
        gameMap.addLocation(loc3);
        Location current=gameMap.getCurrentLocation();
    }



    public static void showNextLocation() {
        if (!gameMap.hasNextLocation()) {
            showGameOver();
            return;
        }if (count==0){
            currentLocation = gameMap.getCurrentLocation();
        }
        else {
            currentLocation = gameMap.getNextLocation();
        }
        count++;

    }
    private static void startFchallange(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/entered forest.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );



        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button doChallenge = new Button("");
        doChallenge.setLayoutX(435); // adjust based on imag
        doChallenge.setLayoutY(404); // adjust based on image
        doChallenge.setPrefSize(230, 20);
        doChallenge.setStyle("-fx-background-color:transparent;");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #667c17;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {Entername();});

        doChallenge.setOnAction(e -> {
            Fhype();
        });
        root.getChildren().addAll(doChallenge,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));
    }
    public static void startSchallange(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/cave enter.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );

        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button doChallenge = new Button("");
        doChallenge.setLayoutX(435); // adjust based on imag
        doChallenge.setLayoutY(404); // adjust based on image
        doChallenge.setPrefSize(220, 20);
        doChallenge.setStyle("-fx-background-color: transparent;");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #4d230a;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
            ChallengeGUI.displayFirstlocation(currentLocation.getChallenge(), () -> {
                player.increaseScore(currentLocation.getChallenge().getPoints());});
        });

        doChallenge.setOnAction(e -> {
            Shype();
        });
        root.getChildren().addAll(doChallenge,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));
    }

    public static void Shype() {
        Image bgImage = new Image(SceneManager.class.getResource("/images/cave description.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );



        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label

        Button doChallenge = new Button();
        doChallenge.setLayoutX(585); // adjust based on imag
        doChallenge.setLayoutY(575); // adjust based on image
        doChallenge.setPrefSize(220, 20);
        doChallenge.setStyle("-fx-background-color: transparent");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #4d230a;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
          startSchallange();
        });
        doChallenge.setOnAction(e -> {
            ChallengeGUI.displaySecondlocation(currentLocation.getChallenge(), () -> {
                player.increaseScore(currentLocation.getChallenge().getPoints());
                showNextLocation();


            });
        });
        root.getChildren().addAll(doChallenge,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));
    }


    public static void Fhype(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/forest description.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );



        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button doChallenge = new Button();
        doChallenge.setLayoutX(585); // adjust based on imag
        doChallenge.setLayoutY(575); // adjust based on image
        doChallenge.setPrefSize(220, 20);
        doChallenge.setStyle("-fx-background-color: transparent");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #667c17;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {startFchallange();});


        doChallenge.setOnAction(e -> {
            ChallengeGUI.displayFirstlocation(currentLocation.getChallenge(), () -> {
                player.increaseScore(currentLocation.getChallenge().getPoints());
                showNextLocation();

            });
        });
        root.getChildren().addAll(doChallenge,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));
    }
    public static void startTchallange(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/entered castle.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );

        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button doChallenge = new Button(" ");
        doChallenge.setLayoutX(435); // adjust based on imag
        doChallenge.setLayoutY(404); // adjust based on image
        doChallenge.setPrefSize(230, 20);
        doChallenge.setStyle("-fx-background-color: transparent");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #577283;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
            ChallengeGUI.displaySecondlocation(currentLocation.getChallenge(), () -> {
                player.increaseScore(currentLocation.getChallenge().getPoints());});
        });

        doChallenge.setOnAction(e -> {
            Thype();
        });
        root.getChildren().addAll(doChallenge,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));
    }
    public static void Thype() {
        Image bgImage = new Image(SceneManager.class.getResource("/images/castle description.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );



        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button doChallenge = new Button();
        doChallenge.setLayoutX(585); // adjust based on imag
        doChallenge.setLayoutY(575); // adjust based on image
        doChallenge.setPrefSize(220, 20);
        doChallenge.setStyle("-fx-background-color: transparent");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #577283;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
            startTchallange();
        });

        doChallenge.setOnAction(e -> {
            ChallengeGUI.displayThirdlocation(currentLocation.getChallenge(), () -> {
                player.increaseScore(currentLocation.getChallenge().getPoints());
                showNextLocation();


            });
        });
        root.getChildren().addAll(doChallenge,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));
    }

    public static void showGameOver() {
        Image bgImage = new Image(SceneManager.class.getResource("/images/game over.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );



        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #977b3b;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {
            ChallengeGUI.displayThirdlocation(currentLocation.getChallenge(), () -> {
                player.increaseScore(currentLocation.getChallenge().getPoints());});
        });

        // Continue Button over image's "Continue" label
        Button exitBtn = new Button("Submit");
        exitBtn.setStyle(
                "-fx-background-color: #977b3b;" +    // background color
                        "-fx-text-fill: white;" +              // text color (white)
                        "-fx-font-weight: bold;" +             // bold text
                        "-fx-font-size: 16px;"                 // increase font size (16 pixels)
        );
        exitBtn.setLayoutX(350); // adjust based on image
        exitBtn.setLayoutY(450); // adjust based on image
        exitBtn.setPrefSize(100, 50);



        exitBtn.setOnAction(e -> primaryStage.close());
        root.getChildren().addAll( exitBtn,backButton);
        primaryStage.setScene(new Scene(root, 800, 600));



    }
    private static void showDifficultysecond(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/difficulty.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );

        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button easyBtn = new Button();
        easyBtn.setLayoutX(305); // adjust based on image
        easyBtn.setLayoutY(205); // adjust based on image
        easyBtn.setPrefSize(200, 60);
        easyBtn.setStyle("-fx-background-color: transparent;");

        Button mediumBtn = new Button();
        mediumBtn.setLayoutX(305); // adjust based on image
        mediumBtn.setLayoutY(300); // adjust based on image
        mediumBtn.setPrefSize(200, 60);
        mediumBtn.setStyle("-fx-background-color: transparent;");

        Button hardtBtn = new Button();
        hardtBtn.setLayoutX(305); // adjust based on image
        hardtBtn.setLayoutY(385); // adjust based on image
        hardtBtn.setPrefSize(200, 60);
        hardtBtn.setStyle("-fx-background-color: transparent;");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {showCharacterfirst();});

        easyBtn.setOnAction(e -> {
            difficulty=Difficulty.EASY;
            Entername();

        });
        mediumBtn.setOnAction(e -> {
            difficulty=Difficulty.MEDIUM;
            Entername();
        });
        hardtBtn.setOnAction(e -> {
            difficulty=Difficulty.HARD;
            Entername();

        });
        root.getChildren().addAll(hardtBtn,easyBtn,mediumBtn,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

    }
    private static void showDifficultyfirst(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/difficulty.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );

        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button easyBtn = new Button();
        easyBtn.setLayoutX(305); // adjust based on image
        easyBtn.setLayoutY(205); // adjust based on image
        easyBtn.setPrefSize(200, 60);
        easyBtn.setStyle("-fx-background-color: transparent;");

        Button mediumBtn = new Button();
        mediumBtn.setLayoutX(305); // adjust based on image
        mediumBtn.setLayoutY(300); // adjust based on image
        mediumBtn.setPrefSize(200, 60);
        mediumBtn.setStyle("-fx-background-color: transparent;");

        Button hardtBtn = new Button();
        hardtBtn.setLayoutX(305); // adjust based on image
        hardtBtn.setLayoutY(385); // adjust based on image
        hardtBtn.setPrefSize(200, 60);
        hardtBtn.setStyle("-fx-background-color: transparent;");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {showCharacterAndDifficultyScene();});

        easyBtn.setOnAction(e -> {
            difficulty=Difficulty.EASY;
            showCharactersecond();

        });
        mediumBtn.setOnAction(e -> {
            difficulty=Difficulty.MEDIUM;
            showCharactersecond();

        });
        hardtBtn.setOnAction(e -> {
            difficulty=Difficulty.HARD;
            showCharactersecond();

        });
        root.getChildren().addAll(hardtBtn,easyBtn,mediumBtn,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

    }
    private static void showCharacterfirst(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/5 Select Character.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.CYAN);
        shadow.setRadius(20);
        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        // Continue Button over image's "Continue" label
        Button FemaleBtn = new Button();
        FemaleBtn.setLayoutX(97); // adjust based on image
        FemaleBtn.setLayoutY(140); // adjust based on image
        FemaleBtn.setPrefSize(250, 380);
        FemaleBtn.setStyle("-fx-background-color: rgba(255, 255, 255, 0); -fx-border-color: transparent;");

        Button maleBtn = new Button();
        maleBtn.setLayoutX(450); // adjust based on image
        maleBtn.setLayoutY(140); // adjust based on image
        maleBtn.setPrefSize(250, 380);
        maleBtn.setStyle("-fx-background-color: rgba(255, 255, 255, 0); -fx-border-color: transparent;");;
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {showCharacterAndDifficultyScene();});



        maleBtn.setOnMouseEntered( e -> maleBtn.setEffect(shadow) );
        maleBtn.setOnMouseExited(e -> maleBtn.setEffect(null));
        maleBtn.setOnAction(e -> {
            showDifficultysecond();
            gender=true;

        });
        FemaleBtn.setOnMouseEntered( e -> FemaleBtn.setEffect(shadow) );
        FemaleBtn.setOnMouseExited(e -> FemaleBtn.setEffect(null));
        FemaleBtn.setOnAction(e -> {
            showDifficultysecond();
        });

        root.getChildren().addAll(FemaleBtn,maleBtn,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

    }
    private static void showCharactersecond(){

            Image bgImage = new Image(SceneManager.class.getResource("/images/5 Select Character.jpg").toExternalForm());
            BackgroundImage backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );

        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        Button FemaleBtn = new Button();
        FemaleBtn.setLayoutX(97); // adjust based on image
        FemaleBtn.setLayoutY(140); // adjust based on image
        FemaleBtn.setPrefSize(250, 380);
        FemaleBtn.setStyle("-fx-background-color: rgba(255, 255, 255, 0); -fx-border-color: transparent;");

        Button maleBtn = new Button();
        maleBtn.setLayoutX(450); // adjust based on image
        maleBtn.setLayoutY(140); // adjust based on image
        maleBtn.setPrefSize(250, 380);
        maleBtn.setStyle("-fx-background-color: rgba(255, 255, 255, 0); -fx-border-color: transparent;");;
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> {showDifficultyfirst();});



        maleBtn.setOnAction(e -> {
            Entername();
            gender=true;

        });
        FemaleBtn.setOnAction(e -> {

            Entername();
        });

        root.getChildren().addAll(FemaleBtn,maleBtn,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

    }
    private static void Entername(){
        Image bgImage = new Image(SceneManager.class.getResource("/images/enter name.jpg").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 600, false, false, false, false)
        );

        Pane root = new Pane();
        root.setBackground(new Background(backgroundImage));
        root.setPrefSize(800, 600);

        TextField nameField = new TextField();
        nameField.setPromptText("Enter Name");
        nameField.setLayoutX(290);
        nameField.setLayoutY(300);
        nameField.setPrefWidth(240);
        nameField.setPrefHeight(60);
        nameField.setStyle("-fx-background-color: transparent;");

        // Continue Button over image's "Continue" label
        Button SubmitBtn = new Button();
        SubmitBtn.setLayoutX(350); // adjust based on image
        SubmitBtn.setLayoutY(430); // adjust based on image
        SubmitBtn.setPrefSize(100, 40);
        SubmitBtn.setStyle("-fx-background-color: transparent;");
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e -> showCharactersecond());


        SubmitBtn.setOnAction(e -> {
            String name = nameField.getText();
            player = new Player(name);
            setupGame();
            showNextLocation();
            startFchallange();
        });

        root.getChildren().addAll(SubmitBtn,nameField,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

    }
    public static void showscore(){
        BackgroundImage backgroundImage;
        if(player.getScore() == 0){
            Image bgImage = new Image(SceneManager.class.getResource("/images/zero score.jpg").toExternalForm());
            backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );} else if (player.getScore() > 10 && player.getScore() < 20 ) {
            Image bgImage = new Image(SceneManager.class.getResource("/images/average score.jpg").toExternalForm());
            backgroundImage = new BackgroundImage(
                    bgImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(800, 600, false, false, false, false)
            );
        }
        else {
            Image bgImage = new Image(SceneManager.class.getResource("/images/full score.jpg").toExternalForm());
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

        Label label=new Label((String.valueOf(player.getScore())));
        label.setLayoutX(350);
        label.setLayoutY(500);
        label.setStyle("-fx-background-color: #d0c9c9;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");

        // Continue Button over image's "Continue" label
        Button backButton = new Button("\uD83E\uDC14");
        backButton.setLayoutX(0); // X-position of "START" button in the image
        backButton.setLayoutY(0); // Y-position of "START" button in the image
        backButton.setPrefSize(75, 50); // Width and height matching image "START" button
        backButton.setStyle( "-fx-background-color: #894b12;" +    // background color
                "-fx-text-fill: white;" +              // text color (white)
                "-fx-font-weight: bold;" +             // bold text
                "-fx-font-size: 22px;");
        backButton.setOnAction(e->showGameOver());


        root.getChildren().addAll(label,backButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }




}