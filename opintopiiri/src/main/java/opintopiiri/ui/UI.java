package opintopiiri.ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opintopiiri.dao.UserDao;
import opintopiiri.domain.Functions;
import opintopiiri.domain.User;
import opintopiiri.dao.Quiz1;
import opintopiiri.dao.Quiz2;

/**
 * UI builds the user interface and uses Functions method to do wanted functions
 *
 * @author ksani
 */
public class UI extends Application {

    Functions functions = new Functions(this);
    UserDao userdao;
    Quiz1 quiz1;
    Quiz2 quiz2;
    String username;
    String password;
    String answerTrimmed;
    private int i;

    /**
     * UI constructor
     */
    public UI() {

        this.userdao = new UserDao(new User(username, password));
        this.quiz1 = new Quiz1();
        this.quiz2 = new Quiz2();
        this.i = 0;

    }

    /**
     * Starts the user interface application and builds it method to call
     * resetH2 database left to make it easier to continue building the
     * application in the future
     *
     * @param stage
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void start(Stage stage) throws SQLException, ClassNotFoundException {
        //this.userdao.resetH2();
        stage.setTitle("Opintopiiri Sovellus");

        this.userdao.createConnection();

        Label usernameText = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordText = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");
        Label errorLabel = new Label("");

        GridPane login = new GridPane();
        login.setPrefSize(800, 500);
        login.setAlignment(Pos.CENTER);
        login.setVgap(25);
        login.setHgap(40);
        login.setPadding(new Insets(5, 5, 5, 5));

        login.add(usernameText, 0, 0);
        login.add(usernameField, 1, 0);
        login.add(passwordText, 0, 1);
        login.add(passwordField, 1, 1);
        login.add(loginButton, 1, 2);
        login.add(registerButton, 1, 3);
        login.add(errorLabel, 1, 4);

        Scene loginScene = new Scene(login);
        stage.setScene(loginScene);

        Label newUsernameText = new Label("New username:");
        TextField newUsernameField = new TextField();
        Label newPasswordText = new Label("New password:");
        PasswordField newPasswordField = new PasswordField();
        Button createNew = new Button("Create a new user");
        Button returnToLogin = new Button("Return to login screen");
        Label registerErrorLabel = new Label("");

        GridPane register = new GridPane();
        register.setPrefSize(800, 500);
        register.setAlignment(Pos.CENTER);
        register.setVgap(25);
        register.setHgap(40);
        register.setPadding(new Insets(5, 5, 5, 5));

        register.add(newUsernameText, 0, 0);
        register.add(newUsernameField, 1, 0);
        register.add(newPasswordText, 0, 1);
        register.add(newPasswordField, 1, 1);
        register.add(createNew, 1, 2);
        register.add(returnToLogin, 1, 3);
        register.add(registerErrorLabel, 1, 4);

        Scene registerScene = new Scene(register);

        Label gamemenutext = new Label("Choose a quiz to play or view stats");
        Button quiz1 = new Button("Quiz 1: Fish");
        Button quiz2 = new Button("Quiz 2: Dinosaurs");
        Button seeStats = new Button("See stats");
        Button quit = new Button("Quit");

        GridPane gamemenu = new GridPane();
        gamemenu.setPrefSize(800, 500);
        gamemenu.setAlignment(Pos.CENTER);
        gamemenu.setVgap(25);
        gamemenu.setHgap(40);
        gamemenu.setPadding(new Insets(5, 5, 5, 5));

        gamemenu.add(gamemenutext, 0, 0);
        gamemenu.add(quiz1, 1, 0);
        gamemenu.add(quiz2, 2, 0);
        gamemenu.add(seeStats, 4, 0);
        gamemenu.add(quit, 4, 1);

        Scene gamemenuScene = new Scene(gamemenu);

        Label gametext = new Label("Quiz 1: Fish " + "\n" + "Type in the answer in the box below");
        Label question = new Label("What kind of fish is Nemo in the movie 'Finding Nemo'?" + "\n" + "a:Tiger Shark " + "\n" + "b:Salmon " + "\n" + "c:Clownfish " + "\n" + "d: Goldfish");
        TextField answer = new TextField();
        Button next = new Button("Next");
        Label invalidAnswer = new Label("");

        GridPane game = new GridPane();
        game.setPrefSize(800, 500);
        game.setAlignment(Pos.CENTER);
        game.setVgap(25);
        game.setHgap(40);
        game.setPadding(new Insets(5, 5, 5, 5));

        game.add(gametext, 0, 0);
        game.add(question, 1, 0);
        game.add(answer, 1, 1);
        game.add(next, 2, 1);
        game.add(invalidAnswer, 1, 2);

        Scene gameScene = new Scene(game);

        Label gametext2 = new Label("Quiz 2: Dinosaurs " + "\n" + "Type in the answer in the box below");
        Label question2 = new Label("On which continent have the most dinosaur fossils been found?  " + "\n" + "a:Europe " + "\n" + "b:North America " + "\n" + "c:Africa " + "\n" + "d: Asia");
        TextField answer2 = new TextField();
        Button next2 = new Button("Next");
        Label invalidAnswer2 = new Label("");

        GridPane game2 = new GridPane();
        game2.setPrefSize(800, 500);
        game2.setAlignment(Pos.CENTER);
        game2.setVgap(25);
        game2.setHgap(40);
        game2.setPadding(new Insets(5, 5, 5, 5));

        game2.add(gametext2, 0, 0);
        game2.add(question2, 1, 0);
        game2.add(answer2, 1, 1);
        game2.add(next2, 2, 1);
        game2.add(invalidAnswer2, 1, 2);

        Scene gameScene2 = new Scene(game2);

        Label overtext = new Label("Game over!");
        Label percentage = new Label("");
        Button goBackToMenu = new Button("Go back to menu");

        GridPane gameover = new GridPane();
        gameover.setPrefSize(800, 500);
        gameover.setAlignment(Pos.CENTER);
        gameover.setVgap(25);
        gameover.setHgap(40);
        game.setPadding(new Insets(5, 5, 5, 5));

        gameover.add(overtext, 0, 0);
        gameover.add(percentage, 0, 1);
        gameover.add(goBackToMenu, 0, 2);

        Scene gameoverScene = new Scene(gameover);

        Label statsText = new Label("STATS");
        Label stats1 = new Label("You have played Quiz 1 " + this.functions.noOfTimesPlayed(1) + " times" + "\n" + "and your average score for Quiz 1 is " + this.functions.countAverage(1) + "");
        Label stats2 = new Label("You have played Quiz 2 " + this.functions.noOfTimesPlayed(2) + " times" + "\n" + "and your average score for Quiz 1 is " + this.functions.countAverage(2) + "");
        Button goBack2 = new Button("Return to menu");

        GridPane stats = new GridPane();
        stats.setPrefSize(800, 500);
        stats.setAlignment(Pos.CENTER);

        stats.add(statsText, 0, 0);
        stats.add(stats1, 0, 1);
        stats.add(stats2, 0, 2);
        stats.add(goBack2, 0, 4);

        Scene statsScene = new Scene(stats);

        loginButton.setOnAction((event) -> {
            try {
                username = usernameField.getText().trim();
                password = passwordField.getText().trim();
                if (!this.userdao.checkIfUserExists(username)) {
                    errorLabel.setText("No user with this username was found");
                } else {
                    if (this.userdao.checkIfUsernameMatchesPassword(username, password)) {
                        stage.setScene(gamemenuScene);
                    } else {
                        errorLabel.setText("Username and password don't match");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        registerButton.setOnAction((event) -> {
            stage.setScene(registerScene);
        });

        returnToLogin.setOnAction((event) -> {
            stage.setScene(loginScene);
        });

        createNew.setOnAction((event) -> {
            try {
                username = newUsernameField.getText().trim();
                password = newPasswordField.getText().trim();

                if (this.userdao.checkIfUserExists(username)) {
                    registerErrorLabel.setText("This username is already taken");

                } else {
                    this.userdao.addUser(new User(username, password));
                    registerErrorLabel.setText("New user created!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        quiz1.setOnAction((event) -> {
            stage.setScene(gameScene);
        });

        quiz2.setOnAction((event) -> {
            stage.setScene(gameScene2);
        });

        next.setOnAction((event) -> {
            question.setText(this.functions.getQ(1));
            answerTrimmed = answer.getText().trim().toLowerCase();
            if (!answerTrimmed.equals("a") && !answerTrimmed.equals("b") && !answerTrimmed.equals("c") && !answerTrimmed.equals("d")) {
                invalidAnswer.setText("Invalid answer" + "\n" + "No points given");
            } else {
                invalidAnswer.setText("");
            }
            if (answerTrimmed.equals(this.functions.getA(1))) {
                this.functions.increasePoints(1);
            }
            if (!this.functions.checkIfMoreQs()) {
                percentage.setText("You got " + this.functions.getPoints(1) + "/8 correct!");
                stage.setScene(gameoverScene);
                this.functions.addNoOfTimesPlayed(1);
                this.functions.addPoints(1);
            }
            answer.setText("");
        });

        next2.setOnAction((event) -> {
            question2.setText(this.functions.getQ(2));
            answerTrimmed = answer2.getText().trim().toLowerCase();
            if (!answerTrimmed.equals("a") && !answerTrimmed.equals("b") && !answerTrimmed.equals("c") && !answerTrimmed.equals("d")) {
                invalidAnswer2.setText("Invalid answer" + "\n" + "No points given");
            } else {
                invalidAnswer2.setText("");
            }
            if (answerTrimmed.equals(this.functions.getA(2))) {
                this.functions.increasePoints(2);
            }
            if (!this.functions.checkIfMoreQs()) {
                percentage.setText("You got " + this.functions.getPoints(2) + "/8 correct!");
                stage.setScene(gameoverScene);
                this.functions.addNoOfTimesPlayed(2);
                this.functions.addPoints(2);
                this.functions.countAverage(2);
            }
            answer2.setText("");
        });

        goBackToMenu.setOnAction((event) -> {
            this.functions.indexToZero();
            invalidAnswer.setText("");
            invalidAnswer2.setText("");
            question.setText("What kind of fish is Nemo in the movie 'Finding Nemo'?" + "\n" + "a:Tiger Shark " + "\n" + "b:Salmon " + "\n" + "c:Clownfish " + "\n" + "d: Goldfish");
            question2.setText("On which continent have the most dinosaur fossils been found?  " + "\n" + "a:Europe " + "\n" + "b:North America " + "\n" + "c:Africa " + "\n" + "d: Asia");
            stage.setScene(gamemenuScene);

        });

        seeStats.setOnAction((event) -> {
            stats1.setText("You have played Quiz 1 " + this.functions.noOfTimesPlayed(1) + " times" + "\n" + "and your average score for Quiz 1 is " + this.functions.countAverage(1));
            stats2.setText("\n" + "You have played Quiz 2 " + this.functions.noOfTimesPlayed(2) + " times" + "\n" + "and your average score for Quiz 2 is " + this.functions.countAverage(2));
            stage.setScene(statsScene);
        });
        goBack2.setOnAction((event) -> {
            stage.setScene(gamemenuScene);
        });

        quit.setOnAction((event) -> {
            stage.close();
        });

        stage.show();

    }

    /**
     * launches main method
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
